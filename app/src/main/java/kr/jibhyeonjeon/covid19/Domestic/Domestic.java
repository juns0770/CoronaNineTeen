package kr.jibhyeonjeon.covid19.Domestic;

import android.app.Activity;

import kr.jibhyeonjeon.covid19.API.Thread.Thread_DomesticArea;
import kr.jibhyeonjeon.covid19.Domestic.SetUIData.SetUIData_Domestic;
import kr.jibhyeonjeon.covid19.Domestic.Thread.Thread_ListView_Domestic;


public class Domestic {

    Thread_DomesticArea cThread_DomesticArea;
    Thread_ListView_Domestic cThread_ListView_Domestic;
    SetUIData_Domestic cSetUIData_Domestic;

    Activity aDomestic;
    public Domestic(Activity activity) {
        aDomestic = activity;
        cThread_ListView_Domestic = new Thread_ListView_Domestic(aDomestic);
        cThread_ListView_Domestic.start();

        cThread_DomesticArea = new Thread_DomesticArea(aDomestic);
        cThread_DomesticArea.start();

        cSetUIData_Domestic = new SetUIData_Domestic(aDomestic);
        cSetUIData_Domestic.ButtonImSet();

    }





}
