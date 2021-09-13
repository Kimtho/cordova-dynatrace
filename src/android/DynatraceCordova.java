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
import android.util.Log;
import java.util.ArrayList;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;

public class DynatraceCordova extends CordovaPlugin {

  private static final String LOG_TAG = "DynatraceCordova";
  private static CallbackContext subscribeCallbackContext = null;
  private static CallbackContext subscribeExitCallbackContext = null;
  private static JSONArray results = null;

  public DynatraceCordova() {
   
  }

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {


    if(action.equals("init"))
    {
      LOG.d(LOG_TAG, "init app");
        Dynatrace.applyUserPrivacyOptions(UserPrivacyOptions.builder()
        .withDataCollectionLevel(DataCollectionLevel.USER_BEHAVIOR)
        .withCrashReportingOptedIn(true)
        .build()); 
    }

    else {
      return false;
    }

    return true;
  }
}