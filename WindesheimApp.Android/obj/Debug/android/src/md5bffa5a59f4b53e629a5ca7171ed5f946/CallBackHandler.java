package md5bffa5a59f4b53e629a5ca7171ed5f946;


public class CallBackHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.accounts.AccountManagerCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:(Landroid/accounts/AccountManagerFuture;)V:GetRun_Landroid_accounts_AccountManagerFuture_Handler:Android.Accounts.IAccountManagerCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Microsoft.IdentityModel.Clients.ActiveDirectory.CallBackHandler, Microsoft.IdentityModel.Clients.ActiveDirectory, Version=3.17.2.31801, Culture=neutral, PublicKeyToken=31bf3856ad364e35", CallBackHandler.class, __md_methods);
	}


	public CallBackHandler ()
	{
		super ();
		if (getClass () == CallBackHandler.class)
			mono.android.TypeManager.Activate ("Microsoft.IdentityModel.Clients.ActiveDirectory.CallBackHandler, Microsoft.IdentityModel.Clients.ActiveDirectory, Version=3.17.2.31801, Culture=neutral, PublicKeyToken=31bf3856ad364e35", "", this, new java.lang.Object[] {  });
	}


	public void run (android.accounts.AccountManagerFuture p0)
	{
		n_run (p0);
	}

	private native void n_run (android.accounts.AccountManagerFuture p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
