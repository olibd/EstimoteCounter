package md5f19383227dc58d703dc0ef6a25d9106a;


public class QuickAction
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.PopupWindow.OnDismissListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:()V:GetOnDismissHandler:Android.Widget.PopupWindow/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Estimotes.Droid.QuickAction, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", QuickAction.class, __md_methods);
	}


	public QuickAction () throws java.lang.Throwable
	{
		super ();
		if (getClass () == QuickAction.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.QuickAction, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public QuickAction (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == QuickAction.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.QuickAction, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	public QuickAction (android.content.Context p0, int p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == QuickAction.class)
			mono.android.TypeManager.Activate ("Estimotes.Droid.QuickAction, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Estimotes.Droid.QuickActionLayout, Estimotes.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
	}


	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
