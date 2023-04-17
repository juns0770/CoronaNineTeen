package kr.jibhyeonjeon.covid19.Common;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import kr.jibhyeonjeon.covid19.Activity.DomesticAreaActivity;
import kr.jibhyeonjeon.covid19.Activity.EmergencyCallActivity;
import kr.jibhyeonjeon.covid19.Activity.MainActivity;
import kr.jibhyeonjeon.covid19.Activity.PosterActivity;
import kr.jibhyeonjeon.covid19.Activity.WorldAreaActivity;
import kr.jibhyeonjeon.covid19.R;

public class ButtonChangeActivity {

    Activity aButtonChangeActivity;
    Intent intent;
    Button newActivity;
    Button DomesticArea;
    Button WorldArea;
    Button Emergency;
    Button Poster;

    public ButtonChangeActivity(Activity activity) {
        aButtonChangeActivity = activity;
        System.out.println("결과 : " + getRunActivity(activity));
        newActivity = (Button)aButtonChangeActivity.findViewById(R.id.btn_nowActivity);
        DomesticArea = (Button)aButtonChangeActivity.findViewById(R.id.btn_DomesticArea);
        WorldArea = (Button)aButtonChangeActivity.findViewById(R.id.btn_WorldArea);
        Emergency = (Button)aButtonChangeActivity.findViewById(R.id.btn_Emergency);
        Poster = (Button)aButtonChangeActivity.findViewById(R.id.btn_Poster);
    }

    public void setButtonChangeActivity(View view){
        switch(view.getId()) {
            case R.id.btn_nowActivity:
                if(!getRunActivity(aButtonChangeActivity).equals("kr.jibhyeonjeon.covid19.Activity.MainActivity")){
                    intent = new Intent(aButtonChangeActivity , MainActivity.class);
                    aButtonChangeActivity.startActivity(intent);
                    aButtonChangeActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    aButtonChangeActivity.finish();
                }
                break;
            case R.id.btn_WorldArea:
                if(!getRunActivity(aButtonChangeActivity).equals("kr.jibhyeonjeon.covid19.Activity.WorldAreaActivity")) {
                    intent = new Intent(aButtonChangeActivity, WorldAreaActivity.class);
                    aButtonChangeActivity.startActivity(intent);
                    aButtonChangeActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    aButtonChangeActivity.finish();
                }
                break;
            case R.id.btn_DomesticArea:
                if(!getRunActivity(aButtonChangeActivity).equals("kr.jibhyeonjeon.covid19.Activity.DomesticAreaActivity")) {
                    intent = new Intent(aButtonChangeActivity, DomesticAreaActivity.class);
                    aButtonChangeActivity.startActivity(intent);
                    aButtonChangeActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    aButtonChangeActivity.finish();
                }
                break;
            case R.id.btn_Emergency:
                if(!getRunActivity(aButtonChangeActivity).equals("kr.jibhyeonjeon.covid19.Activity.EmergencyCallActivity")) {
                    intent = new Intent(aButtonChangeActivity, EmergencyCallActivity.class);
                    aButtonChangeActivity.startActivity(intent);
                    aButtonChangeActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    aButtonChangeActivity.finish();
                }
                break;
            case R.id.btn_Poster:
                if(!getRunActivity(aButtonChangeActivity).equals("kr.jibhyeonjeon.covid19.Activity.PosterActivity")) {
                    intent = new Intent(aButtonChangeActivity, PosterActivity.class);
                    aButtonChangeActivity.startActivity(intent);
                    aButtonChangeActivity.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    aButtonChangeActivity.finish();
                }
                break;
        }
    }

    @SuppressLint("WrongConstant")
    public String getRunActivity(Context context){
        return ( ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
    }

}
