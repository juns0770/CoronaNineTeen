package kr.jibhyeonjeon.covid19.API.Thread;

import android.app.Activity;
import android.os.Handler;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.DataSet.DataSet_World;

public class Thread_World extends Thread{

    Activity aThread_World;
    Handler handler;
    DataSet_World cDataSet_World;
    public Thread_World(Activity activity) {
        aThread_World = activity;
        handler = new Handler();
        cDataSet_World = new DataSet_World(aThread_World);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread_Domestic 쓰레드 진입");
                        cDataSet_World.getData_World();


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
                if(DefineAPIDataSet.ins().sWorldConfirmedCases.equals("") ||
                   DefineAPIDataSet.ins().sWorldDeath.equals("") ||
                   DefineAPIDataSet.ins().sWorldReleased.equals("") ||
                   DefineAPIDataSet.ins().sWorldLethality.equals("") ){
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
