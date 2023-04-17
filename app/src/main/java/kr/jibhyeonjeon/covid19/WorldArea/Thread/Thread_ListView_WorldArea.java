package kr.jibhyeonjeon.covid19.WorldArea.Thread;

import android.app.Activity;
import android.os.Handler;

import kr.jibhyeonjeon.covid19.WorldArea.ListView.WorldAreaListView;

public class Thread_ListView_WorldArea extends Thread{
    Activity aThread_ListView_WorldArea;
    Handler handler;
    WorldAreaListView cWorldAreaListView;
    public Thread_ListView_WorldArea(Activity activity) {
        aThread_ListView_WorldArea = activity;
        handler = new Handler();
        cWorldAreaListView = new WorldAreaListView(aThread_ListView_WorldArea);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread_ListView_WorldArea 쓰레드 진입");
                        cWorldAreaListView.setWorldAreaListView();

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
                //if(DefineAPIDataSet.ins().lstDomesticArea_Seoul.size() <= 0) {
                Thread.sleep(3000);
                //}
                //else {
                //  Thread.sleep(30000);
                //}


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
