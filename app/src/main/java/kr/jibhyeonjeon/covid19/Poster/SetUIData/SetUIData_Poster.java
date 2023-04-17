package kr.jibhyeonjeon.covid19.Poster.SetUIData;

import android.app.Activity;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.R;

public class SetUIData_Poster {

    Activity aSetUIData_Poster;

    public SetUIData_Poster(Activity activity) {
        aSetUIData_Poster = activity;
    }

    public void ButtonImSet(){
        Button Poster = (Button)aSetUIData_Poster.findViewById(R.id.btn_Poster);
        Poster.setBackgroundResource(R.mipmap.page5button1);
    }

}
