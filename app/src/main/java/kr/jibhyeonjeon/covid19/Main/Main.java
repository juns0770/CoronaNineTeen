package kr.jibhyeonjeon.covid19.Main;

import android.app.Activity;

import kr.jibhyeonjeon.covid19.Main.Thread.Thread_UI_Main;

public class Main {
    Activity aMain;
    Thread_UI_Main cThread_UI_Main;
    public Main(Activity activity) {
        aMain = activity;
        cThread_UI_Main = new Thread_UI_Main(aMain);
        cThread_UI_Main.start();
    }
}
