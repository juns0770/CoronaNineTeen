package kr.jibhyeonjeon.covid19.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.Common.ButtonChangeActivity;
import kr.jibhyeonjeon.covid19.Domestic.Domestic;
import kr.jibhyeonjeon.covid19.R;

public class DomesticAreaActivity extends Activity {

    Domestic cDomestic;

    ButtonChangeActivity cButtonChangeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cDomestic = new Domestic(this);
        cButtonChangeActivity = new ButtonChangeActivity(this);

    }

    public void OnClick(View view) {
        cButtonChangeActivity.setButtonChangeActivity(view);
    }

}
