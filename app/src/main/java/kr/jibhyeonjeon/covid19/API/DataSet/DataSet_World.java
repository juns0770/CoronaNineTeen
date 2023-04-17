package kr.jibhyeonjeon.covid19.API.DataSet;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.Common.DefineAPIURL;

public class DataSet_World {

    Activity aDataSet_World;
    RequestQueue rQueue;

    DecimalFormat decimalFormat;
    public DataSet_World(Activity activity) {
        aDataSet_World = activity;
        rQueue = Volley.newRequestQueue(aDataSet_World);
        decimalFormat = new DecimalFormat("#.##");
    }

    public void getData_World() {
        System.out.println("getData_World 진입");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(DefineAPIURL.ins().sURL_World, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{

                    /**
                     * API 값 저장
                     */
                    DefineAPIDataSet.ins().sWorldConfirmedCases = response.get("cases").toString();
                    DefineAPIDataSet.ins().sWorldDeath = response.get("deaths").toString();
                    DefineAPIDataSet.ins().sWorldReleased = response.get("recovered").toString();

                    //!< 치사율 공식
                    //!< 사망자수 / 확진자수 * 100
                    DefineAPIDataSet.ins().sWorldLethality = decimalFormat.format(Double.parseDouble(DefineAPIDataSet.ins().sWorldDeath) / Double.parseDouble(DefineAPIDataSet.ins().sWorldConfirmedCases) * 100);





                    /**
                     * 디버그
                     */
                    System.out.println("전세계 확진자 수 : " + DefineAPIDataSet.ins().sWorldConfirmedCases);
                    System.out.println("전세계 사망자 수 : " + DefineAPIDataSet.ins().sWorldDeath);
                    System.out.println("전세계 격리해제자 수 : " + DefineAPIDataSet.ins().sWorldReleased);
                    System.out.println("전세계 코로나 치사율 : " + DefineAPIDataSet.ins().sWorldLethality);


                    DefineAPIDataSet.ins().bCheckAPI_World = true;
                }catch (JSONException e) {
                    System.out.println("DataSet_World Error : "+e.toString());
                    DefineAPIDataSet.ins().bCheckAPI_World = false;
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPIDataSet.ins().bCheckAPI_World = false;
            }
        });
        rQueue.add(jsonObjectRequest);
    }
}
