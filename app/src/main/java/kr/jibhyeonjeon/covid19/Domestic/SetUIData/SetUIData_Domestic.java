package kr.jibhyeonjeon.covid19.Domestic.SetUIData;

import android.app.Activity;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.R;

public class SetUIData_Domestic {

    Activity aSetUIData_Domestic;

    public SetUIData_Domestic(Activity activity) {
        aSetUIData_Domestic = activity;
    }

    public void ButtonImSet(){
        Button DomesticArea = (Button)aSetUIData_Domestic.findViewById(R.id.btn_DomesticArea);
        DomesticArea.setBackgroundResource(R.mipmap.page2button1);
    }

}
