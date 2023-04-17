package kr.jibhyeonjeon.covid19.WorldArea;

import android.app.Activity;

import kr.jibhyeonjeon.covid19.API.Thread.Thread_WorldArea;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.WorldAreaListView;
import kr.jibhyeonjeon.covid19.WorldArea.SetUIData.SetUIData_World;
import kr.jibhyeonjeon.covid19.WorldArea.Thread.Thread_ListView_WorldArea;

public class WorldArea {

    Activity aWorldArea;
    Thread_WorldArea cThread_WorldArea;
    Thread_ListView_WorldArea cThread_ListView_WorldArea;
    SetUIData_World cSetUIData_World;


    public WorldArea(Activity activity) {
        aWorldArea = activity;

        cThread_WorldArea = new Thread_WorldArea(aWorldArea);
        cThread_WorldArea.start();

        cThread_ListView_WorldArea = new Thread_ListView_WorldArea(aWorldArea);
        cThread_ListView_WorldArea.start();

        cSetUIData_World = new SetUIData_World(aWorldArea);
        cSetUIData_World.ButtonImSet();

    }
}
