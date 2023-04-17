package kr.jibhyeonjeon.covid19.Main.SetUIData;

import android.app.Activity;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.TextView;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.R;

public class SetUIData {
    Activity aSetUIData;
    public SetUIData(Activity activity) {
        aSetUIData = activity;

    }

    public void setUiData() {
        TextView DomesticQuarantine = (TextView)aSetUIData.findViewById(R.id.tv_DomesticQuarantine); //격리중
        DomesticQuarantine.setText(DefineAPIDataSet.ins().sDomesticQuarantine);

        TextView DomesticReleased = (TextView)aSetUIData.findViewById(R.id.tv_DomesticReleased); //완치, 전일대비
        DomesticReleased.setText(DefineAPIDataSet.ins().sDomesticReleased);

        TextView DomesticDeath = (TextView)aSetUIData.findViewById(R.id.tv_DomesticDeath); //사망자
        DomesticDeath.setText(DefineAPIDataSet.ins().sDomesticDeath);
        setColorInPartitial("(+" + DefineAPIDataSet.ins().sDomesticCompareDeath + ")","", "#d03e3e", DomesticDeath);

        TextView DomesticConfirmedCases = (TextView)aSetUIData.findViewById(R.id.tv_Compare_DomesticConfirmedCases); //확진환자 총계, 전일대비
        DomesticConfirmedCases.setText(DefineAPIDataSet.ins().sDomesticConfirmedCases);
        setColorInPartitial( "(+" + DefineAPIDataSet.ins().sDomesticCompareConfirmedCases + ")","", "#d03e3e", DomesticConfirmedCases);

        TextView WorldConfirmedCases =(TextView)aSetUIData.findViewById(R.id.tv_WorldConfirmedCases); //확진자수
        WorldConfirmedCases.setText(DefineAPIDataSet.ins().sWorldConfirmedCases);

        TextView WorldDeath = (TextView)aSetUIData.findViewById(R.id.tv_WorldDeath); //사망자수
        WorldDeath.setText(DefineAPIDataSet.ins().sWorldDeath);

        TextView WorldReleased = (TextView)aSetUIData.findViewById(R.id.tv_WorldReleased); //격리 해제
        WorldReleased.setText(DefineAPIDataSet.ins().sWorldReleased);

        TextView WorldLethality = (TextView)aSetUIData.findViewById(R.id.tv_WorldLethality); //치사율
        WorldLethality.setText(DefineAPIDataSet.ins().sWorldLethality + "%");

        TextView DomesticUpdateTime = (TextView)aSetUIData.findViewById(R.id.tv_DomesticUpdateTime);
        DomesticUpdateTime.setText("마지막 업데이트:" + DefineAPIDataSet.ins().sDomesticUpdateTime);

        Button newActivity = (Button)aSetUIData.findViewById(R.id.btn_nowActivity);
        newActivity.setBackgroundResource(R.mipmap.page1button1);
    }


    //!< 메서드 인자값 (색 바꿀 것, "", 색상코드, append할 TextView) <-- 요걸 많이 사용할 듯
    //!<         or  (전체 String, 색 바꿀 것, append할 TextView(비어있음))
    private TextView setColorInPartitial(String change, String full_string, String color, TextView textView){
        SpannableStringBuilder builder = new SpannableStringBuilder(change + full_string);
        builder.setSpan(new ForegroundColorSpan(Color.parseColor(color)), 0, change.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(builder);
        return textView;
    }

}
