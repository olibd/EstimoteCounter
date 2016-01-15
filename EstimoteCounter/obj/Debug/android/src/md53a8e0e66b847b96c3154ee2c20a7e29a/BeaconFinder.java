package md53a8e0e66b847b96c3154ee2c20a7e29a;


public abstract class BeaconFinder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.estimote.sdk.BeaconManager.ServiceReadyCallback
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onServiceReady:()V:GetOnServiceReadyHandler:EstimoteSdk.BeaconManager/IServiceReadyCallbackInvoker, Xamarin.Estimote.Android\n" +
			"";
		mono.android.Runtime.register ("Estimotes.Droid.BeaconFinder, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BeaconFinder.class, __md_methods);
	}


	public BeaconFinder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BeaconFinder.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.BeaconFinder, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public BeaconFinder (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == BeaconFinder.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.BeaconFinder, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onServiceReady ()
	{
		n_onServiceReady ();
	}

	private native void n_onServiceReady ();

	java.util.ArrayList refList;
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
