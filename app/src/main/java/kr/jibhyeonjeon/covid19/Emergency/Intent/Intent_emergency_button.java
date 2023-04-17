package kr.jibhyeonjeon.covid19.Emergency.Intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import kr.jibhyeonjeon.covid19.Activity.MainActivity;
import kr.jibhyeonjeon.covid19.R;

public class Intent_emergency_button {

    Activity aIntent_emergency_button;
    Intent intent;

    public Intent_emergency_button(Activity activity){
        aIntent_emergency_button = activity;
    }

    public void Button_Intent(View view){
        switch(view.getId()) {
            case R.id.btn_call:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1339"));
                aIntent_emergency_button.startActivity(intent);
                break;
            case R.id.btn_kakaoplue:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pf.kakao.com/_XrQxkM")); //>>kakaoplus://plusfriend/friend/@(id)/
                aIntent_emergency_button.startActivity(intent);
                break;
        }
    }



}
