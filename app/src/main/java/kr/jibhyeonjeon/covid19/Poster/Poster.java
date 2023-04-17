package kr.jibhyeonjeon.covid19.Poster;

import android.app.Activity;

import kr.jibhyeonjeon.covid19.Poster.SetUIData.SetUIData_Poster;

public class Poster {

    Activity aPoster;
    SetUIData_Poster cSetUIData_Poster;

    public Poster(Activity activity){
        aPoster = activity;

        cSetUIData_Poster = new SetUIData_Poster(aPoster);
        cSetUIData_Poster.ButtonImSet();
    }

}
