package md5f19383227dc58d703dc0ef6a25d9106a;


public class FindSpecificBeacon
	extends md5f19383227dc58d703dc0ef6a25d9106a.BeaconFinder
	implements
		mono.android.IGCUserPeer,
		com.estimote.sdk.BeaconManager.RangingListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onBeaconsDiscovered:(Lcom/estimote/sdk/Region;Ljava/util/List;)V:GetOnBeaconsDiscovered_Lcom_estimote_sdk_Region_Ljava_util_List_Handler:EstimoteSdk.BeaconManager/IRangingListenerInvoker, Xamarin.Estimote.Android\n" +
			"";
		mono.android.Runtime.register ("Estimotes.Droid.FindSpecificBeacon, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FindSpecificBeacon.class, __md_methods);
	}


	public FindSpecificBeacon () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindSpecificBeacon.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindSpecificBeacon, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FindSpecificBeacon (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindSpecificBeacon.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindSpecificBeacon, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onBeaconsDiscovered (com.estimote.sdk.Region p0, java.util.List p1)
	{
		n_onBeaconsDiscovered (p0, p1);
	}

	private native void n_onBeaconsDiscovered (com.estimote.sdk.Region p0, java.util.List p1);

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
