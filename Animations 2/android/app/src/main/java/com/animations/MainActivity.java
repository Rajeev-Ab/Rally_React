package com.animations;

import android.os.Bundle;
import android.content.Intent;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "Animations";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //checkAndRequestPermissions();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }

  //   private void checkAndRequestPermissions() {
  //     int sdkVersion = 21;//Build.VERSION.SDK_INT;
  //     if (sdkVersion >= Build.VERSION_CODES.M) {
  //         if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
  //                 != PackageManager.PERMISSION_GRANTED
  //                 || ActivityCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
  //                 != PackageManager.PERMISSION_GRANTED
  //                 || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_NETWORK_STATE)
  //                 != PackageManager.PERMISSION_GRANTED
  //                 || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
  //                 != PackageManager.PERMISSION_GRANTED
  //                 || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_LOCATION)
  //                 != PackageManager.PERMISSION_GRANTED
  //                 ) {
  //             ActivityCompat.requestPermissions(this,
  //                     new String[]{Manifest.permission.RECORD_AUDIO,
  //                             Manifest.permission.INTERNET,
  //                             Manifest.permission.ACCESS_NETWORK_STATE,
  //                             Manifest.permission.READ_PHONE_STATE,
  //                             Manifest.permission.ACCESS_FINE_LOCATION,
  //                               Manifest.permission.ACCESS_LOCATION
  //                     },
  //                     1);
  //         }
  //     }
  // }


}
