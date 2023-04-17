package kr.jibhyeonjeon.covid19.WorldArea.ListView;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import java.util.Collections;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.R;
import kr.jibhyeonjeon.covid19.WorldArea.Common.CountryFlags;
import kr.jibhyeonjeon.covid19.WorldArea.Common.CountryNameArrayList;
import kr.jibhyeonjeon.covid19.WorldArea.Common.DefineWorldArea;

public class WorldAreaListView {
    Activity aWorldAreaListView;
    ListView lvWorldArea;
    WorldAreaAdapter cWorldAreaAdapter;
    CountryNameArrayList cCountryNameArrayList;
    CountryFlags cCountryFlags;

    //[국가, 누적확진환자, 확진환자 전일대비, 누적사망자, 전일대비 사망자, 격리해제, 치료중(격리중)]
    static final int Countryname = 0;
    static final int Accumulateconfirmed = 1;
    static final int Confirmed = 2;
    static final int Accumulatedeath = 3;
    static final int Countrydeath = 4;
    static final int Countrynonisolation = 5;
    static final int Treatment = 6;


    public WorldAreaListView(Activity activity) {
        aWorldAreaListView = activity;
        lvWorldArea = (ListView) aWorldAreaListView.findViewById(R.id.lvWorldArea);
        cWorldAreaAdapter = new WorldAreaAdapter();
        lvWorldArea.setAdapter(cWorldAreaAdapter);
        cCountryNameArrayList = new CountryNameArrayList();
        cCountryFlags = new CountryFlags(aWorldAreaListView);
        System.out.println("lstConvertHangeul : " + DefineWorldArea.ins().lstConvertHangeul);
    }

    public void setWorldAreaListView() {
        cWorldAreaAdapter.clearWorldAreaItem();
        for(int i =0 ; i < DefineAPIDataSet.ins().lstWorldArea.size() ; i++) {
            cWorldAreaAdapter.addItem(cCountryFlags.setCountryFlags(DefineAPIDataSet.ins().lstWorldArea.get(i).get(Countryname)),
                    cCountryNameArrayList.setHangeulCountryName(DefineAPIDataSet.ins().lstWorldArea.get(i).get(Countryname)),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Accumulateconfirmed),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Confirmed),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Accumulatedeath),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Countrydeath),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Countrynonisolation),
                                      DefineAPIDataSet.ins().lstWorldArea.get(i).get(Treatment));
        }


        cWorldAreaAdapter.notifyDataSetChanged();

    }
}
