using Android.App;
using Android.Widget;
using Android.OS;
using EstimoteSdk;
using Android.Content;
using Android.Bluetooth;
using Estimotes.Droid;
using Android.Views;

namespace EstimoteCounter
{
	[Activity (Label = "EstimoteCounter", MainLauncher = true, Icon = "@mipmap/icon")]
	public class MainActivity : Activity
	{
		const int REQUEST_ENABLE_BLUETOOTH = 123321;

		FindAllBeacons _findAllBeacons;
		int count = 1;

		protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);

			// Get our button from the layout resource,
			// and attach an event to it
			Button button = FindViewById<Button> (Resource.Id.myButton);
			
			button.Click += delegate {
				button.Text = string.Format ("{0} clicks!", count++);
			};

		}

		void LookForBeacons()
		{
			if (!_findAllBeacons.IsBluetoothEnabled)
			{
				Intent enableBtIntent = new Intent(BluetoothAdapter.ActionRequestEnable);
				StartActivityForResult(enableBtIntent, REQUEST_ENABLE_BLUETOOTH);
			}
			else
			{
				_findAllBeacons.FindBeacons();
			}
		}
	}
}
