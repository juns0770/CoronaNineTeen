package kr.jibhyeonjeon.covid19.Domestic.Thread;

import android.app.Activity;
import android.os.Handler;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.Domestic.ListView.DomesticAreaListView;

public class Thread_ListView_Domestic extends Thread{

    Handler handler;
    Activity aThread_ListView_Domestic;
    DomesticAreaListView cDomesticAreaListView;
    public Thread_ListView_Domestic(Activity activity) {
        aThread_ListView_Domestic = activity;
        handler = new Handler();
        cDomesticAreaListView = new DomesticAreaListView(aThread_ListView_Domestic);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread_ListView_Domestic 쓰레드 진입");
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Seoul);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Busan);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Daegu);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Incheon);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Gwangju);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Daejeon);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Ulsan);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Sejong);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Gangwon);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Chungbuk);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Chungnam);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Jeonnam);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Jeju);
//                        System.out.println(DefineAPIDataSet.ins().lstDomesticArea_Quarantine);

                        //if(DefineAPIDataSet.ins().lstDomesticArea_Seoul.size() > 0) {
                            cDomesticAreaListView.setDomesticListView();
                        //}



                    }catch (OutOfMemoryError e) {
                        System.out.println("Memory leak");
                    }catch (Exception e) {

                    }
                }
            });

            try {

                /**
                 * Thread 시간 예외처리
                 * 값이 들어오지 않을경우 1초마다 호출
                 * 값을 전부 받아오면 10분단위로 타이머 변경
                 */
                if(DefineAPIDataSet.ins().lstDomesticArea_Seoul.size() <= 0) {
                    Thread.sleep(1000);
                }
                else {
                   Thread.sleep(30000);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
