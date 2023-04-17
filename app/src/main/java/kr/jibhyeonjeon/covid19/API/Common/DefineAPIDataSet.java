package kr.jibhyeonjeon.covid19.API.Common;

import java.util.ArrayList;
import java.util.List;

public class DefineAPIDataSet {
    /**
     * API 호출검사
     * API가 정상적으로 호출되지 않을 경우
     */
    public boolean bCheckAPI_Domestic = true;
    public boolean bCheckAPI_DomesticArea = true;
    public boolean bCheckAPI_World = true;
    public boolean bCheckAPI_WorldArea = true;

    /**
     * 국내현황
     */
    public String sDomesticUpdateTime = "";         //!< 업데이트 시간
    public String sDomesticQuarantine = "";         //!< 현재 확진자
    public String sDomesticReleased = "";           //!< 완치
    public String sDomesticDeath = "";              //!< 사망자
    public String sDomesticConfirmedCases = "";     //!< 누적 확진자
    public String sDomesticCompareConfirmedCases = ""; //!< 전일대비 확진자
    public String sDomesticCompareDeath  = ""; //!< 전일대비 완치


    /**
     * 세계현황
     */
    public String sWorldConfirmedCases = "";        //!< 전세계 확진자수
    public String sWorldDeath = "";                 //!< 전세계 사망자수
    public String sWorldReleased = "";              //!< 격리해제
    public String sWorldLethality = "";             //!< 치사율

    /**
     * 국내 지역현황
     * 지역별로 리스트 형태 저장
     * Ex : [서울, 16, 426, 92, 0, 4.38]
     *      [시도, 전일환자대비, 확진환자수, 격리해제수, 사망자수, 발생률]
     */

    //!< 출력용 리스트 변수
    //!< 출력시 아래 변수 사용하면 됨
    public List<String> lstDomesticArea_Seoul = new ArrayList<String>();
    public List<String> lstDomesticArea_Busan = new ArrayList<String>();
    public List<String> lstDomesticArea_Daegu = new ArrayList<String>();
    public List<String> lstDomesticArea_Incheon = new ArrayList<String>();
    public List<String> lstDomesticArea_Gwangju = new ArrayList<String>();
    public List<String> lstDomesticArea_Daejeon = new ArrayList<String>();
    public List<String> lstDomesticArea_Ulsan = new ArrayList<String>();
    public List<String> lstDomesticArea_Sejong = new ArrayList<String>();
    public List<String> lstDomesticArea_Gyeonggi = new ArrayList<String>();
    public List<String> lstDomesticArea_Gangwon = new ArrayList<String>();
    public List<String> lstDomesticArea_Chungbuk = new ArrayList<String>();
    public List<String> lstDomesticArea_Chungnam = new ArrayList<String>();
    public List<String> lstDomesticArea_Jeonbuk = new ArrayList<String>();
    public List<String> lstDomesticArea_Jeonnam = new ArrayList<String>();
    public List<String> lstDomesticArea_Gyeongbuk = new ArrayList<String>();
    public List<String> lstDomesticArea_Gyeongnam = new ArrayList<String>();
    public List<String> lstDomesticArea_Jeju = new ArrayList<String>();
    public List<String> lstDomesticArea_Quarantine = new ArrayList<String>();

    //!< 저장용 리스트 변수
    public List<String> lstTempDomesticArea_Seoul = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Busan = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Daegu = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Incheon = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Gwangju = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Daejeon = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Ulsan = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Sejong = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Gyeonggi = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Gangwon = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Chungbuk = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Chungnam = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Jeonbuk = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Jeonnam = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Gyeongbuk = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Gyeongnam = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Jeju = new ArrayList<String>();
    public List<String> lstTempDomesticArea_Quarantine = new ArrayList<String>();

    /**
     * 세계지역 리스트 변수
     * 2차원 리스트 형태로 국가별로 저장되어있으며 아래 형태로 저장되어있음
     *
     * Ex : [S. Korea, 9661, 78, 158, 6, 5228, 4275]
     *      [국가, 누적확진환자, 확진환자 전일대비, 누적사망자, 전일대비 사망자, 격리해제, 치료중(격리중)]
     *
     *  만약 발생자 순위로 정렬하려면 알고리즘 따로 적용해야하며 불러오기만 한 상태임
     *  자바 sort 함수 내림차순 사용하면 편함
     *  참고 URL : https://manorgass.tistory.com/60
     */
    public ArrayList<ArrayList<String>> lstWorldArea = new ArrayList<>();


    /**
     * @author -SweetyCat-
     * @since	2014 - 08 - 05
     * @param	instance Singleton Pattern
     */
    private static DefineAPIDataSet instance;
    public static DefineAPIDataSet ins() {
        if (instance == null) {
            instance = new DefineAPIDataSet();
        }

        return instance;

    }
}
