package com.animations;

import android.app.Application;

//import de.siteof.rn.androidspeechrecognizer.RNAndroidSpeechRecognizerPackage;
//import com.wmjmc.reactspeech.VoicePackage;
import com.facebook.react.ReactApplication;
import ui.shine.RNShineButtonPackage;
import io.taptargetview.RNTapTargetViewPackage;
import ui.spruce.RNSprucePackage;
import ui.iconic.RNIconicPackage;
import com.remobile.localNotifications.RCTLocalNotificationsPackage;
import com.dieam.reactnativepushnotification.ReactNativePushNotificationPackage;
import com.github.wumke.RNLocalNotifications.RNLocalNotificationsPackage;
import com.bmustapha.reactlibrary.RNGeoFencePackage;
import ch.uepaa.p2pkit.reactnative.PPKReactBridgePackage;
import com.surialabs.rn.geofencing.GeoFencingPackage;
import com.mackentoch.beaconsandroid.BeaconsAndroidPackage;
import com.wenkesj.voice.VoicePackage;
import community.revteltech.nfc.NfcManagerPackage;
import com.sensormanager.SensorManagerPackage;
import com.zhangxiaoduo.rnsr.SpeechRecognitionPackage;
import cl.json.RNSharePackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import net.no_mad.tts.TextToSpeechPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.reactnativepayments.ReactNativePaymentsPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import com.facebook.FacebookSdk;
import com.facebook.CallbackManager;
import com.facebook.appevents.AppEventsLogger;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();
  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }


  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNShineButtonPackage(),
            new RNTapTargetViewPackage(),
            new RNSprucePackage(),
            new RNIconicPackage(),
            new RCTLocalNotificationsPackage(),
            new ReactNativePushNotificationPackage(),
            new RNLocalNotificationsPackage(),
            new RNGeoFencePackage(),
            new PPKReactBridgePackage(),
            new GeoFencingPackage(),
            new BeaconsAndroidPackage(),
            //new VoicePackage(),
            new NfcManagerPackage(),
            new SensorManagerPackage(),
            new SpeechRecognitionPackage(),
            new RNSharePackage(),
            new FBSDKPackage(mCallbackManager),
            new TextToSpeechPackage(),
            new MapsPackage(),
            new ReactNativePaymentsPackage(),
            new VectorIconsPackage(),
             new VoicePackage()
            
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    AppEventsLogger.activateApp(this);
    SoLoader.init(this, /* native exopackage */ false);
  }
}
