package kr.jibhyeonjeon.covid19.Activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import kr.jibhyeonjeon.covid19.Common.ButtonChangeActivity;
import kr.jibhyeonjeon.covid19.Emergency.Emergency;
import kr.jibhyeonjeon.covid19.Emergency.Intent.Intent_emergency_button;
import kr.jibhyeonjeon.covid19.Emergency.Permission.PermissionCall;
import kr.jibhyeonjeon.covid19.Emergency.SetUIData.SetUIData_Emergency;
import kr.jibhyeonjeon.covid19.R;

public class EmergencyCallActivity extends Activity {

    ButtonChangeActivity cButtonChangeActivity;
    Emergency cEmergency;
    PermissionCall cPermissionCall;
    SetUIData_Emergency cSetUIData_Emergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencycall_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cButtonChangeActivity = new ButtonChangeActivity(this);

        cEmergency = new Emergency(this);

        cSetUIData_Emergency = new SetUIData_Emergency(this);
        cSetUIData_Emergency.ButtonImSet();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        cPermissionCall.onPermissionResult(requestCode, permissions, grantResults);
    }

    public void onClick(View view){
        cEmergency.btnOnClick(view);
    }

    public void OnClick(View view) {
        cButtonChangeActivity.setButtonChangeActivity(view);
    }

}
