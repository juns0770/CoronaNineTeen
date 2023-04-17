package kr.jibhyeonjeon.covid19.API.Thread;

import android.app.Activity;
import android.os.Handler;
import android.widget.ListView;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.DataSet.DataSet_WorldArea;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.ListViewSort;

public class Thread_WorldArea extends Thread{
    Activity aThread_WorldArea;
    Handler handler;
    DataSet_WorldArea cDataSet_WorldArea;

    public Thread_WorldArea(Activity activity) {
        aThread_WorldArea = activity;
        handler = new Handler();
        cDataSet_WorldArea = new DataSet_WorldArea(aThread_WorldArea);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        cDataSet_WorldArea.getData_WorldArea();

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
                if(DefineAPIDataSet.ins().lstWorldArea.isEmpty()) {
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
