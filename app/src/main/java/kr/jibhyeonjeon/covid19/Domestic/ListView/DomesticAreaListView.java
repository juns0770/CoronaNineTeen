package kr.jibhyeonjeon.covid19.Domestic.ListView;

import android.app.Activity;
import android.widget.ListView;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.R;

public class DomesticAreaListView {
    Activity aDomesticListView;
    ListView mListView;
    DomesticAreaAdapter cDomesticAdapter;
    public DomesticAreaListView(Activity activity) {
        aDomesticListView = activity;
        cDomesticAdapter = new DomesticAreaAdapter();
        mListView = (ListView) aDomesticListView.findViewById(R.id.lst_domestic);
        mListView.setAdapter(cDomesticAdapter);
    }

    public void setDomesticListView() {
        cDomesticAdapter.clearDomesticItem();
        //!< 서울
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Seoul.get(5));

        //!< 부산
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Busan.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Busan.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Busan.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Busan.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Busan.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Busan.get(5));

        //!< 대구
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Daegu.get(5));

        //!< 인천
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Incheon.get(5));

        //!< 광주
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Gwangju.get(5));

        //!< 대전
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Daejeon.get(5));

        //!< 울산
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Ulsan.get(5));

        //!< 세종
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Sejong.get(5));

        //!< 경기
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeonggi.get(5));

        //!< 강원
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Gangwon.get(5));

        //!< 충북
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Chungbuk.get(5));

        //!< 충남
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Chungnam.get(5));

        //!< 전북
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonbuk.get(5));

        //!< 전남
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Jeonnam.get(5));

        //!< 경북
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongbuk.get(5));

        //!< 경남
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Gyeongnam.get(5));

        //!< 제주
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Jeju.get(5));

        //!< 검역
        cDomesticAdapter.addItem(DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(0),
                DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(1),
                DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(2),
                DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(3),
                DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(4),
                DefineAPIDataSet.ins().lstDomesticArea_Quarantine.get(5));

        cDomesticAdapter.notifyDataSetChanged();
    }
}
