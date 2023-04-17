package kr.jibhyeonjeon.covid19.WorldArea.ListView;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class WorldAreaItem {

    private Drawable bCountryImage;
    private String sCountryname="";             //!< 나라이름
    private String sAccumulateConfirmed="";     //!< 누적 확진자
    private String sConfirmed="";               //!< 확진자(전일대비)
    private String sAccumulateDeath="";         //!< 누적 사망자
    private String sCountryDeath="";                   //!< 사망자(전일대비)
    private String sCountryNonisolation="";            //!< 격리해제
    private String sTreatment="";               //!< 치료중


    //! 확진자 confirmed
    //!< 누적 Accumulate
    public Drawable getCountryImage() {return bCountryImage;}
    public void setCountryImage(Drawable bCountryImage) {this.bCountryImage = bCountryImage;}

    public String getCountryname() {return sCountryname;}
    public void setCountryname(String sCityname) {this.sCountryname = sCityname;}

    public String getAccumulateConfirmed() {return  sAccumulateConfirmed;}
    public void setAccumulateConfirmed(String sCompare) {this.sAccumulateConfirmed = sCompare;}

    public String getConfirmed() {return sConfirmed;}
    public void setConfirmed(String sConfirm) {this.sConfirmed = sConfirm;}

    public String getAccumulateDeath() {return sAccumulateDeath;}
    public void setAccumulateDeath(String sNonisolation) {this.sAccumulateDeath = sNonisolation;}

    public String getCountryDeath() {return sCountryDeath;}
    public void setCountryDeath(String sDeath) {this.sCountryDeath = sDeath;}

    public String getNonisolation() {return  sCountryNonisolation;}
    public void setCountryNonisolation(String sIncidence) {this.sCountryNonisolation = sIncidence;}

    public String getTreatment() {return sTreatment;}
    public void setTreatment(String sTreatment){this.sTreatment = sTreatment;}
}
