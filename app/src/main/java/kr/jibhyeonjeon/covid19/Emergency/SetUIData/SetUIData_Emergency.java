package kr.jibhyeonjeon.covid19.Emergency.SetUIData;

import android.app.Activity;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.R;

public class SetUIData_Emergency {

    Activity aSetUIData_Emergency;

    public SetUIData_Emergency(Activity activity) {
        aSetUIData_Emergency = activity;
    }

    public void ButtonImSet(){
        Button WorldArea = (Button)aSetUIData_Emergency.findViewById(R.id.Emergency);
        WorldArea.setBackgroundResource(R.mipmap.page4button1);
    }

}
