package kr.jibhyeonjeon.covid19.API.Common;

public class DefineAPIURL {
    //!< 국내현황
    public String sURL_Domestic = "https://corona.lmao.ninja/v2/countries/S.%20Korea";

    //!< 국내지역
    public String sURL_DomesticArea = "http://api.corona-19.kr/korea/country/?serviceKey=e603d833163bf17763a29f846b5d90444";

    //!< 세계현황
    public String sURL_World = "https://corona.lmao.ninja/v2/all";

    //!< 세계지역
    public String sURL_WorldArea = "https://corona.lmao.ninja/v2/countries?sort=country";

    /**
     * @author -SweetyCat-
     * @since	2014 - 08 - 05
     * @param	instance Singleton Pattern
     */
    private static DefineAPIURL instance;
    public static DefineAPIURL ins() {
        if (instance == null) {
            instance = new DefineAPIURL();
        }

        return instance;

    }
}
