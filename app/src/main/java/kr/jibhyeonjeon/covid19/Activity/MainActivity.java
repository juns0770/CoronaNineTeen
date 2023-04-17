package kr.jibhyeonjeon.covid19.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import kr.jibhyeonjeon.covid19.API.Thread.Thread_Domestic;
import kr.jibhyeonjeon.covid19.API.Thread.Thread_DomesticArea;
import kr.jibhyeonjeon.covid19.API.Thread.Thread_World;
import kr.jibhyeonjeon.covid19.API.Thread.Thread_WorldArea;
import kr.jibhyeonjeon.covid19.Common.ButtonChangeActivity;
import kr.jibhyeonjeon.covid19.Main.Main;
import kr.jibhyeonjeon.covid19.R;

public class MainActivity extends Activity {
    Main cMain;
    ButtonChangeActivity cButtonChangeActivity;

    Thread_Domestic cThread_Domestic;
    Thread_DomesticArea cThread_DomesticArea;
    Thread_World cThread_World;
    Thread_WorldArea cThread_WorldArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cMain = new Main(this);
        cButtonChangeActivity = new ButtonChangeActivity(this);

        cThread_Domestic = new Thread_Domestic(this);
        cThread_Domestic.start();

        cThread_DomesticArea = new Thread_DomesticArea(this);
        cThread_DomesticArea.start();

        cThread_World = new Thread_World(this);
        cThread_World.start();

        cThread_WorldArea = new Thread_WorldArea(this);
        cThread_WorldArea.start();



    }

    public void OnClick(View view) {
        cButtonChangeActivity.setButtonChangeActivity(view);
    }

}
