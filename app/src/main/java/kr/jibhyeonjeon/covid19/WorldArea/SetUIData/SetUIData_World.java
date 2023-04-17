package kr.jibhyeonjeon.covid19.WorldArea.SetUIData;

import android.app.Activity;
import android.widget.Button;

import kr.jibhyeonjeon.covid19.R;

public class SetUIData_World {

    Activity aSetUIData_World;

    public SetUIData_World(Activity activity) {
        aSetUIData_World = activity;
    }

    public void ButtonImSet(){
        Button WorldArea = (Button)aSetUIData_World.findViewById(R.id.WorldArea);
        WorldArea.setBackgroundResource(R.mipmap.page3button1);
    }

}
