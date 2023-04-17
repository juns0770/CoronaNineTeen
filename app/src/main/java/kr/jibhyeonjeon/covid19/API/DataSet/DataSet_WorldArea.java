package kr.jibhyeonjeon.covid19.API.DataSet;

import android.app.Activity;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.Common.DefineAPIURL;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.ListDuplicate;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.ListViewSort;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.WorldAreaItem;
import kr.jibhyeonjeon.covid19.WorldArea.ListView.WorldAreaListView;

public class DataSet_WorldArea {

    Activity aDataSet_WorldArea;
    RequestQueue rQueue;

    ListViewSort cListViewSort;
    ListDuplicate cListDuplicate;

    public DataSet_WorldArea(Activity activity) {
        aDataSet_WorldArea = activity;
        rQueue = Volley.newRequestQueue(aDataSet_WorldArea);
        cListViewSort = new ListViewSort();
        cListDuplicate = new ListDuplicate();


    }

    public void getData_WorldArea() {
        System.out.println("getData_WorldArea 진입");
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(DefineAPIURL.ins().sURL_WorldArea, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    //!< 리스트 초기화
                    DefineAPIDataSet.ins().lstWorldArea.clear();

                    /**
                     * API 값 저장
                     */
                    for(int i = 0 ; i < response.length() ; i++) {
                       /**
                        * ArrayList를 여기에 선언한 이유는
                        * 객체를 DefineAPIDataSet.ins().lstWorldArea에 추가할 때 lstTemp의 실제 객체 목록이 삽입된다.
                        * 즉, 복사되지 않으므로 동일한 객체로 반복해서 사용할 경우 저장된 객체에 영향을 미치므로 값이 추가되지 않는 현상이 나타난다.
                        * 그러므로 한번 반복을 수행할 때마다 다시 객체를 생성해서 사용한다.
                        *
                        * 3년전쯤에 개고생을 한 기억이 있어서 자세하게 주석 남김
                        */
                        ArrayList<String> lstTemp = new ArrayList<String>();
                        lstTemp.add(response.getJSONObject(i).get("country").toString());
                        lstTemp.add(response.getJSONObject(i).get("cases").toString());
                        lstTemp.add(response.getJSONObject(i).get("todayCases").toString());
                        lstTemp.add(response.getJSONObject(i).get("deaths").toString());
                        lstTemp.add(response.getJSONObject(i).get("todayDeaths").toString());
                        lstTemp.add(response.getJSONObject(i).get("recovered").toString());
                        lstTemp.add(response.getJSONObject(i).get("active").toString());
                        DefineAPIDataSet.ins().lstWorldArea.add(lstTemp);
                    }

                    System.out.println("DefineAPIDataSet.ins().lstWorldArea 전 사이즈 : " + DefineAPIDataSet.ins().lstWorldArea.size());
                    System.out.println("DefineAPIDataSet.ins().lstWorldArea 우엉우엉 : " + DefineAPIDataSet.ins().lstWorldArea);
                    cListDuplicate.hsList();
                    cListViewSort.sortDoubleList();



                    /**
                     * 디버그
                     */
                    for(int i = 0 ; i < response.length() ; i++) {
                        System.out.println("lstWorldArea" + i + " : " + DefineAPIDataSet.ins().lstWorldArea.get(i));

                    }

                    DefineAPIDataSet.ins().bCheckAPI_WorldArea = true;
                } catch  (JSONException e){
                    System.out.println("DataSet_WorldArea Error : "+e.toString());
                    DefineAPIDataSet.ins().bCheckAPI_WorldArea = false;
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPIDataSet.ins().bCheckAPI_WorldArea = false;
            }
        });

        rQueue.add(jsonArrayRequest);

    }

}
