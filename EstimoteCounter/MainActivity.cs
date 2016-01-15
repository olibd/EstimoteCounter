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
		LeDevicesListAdapter _adapter;
		int count = 0;

		protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);

			// Get our button from the layout resource,
			// and attach an event to it
			Button button = FindViewById<Button> (Resource.Id.myButton);

			_findAllBeacons = new FindAllBeacons(this);
			_findAllBeacons.BeaconsFound += NewBeaconsFound;
			_adapter = new LeDevicesListAdapter(this);
			
			button.Click += delegate {
				LookForBeacons();
				button.Text = string.Format ("{0} Estimote iBeacons detected! Tap to retry.", count);
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

		void NewBeaconsFound(object sender, BeaconsFoundEventArgs e)
		{
			_adapter.Update(e.Beacons);
			_findAllBeacons.Stop();

			count = _adapter.Count;
		}
	}
}
