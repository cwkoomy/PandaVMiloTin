B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private kvs As KeyValueStore
	Private rp As RuntimePermissions
	Private shared As String
	Private SQL1 As SQL
	Private ListViewCertificates As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("CertificateLayout") 'Make sure you have a layout named CertificateLayout with a ListView named ListViewCertificates
    
	' Initialize kvs and other variables if not already initialized
	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
    
	' Call the API to get certificates
	GetCertificates
End Sub

Sub GetCertificates
	Dim JobGetCertificates As HttpJob
	JobGetCertificates.Initialize("JobGetCertificates", Me)
	Dim url As String = "https://service-testnet.maschain.com/api/certificate/get-certificate"
	JobGetCertificates.Download(url)
	JobGetCertificates.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetCertificates.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim jsonString As String = Job.GetString
		Log(jsonString)
        
		Dim parser As JSONParser
		parser.Initialize(jsonString)
        
		If Job.JobName = "JobGetCertificates" Then
			Dim root As Map = parser.NextObject
			Dim status As Int = root.Get("status")
            
			If status = 200 Then
				Dim results As List = root.Get("result")
                
				ListViewCertificates.Clear
                
				For Each result As Map In results
					Dim contract_address As String = result.Get("contract_address")
					Dim from_wallet As String = result.Get("from_wallet")
					Dim to_wallet As String = result.Get("to_wallet")
					Dim is_mint As Int = result.Get("is_mint")
					Dim blockNumber As Object = result.Get("blockNumber")
					Dim nft_token_id As Int = result.Get("nft_token_id")
					Dim transactionHash As Object = result.Get("transactionHash")
					Dim certificate_image_file As Object = result.Get("certificate_image_file")
					Dim certificate_file As String = result.Get("certificate_file")
					Dim created_at As String = result.Get("created_at")
                    
					' Populate the ListView with certificate data
					Dim item As String
					item = "Contract Address: " & contract_address & CRLF & _
                            "From Wallet: " & from_wallet & CRLF & _
                            "To Wallet: " & to_wallet & CRLF & _
                            "Is Mint: " & is_mint & CRLF & _
                            "Block Number: " & blockNumber & CRLF & _
                            "NFT Token ID: " & nft_token_id & CRLF & _
                            "Transaction Hash: " & transactionHash & CRLF & _
                            "Certificate Image File: " & certificate_image_file & CRLF & _
                            "Certificate File: " & certificate_file & CRLF & _
                            "Created At: " & created_at
                            
					ListViewCertificates.AddSingleLine(item)
				Next
			Else
				Log("Error: Status code is not 200")
			End If
		Else
			' Handle other job names or errors
			Log("Error: " & Job.ErrorMessage)
		End If
	Else
		' Handle the error
		Log("Error: " & Job.ErrorMessage)
	End If
    
	' Release the job
	Job.Release
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
