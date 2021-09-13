package dynatracecordova;


import android.content.Intent;
import android.view.View;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.LOG;

import java.util.ArrayList;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;

public class DynatraceCordova extends CordovaPlugin {

  private static final String LOG_TAG = "WebViewPlugin";
  private static CallbackContext subscribeCallbackContext = null;
  private static CallbackContext subscribeExitCallbackContext = null;
  private static JSONArray results = null;

  public DynatraceHeyday() {
    Dynatrace.applyUserPrivacyOptions(UserPrivacyOptions.builder()
    .withDataCollectionLevel(DataCollectionLevel.USER_BEHAVIOR)
    .withCrashReportingOptedIn(true)
    .build()); 
  }
}