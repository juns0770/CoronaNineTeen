package kr.jibhyeonjeon.covid19.Main.Thread;

import android.app.Activity;
import android.os.Handler;

import kr.jibhyeonjeon.covid19.Main.SetUIData.SetUIData;

public class Thread_UI_Main extends Thread{
    Handler handler;
    Activity aThread_UI_Main;
    SetUIData cSetUIData;
    public Thread_UI_Main(Activity activity) {
        aThread_UI_Main = activity;
        handler = new Handler();
        cSetUIData = new SetUIData(aThread_UI_Main);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread_UI_Main 쓰레드 진입");
                        cSetUIData.setUiData();


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
//                if() {
//                    Thread.sleep(1000);
//                }
//                else {
//                    Thread.sleep(30000);
//                }
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
