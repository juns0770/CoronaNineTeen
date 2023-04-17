package kr.jibhyeonjeon.covid19.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.API.Thread.Thread_WorldArea;
import kr.jibhyeonjeon.covid19.Common.ButtonChangeActivity;
import kr.jibhyeonjeon.covid19.R;
import kr.jibhyeonjeon.covid19.WorldArea.WorldArea;

public class WorldAreaActivity extends Activity {

    ButtonChangeActivity cButtonChangeActivity;
    WorldArea cWorldArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldarea_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cButtonChangeActivity = new ButtonChangeActivity(this);
        cWorldArea = new WorldArea(this);

    }

    public void OnClick(View view) {
        cButtonChangeActivity.setButtonChangeActivity(view);
    }

}
