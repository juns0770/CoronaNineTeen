package kr.jibhyeonjeon.covid19.API.Thread;

import android.app.Activity;
import android.os.Handler;
import android.widget.TextView;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.DataSet.DataSet_Domestic;
import kr.jibhyeonjeon.covid19.R;

public class Thread_Domestic extends Thread{
    Activity aThread_Domestic;
    Handler handler;

    DataSet_Domestic cDataSet_Domestic;

    public Thread_Domestic(Activity activity) {
        aThread_Domestic = activity;
        handler = new Handler();
        cDataSet_Domestic = new DataSet_Domestic(aThread_Domestic);
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
                        cDataSet_Domestic.getData_Domestic();


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
                if(DefineAPIDataSet.ins().sDomesticUpdateTime.equals("") ||
                   DefineAPIDataSet.ins().sDomesticQuarantine.equals("") ||
                   DefineAPIDataSet.ins().sDomesticReleased.equals("") ||
                   DefineAPIDataSet.ins().sDomesticDeath.equals("") ||
                   DefineAPIDataSet.ins().sDomesticConfirmedCases.equals("") ||
                   DefineAPIDataSet.ins().sDomesticCompareConfirmedCases.equals("") ||
                   DefineAPIDataSet.ins().sDomesticReleased.equals("")) {
                    //!<  ||DefineAPIDataSet.ins().sDomesticTotalExamination.equals("") 전일대비 사망자수 방법 갈구 완료 후 추가
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
