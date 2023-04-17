package kr.jibhyeonjeon.covid19.Emergency;

import android.app.Activity;
import android.view.View;

import kr.jibhyeonjeon.covid19.Emergency.Intent.Intent_emergency_button;
import kr.jibhyeonjeon.covid19.Emergency.Permission.PermissionCall;

public class Emergency {

    Activity aEmergency;

    PermissionCall cPermissionCall;

    Intent_emergency_button cIntent_emergency_button;

    public Emergency(Activity activity){
        aEmergency = activity;
        cPermissionCall = new PermissionCall(aEmergency);
        cIntent_emergency_button = new Intent_emergency_button(aEmergency);
    }

    public void btnOnClick(View view){
        cIntent_emergency_button.Button_Intent(view);
    }

}
