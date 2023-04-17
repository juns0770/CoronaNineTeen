package kr.jibhyeonjeon.covid19.WorldArea.Common;

import java.util.ArrayList;

public class CountryNameArrayList {

    public CountryNameArrayList () {
        setlstConvertHangeul();
    }

    //!< 리스트 값 검색 및 리턴
    public String setHangeulCountryName(String englishCountryName) {
        for(int i = 0; i < DefineWorldArea.ins().lstConvertHangeul.size() ; i++) {
            if(DefineWorldArea.ins().lstConvertHangeul.get(i).get(0).equals(englishCountryName)) {
                return DefineWorldArea.ins().lstConvertHangeul.get(i).get(1);
            }
        }
        return "";
    }

    //!< 리스트 값 세팅
    public void setlstConvertHangeul() {
        addlstConvertHangeul("Zimbabwe", "짐바브웨");
        addlstConvertHangeul("Zambia", "잠비아");
        addlstConvertHangeul("Yemen", "예맨");
        addlstConvertHangeul("Western Sahara", "서사하라");
        addlstConvertHangeul("Vietnam", "베트남");
        addlstConvertHangeul("Venezuela", "베네수엘라");
        addlstConvertHangeul("Uzbekistan", "우즈베키스탄");
        addlstConvertHangeul("Uruguay", "우루과이");
        addlstConvertHangeul("Ukraine", "우크라이나");
        addlstConvertHangeul("Uganda", "우간다");
        addlstConvertHangeul("USA", "미국");
        addlstConvertHangeul("UK", "영국");
        addlstConvertHangeul("UAE", "아랍에미리트");
        addlstConvertHangeul("Turks and Caicos Islands", "터크스 케이커스 제도");
        addlstConvertHangeul("Turkey", "터키");
        addlstConvertHangeul("Tunisia", "튀니지");
        addlstConvertHangeul("Trinidad and Tobago", "트리니다드토바고 ");
        addlstConvertHangeul("Togo", "토고");
        addlstConvertHangeul("Timor-Leste", "동티모르");
        addlstConvertHangeul("Thailand", "타이");
        addlstConvertHangeul("Tanzania", "탄자니아");
        addlstConvertHangeul("Taiwan", "타이완");
        addlstConvertHangeul("Syrian Arab Republic", "시리아");
        addlstConvertHangeul("Switzerland", "스위스");
        addlstConvertHangeul("Sweden", "스웨덴");
        addlstConvertHangeul("Swaziland", "스와질란드");
        addlstConvertHangeul("Suriname", "수리남");
        addlstConvertHangeul("Sudan", "수단");
        addlstConvertHangeul("St. Barth", "생 바르 텔레 미");
        addlstConvertHangeul("Sri Lanka", "스리랑카");
        addlstConvertHangeul("Spain", "스페인");
        addlstConvertHangeul("South Sudan", "남수단");
        addlstConvertHangeul("South Africa", "남아프리카");
        addlstConvertHangeul("Somalia", "소말리아");
        addlstConvertHangeul("Slovenia", "슬로베니아");
        addlstConvertHangeul("Slovakia", "슬로바키아");
        addlstConvertHangeul("Sint Maarten", "신트마르턴");
        addlstConvertHangeul("Singapore", "싱가포르");
        addlstConvertHangeul("Sierra Leone", "시에라리온");
        addlstConvertHangeul("Seychelles", "세이셸");
        addlstConvertHangeul("Serbia", "세르비아");
        addlstConvertHangeul("Senegal", "세네갈");
        addlstConvertHangeul("Saudi Arabia", "사우디아라비아");
        addlstConvertHangeul("Sao Tome and Principe", "상투메프린시페");
        addlstConvertHangeul("San Marino", "산마리노");
        addlstConvertHangeul("Saint Vincent and the Grenadines", "세인트빈센트 그레나딘");
        addlstConvertHangeul("Saint Pierre Miquelon", "생피에르미클롱");
        addlstConvertHangeul("Saint Martin", "세인트마틴 섬");
        addlstConvertHangeul("Saint Lucia", "세인트루시아");
        addlstConvertHangeul("Saint Kitts and Nevis", "세인트키츠네비스");
        addlstConvertHangeul("S. Korea", "한국");
        addlstConvertHangeul("Réunion", "레위니옹");
        addlstConvertHangeul("Rwanda", "르완다");
        addlstConvertHangeul("Russia", "러시아");
        addlstConvertHangeul("Romania", "루마니아");
        addlstConvertHangeul("Qatar", "카타르");
        addlstConvertHangeul("Portugal", "포르투갈");
        addlstConvertHangeul("Poland", "폴란드");
        addlstConvertHangeul("Philippines", "필리핀");
        addlstConvertHangeul("Peru", "페루");
        addlstConvertHangeul("Paraguay", "파라과이");
        addlstConvertHangeul("Papua New Guinea", "파푸아뉴기니");
        addlstConvertHangeul("Panama", "파나마");
        addlstConvertHangeul("Palestine", "팔레스타인");
        addlstConvertHangeul("Pakistan", "파키스탄");
        addlstConvertHangeul("Oman", "오만");
        addlstConvertHangeul("Norway", "노르웨이");
        addlstConvertHangeul("Nigeria", "나이지리아");
        addlstConvertHangeul("Niger", "니제르");
        addlstConvertHangeul("Nicaragua", "니카라과");
        addlstConvertHangeul("New Zealand", "뉴질랜드");
        addlstConvertHangeul("New Caledonia", "뉴칼레도니아");
        addlstConvertHangeul("Netherlands", "네덜란드");
        addlstConvertHangeul("Nepal", "네팔");
        addlstConvertHangeul("Namibia", "나미비아");
        addlstConvertHangeul("Myanmar", "미얀마");
        addlstConvertHangeul("Mozambique", "모잠비크");
        addlstConvertHangeul("Morocco", "모로코");
        addlstConvertHangeul("Montserrat", "몬트세랫");
        addlstConvertHangeul("Montenegro", "몬테네그로");
        addlstConvertHangeul("Mongolia", "몽골");
        addlstConvertHangeul("Monaco", "모나코");
        addlstConvertHangeul("Moldova", "몰도바");
        addlstConvertHangeul("Mexico", "맥시코");
        addlstConvertHangeul("Mayotte", "마요트 섬");
        addlstConvertHangeul("Mauritius", "모리셔스");
        addlstConvertHangeul("Mauritania", "모리타니");
        addlstConvertHangeul("Martinique", "마르티니크");
        addlstConvertHangeul("Malta", "몰타");
        addlstConvertHangeul("Mali", "말리");
        addlstConvertHangeul("Maldives", "몰디브");
        addlstConvertHangeul("Malaysia", "말레이시아");
        addlstConvertHangeul("Malawi", "말라위");
        addlstConvertHangeul("Madagascar", "마다가스카르");
        addlstConvertHangeul("Macedonia", "마케도니아");
        addlstConvertHangeul("Macao", "마카오");
        addlstConvertHangeul("MS Zaandam", "MS.잔담 크루즈선");
        addlstConvertHangeul("Luxembourg", "룩셈부르크");
        addlstConvertHangeul("Lithuania", "리투아니아");
        addlstConvertHangeul("Liechtenstein", "리히텐슈타인");
        addlstConvertHangeul("Libyan Arab Jamahiriya", "리비아");
        addlstConvertHangeul("Liberia", "라이베리아");
        addlstConvertHangeul("Lebanon", "레바논");
        addlstConvertHangeul("Latvia", "라트비아");
        addlstConvertHangeul("Lao People's Democratic Republic", "라오스");
        addlstConvertHangeul("Kyrgyzstan", "키르기스스탄");
        addlstConvertHangeul("Kuwait", "쿠웨이트");
        addlstConvertHangeul("Kenya", "케냐");
        addlstConvertHangeul("Kazakhstan", "카자흐스탄");
        addlstConvertHangeul("Jordan", "요르단");
        addlstConvertHangeul("Japan", "일본");
        addlstConvertHangeul("Jamaica", "자메이카");
        addlstConvertHangeul("Italy", "이탈리아");
        addlstConvertHangeul("Israel", "이스라엘");
        addlstConvertHangeul("Isle of Man", "맨 섬");
        addlstConvertHangeul("Ireland", "아일랜드");
        addlstConvertHangeul("Iraq", "이라크");
        addlstConvertHangeul("Iran", "이란");
        addlstConvertHangeul("Indonesia", "인도네시아");
        addlstConvertHangeul("India", "인도");
        addlstConvertHangeul("Iceland", "아이슬란드");
        addlstConvertHangeul("Hungary", "헝가리");
        addlstConvertHangeul("Hong Kong", "홍콩");
        addlstConvertHangeul("Honduras", "온두라스");
        addlstConvertHangeul("Holy See (Vatican City State)", "바티칸");
        addlstConvertHangeul("Haiti", "아이티");
        addlstConvertHangeul("Guyana", "가이아나");
        addlstConvertHangeul("Guinea-Bissau", "기니비사우");
        addlstConvertHangeul("Guinea", "기니");
        addlstConvertHangeul("Guatemala", "과테말라");
        addlstConvertHangeul("Guadeloupe", "과들루프 섬 ");
        addlstConvertHangeul("Grenada", "그레나다");
        addlstConvertHangeul("Greenland", "그린란드");
        addlstConvertHangeul("Greece", "그리스");
        addlstConvertHangeul("Gibraltar", "지브롤터");
        addlstConvertHangeul("Ghana", "가나");
        addlstConvertHangeul("Germany", "독일");
        addlstConvertHangeul("Georgia", "조지아");
        addlstConvertHangeul("Gambia", "감비아");
        addlstConvertHangeul("Gabon", "가봉");
        addlstConvertHangeul("French Polynesia", "프랑스령폴리네시아");
        addlstConvertHangeul("French Guiana", "프랑스령 기아나");
        addlstConvertHangeul("France", "프랑스");
        addlstConvertHangeul("Finland", "핀란드");
        addlstConvertHangeul("Fiji", "피지");
        addlstConvertHangeul("Faroe Islands", "패로제도");
        addlstConvertHangeul("Falkland Islands (Malvinas)", "포클랜드");
        addlstConvertHangeul("Ethiopia", "에티오피아");
        addlstConvertHangeul("Estonia", "에스토니아");
        addlstConvertHangeul("Eritrea", "에리트레아");
        addlstConvertHangeul("Equatorial Guinea", "적도기니");
        addlstConvertHangeul("El Salvador", "엘살바도르");
        addlstConvertHangeul("Egypt", "이집트");
        addlstConvertHangeul("Ecuador", "에콰도르");
        addlstConvertHangeul("Dominican Republic", "도미니카공화국");
        addlstConvertHangeul("Dominica", "도미니카");
        addlstConvertHangeul("Djibouti", "지부티");
        addlstConvertHangeul("Diamond Princess", "다이아몬드 프린세스 크루즈선");
        addlstConvertHangeul("Denmark", "덴마크");
        addlstConvertHangeul("DRC", "콩고 민주 공화국");
        addlstConvertHangeul("Côte d'Ivoire", "코트디부아르");
        addlstConvertHangeul("Czechia", "체코");
        addlstConvertHangeul("Cyprus", "키프로스");
        addlstConvertHangeul("Curaçao", "퀴라소");
        addlstConvertHangeul("Cuba", "쿠바");
        addlstConvertHangeul("Croatia", "크로아티아");
        addlstConvertHangeul("Costa Rica", "코스타리카");
        addlstConvertHangeul("Congo", "콩고");
        addlstConvertHangeul("Colombia", "콜롬비아");
        addlstConvertHangeul("China", "중국");
        addlstConvertHangeul("Chile", "칠레");
        addlstConvertHangeul("Channel Islands", "채널 제도");
        addlstConvertHangeul("Chad", "차드");
        addlstConvertHangeul("Central African Republic", "중앙아프리카공화국");
        addlstConvertHangeul("Cayman Islands", "케이맨 제도");
        addlstConvertHangeul("Caribbean Netherlands", "네덜란드령 카리브");
        addlstConvertHangeul("Canada", "캐나다");
        addlstConvertHangeul("Cameroon", "카메룬");
        addlstConvertHangeul("Cambodia", "캄보디아");
        addlstConvertHangeul("Cabo Verde", "카보베르데");
        addlstConvertHangeul("Burundi", "부룬디");
        addlstConvertHangeul("Burkina Faso", "부르키나파소");
        addlstConvertHangeul("Bulgaria", "불가리아");
        addlstConvertHangeul("Brunei", "브루나이");
        addlstConvertHangeul("British Virgin Islands", "영국령 버진아일랜드");
        addlstConvertHangeul("Brazil", "브라질");
        addlstConvertHangeul("Botswana", "보츠와나");
        addlstConvertHangeul("Bosnia", "보스니아");
        addlstConvertHangeul("Bolivia", "볼리비아");
        addlstConvertHangeul("Bhutan", "부탄");
        addlstConvertHangeul("Bermuda", "버뮤다제도");
        addlstConvertHangeul("Benin", "배냉");
        addlstConvertHangeul("Belize", "벨리즈");
        addlstConvertHangeul("Belgium", "벨기에");
        addlstConvertHangeul("Belarus", "벨라루스");
        addlstConvertHangeul("Barbados", "바베이도스");
        addlstConvertHangeul("Bangladesh", "방글라데시");
        addlstConvertHangeul("Bahrain", "바레인");
        addlstConvertHangeul("Bahamas", "바하마");
        addlstConvertHangeul("Azerbaijan", "아제르바이잔");
        addlstConvertHangeul("Austria", "오스트리아");
        addlstConvertHangeul("Australia", "오스트레일리아");
        addlstConvertHangeul("Aruba", "아루바 섬");
        addlstConvertHangeul("Armenia", "아르메니아");
        addlstConvertHangeul("Argentina", "아르헨티나");
        addlstConvertHangeul("Antigua and Barbuda", "안티쿠아바부다");
        addlstConvertHangeul("Anguilla", "앵귈라 섬");
        addlstConvertHangeul("Angola", "앙골라");
        addlstConvertHangeul("Andorra", "안도라");
        addlstConvertHangeul("Algeria", "알제리");
        addlstConvertHangeul("Albania", "알바니아");
        addlstConvertHangeul("Afghanistan", "아프가니스탄");
    }


    //!< 리스트 추가를 위한 메서드
    public void addlstConvertHangeul(String englishCountryName, String hangeulCountryName) {
        ArrayList<String> lstTemp = new ArrayList<String>();
        lstTemp.add(englishCountryName);
        lstTemp.add(hangeulCountryName);
        DefineWorldArea.ins().lstConvertHangeul.add(lstTemp);

    }

}
