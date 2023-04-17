package kr.jibhyeonjeon.covid19.API.DataSet;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.Common.DefineAPIURL;

public class DataSet_DomesticArea {

    Activity aDataSet_DomesticArea;
    RequestQueue rQueue;
    public DataSet_DomesticArea(Activity activity) {
        aDataSet_DomesticArea = activity;
        rQueue = Volley.newRequestQueue(aDataSet_DomesticArea);
    }

    public void getData_DomesticArea() {
        System.out.println("getData_DomesticArea 진입");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(DefineAPIURL.ins().sURL_DomesticArea, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{

                    /**+
                     * API 값 저장
                     * 2차원 배열형식으로 리스트를 쓰면 소스코드는 상당히 짧아지나 정 지영씨가 이해가 힘들거 같으므로 노가다를 진행해보겠음
                     */

                    //!< 버퍼 리스트 초기화
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.clear();
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.clear();


                    //!< 서울
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_5").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_6").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Seoul.add(response.get("data1_7").toString());

                    //!< 부산
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Busan.add(response.get("data2_5").toString());

                    //!< 대구
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daegu.add(response.get("data3_5").toString());

                    //!< 인천
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Incheon.add(response.get("data4_5").toString());

                    //!< 광주
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju.add(response.get("data5_5").toString());

                    //!< 대전
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon.add(response.get("data6_5").toString());

                    //!< 울산
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan.add(response.get("data7_5").toString());

                    //!< 세종
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Sejong.add(response.get("data8_5").toString());

                    //!< 경기
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi.add(response.get("data9_5").toString());

                    //!< 강원
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon.add(response.get("data10_5").toString());

                    //!< 충북
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk.add(response.get("data11_5").toString());

                    //!< 충남
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam.add(response.get("data12_5").toString());

                    //!< 전북
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk.add(response.get("data13_5").toString());

                    //!< 전남
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam.add(response.get("data14_5").toString());

                    //!< 경북
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk.add(response.get("data15_5").toString());

                    //!< 경남
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam.add(response.get("data16_5").toString());

                    //!< 제주
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Jeju.add(response.get("data17_5").toString());

                    //!< 검역
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_0").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_1").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_2").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_3").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_4").toString());
                    DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine.add(response.get("data18_5").toString());

                    //!< 출력용 리스트 초기화
                    DefineAPIDataSet.ins().lstDomesticArea_Seoul.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Busan.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Daegu.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Incheon.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Gwangju.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Daejeon.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Ulsan.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Sejong.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Gangwon.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Chungnam.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Jeju.clear();
                    DefineAPIDataSet.ins().lstDomesticArea_Quarantine.clear();

                    //!< 버퍼리스트를 출력용 리스트로
                    DefineAPIDataSet.ins().lstDomesticArea_Seoul.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Seoul);
                    DefineAPIDataSet.ins().lstDomesticArea_Busan.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Busan);
                    DefineAPIDataSet.ins().lstDomesticArea_Daegu.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Daegu);
                    DefineAPIDataSet.ins().lstDomesticArea_Incheon.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Incheon);
                    DefineAPIDataSet.ins().lstDomesticArea_Gwangju.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Gwangju);
                    DefineAPIDataSet.ins().lstDomesticArea_Daejeon.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Daejeon);
                    DefineAPIDataSet.ins().lstDomesticArea_Ulsan.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Ulsan);
                    DefineAPIDataSet.ins().lstDomesticArea_Sejong.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Sejong);
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Gyeonggi);
                    DefineAPIDataSet.ins().lstDomesticArea_Gangwon.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Gangwon);
                    DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Chungbuk);
                    DefineAPIDataSet.ins().lstDomesticArea_Chungnam.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Chungnam);
                    DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Jeonbuk);
                    DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Jeonnam);
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongbuk);
                    DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Gyeongnam);
                    DefineAPIDataSet.ins().lstDomesticArea_Jeju.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Jeju);
                    DefineAPIDataSet.ins().lstDomesticArea_Quarantine.addAll(DefineAPIDataSet.ins().lstTempDomesticArea_Quarantine);

                    DefineAPIDataSet.ins().sDomesticCompareConfirmedCases = response.get("data0_1").toString();

                    /**
                     * 디버그
                     */
                    System.out.println("서울 : " + DefineAPIDataSet.ins().lstDomesticArea_Seoul);
                    System.out.println("부산 : " + DefineAPIDataSet.ins().lstDomesticArea_Busan);
                    System.out.println("대구 : " + DefineAPIDataSet.ins().lstDomesticArea_Daegu);
                    System.out.println("인천 : " + DefineAPIDataSet.ins().lstDomesticArea_Incheon);
                    System.out.println("광주 : " + DefineAPIDataSet.ins().lstDomesticArea_Gwangju);
                    System.out.println("대전 : " + DefineAPIDataSet.ins().lstDomesticArea_Daejeon);
                    System.out.println("울산 : " + DefineAPIDataSet.ins().lstDomesticArea_Ulsan);
                    System.out.println("세종 : " + DefineAPIDataSet.ins().lstDomesticArea_Sejong);
                    System.out.println("경기 : " + DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi);
                    System.out.println("강원 : " + DefineAPIDataSet.ins().lstDomesticArea_Gangwon);
                    System.out.println("충북 : " + DefineAPIDataSet.ins().lstDomesticArea_Chungbuk);
                    System.out.println("충남 : " + DefineAPIDataSet.ins().lstDomesticArea_Chungnam);
                    System.out.println("전북 : " + DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk);
                    System.out.println("전남 : " + DefineAPIDataSet.ins().lstDomesticArea_Jeonnam);
                    System.out.println("경북 : " + DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk);
                    System.out.println("경남 : " + DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam);
                    System.out.println("제주 : " + DefineAPIDataSet.ins().lstDomesticArea_Jeju);
                    System.out.println("검역 : " + DefineAPIDataSet.ins().lstDomesticArea_Quarantine);


                    DefineAPIDataSet.ins().bCheckAPI_DomesticArea = true;
                }catch (JSONException e) {
                    System.out.println("DataSet_DomesticArea Error : "+e.toString());
                    DefineAPIDataSet.ins().bCheckAPI_DomesticArea = false;
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPIDataSet.ins().bCheckAPI_DomesticArea = false;
            }
        });
        rQueue.add(jsonObjectRequest);
    }
}
