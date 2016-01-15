package md53a8e0e66b847b96c3154ee2c20a7e29a;


public class FindAllBeacons
	extends md53a8e0e66b847b96c3154ee2c20a7e29a.BeaconFinder
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Estimotes.Droid.FindAllBeacons, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FindAllBeacons.class, __md_methods);
	}


	public FindAllBeacons () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindAllBeacons.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindAllBeacons, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FindAllBeacons (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindAllBeacons.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindAllBeacons, EstimoteCounter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

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
