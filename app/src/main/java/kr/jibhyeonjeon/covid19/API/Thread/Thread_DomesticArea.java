package kr.jibhyeonjeon.covid19.API.Thread;

import android.app.Activity;
import android.os.Handler;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.DataSet.DataSet_DomesticArea;

public class Thread_DomesticArea extends Thread{
    Activity aThread_DomesticArea;
    Handler handler;
    DataSet_DomesticArea cDataSet_DomesticArea;
    public Thread_DomesticArea(Activity activity) {
        aThread_DomesticArea = activity;
        handler = new Handler();
        cDataSet_DomesticArea = new DataSet_DomesticArea(aThread_DomesticArea);

    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread_DomesticArea 쓰레드 진입");
                        cDataSet_DomesticArea.getData_DomesticArea();


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
                if(DefineAPIDataSet.ins().lstDomesticArea_Seoul.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Busan.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Daegu.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Incheon.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Gwangju.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Daejeon.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Ulsan.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Sejong.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Gangwon.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Chungnam.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Jeju.isEmpty() ||
                   DefineAPIDataSet.ins().lstDomesticArea_Quarantine.isEmpty() ) {
                    Thread.sleep(1000);
                }

                else {
                    Thread.sleep(60000);
                }
                

                


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
