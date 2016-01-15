package md5f19383227dc58d703dc0ef6a25d9106a;


public class FindAllBeacons
	extends md5f19383227dc58d703dc0ef6a25d9106a.BeaconFinder
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Estimotes.Droid.FindAllBeacons, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FindAllBeacons.class, __md_methods);
	}


	public FindAllBeacons () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindAllBeacons.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindAllBeacons, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FindAllBeacons (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == FindAllBeacons.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.FindAllBeacons, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
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
