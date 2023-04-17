package kr.jibhyeonjeon.covid19.WorldArea.ListView;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.WorldArea.WorldArea;

public class ListViewSort {

    public ListViewSort() {

    }

    public void sortDoubleList() {
        ArrayList<ArrayList<String>> listDoubleData = new ArrayList<>();
        listDoubleData.addAll(DefineAPIDataSet.ins().lstWorldArea);

        System.out.println("정렬 전 :");

        for (int i = 0; i < listDoubleData.size(); i++) {
            System.out.println(listDoubleData.get(i));
        }

        //!< 정렬할 key를 지정
        //!< 에문에서는 첫번째 열의 데이터를 Key로 설정하여 정렬
        ArrayList<ArrayList<String>> listDoubleResult = new ArrayList<ArrayList<String>>();

        //!< 정렬결과
        //!< Key에 해당하는 Data를 추출하고, 정렬
        ArrayList<String> slstSortKey = new ArrayList<String>();
        ArrayList<Integer> ilstSortKey = new ArrayList<Integer>();
        for (int i = 0; i < listDoubleData.size(); i++) {
            ilstSortKey.add(Integer.parseInt(listDoubleData.get(i).get(1)));
        }

        Collections.sort(ilstSortKey, new AscendingInteger());
        System.out.println("키값 정렬 : " + ilstSortKey);

        for (int i = 0; i < ilstSortKey.size(); i++) {
            slstSortKey.add(Integer.toString(ilstSortKey.get(i)));
        }

        System.out.println("키값 정렬 String 변환 : " + ilstSortKey);

        // 정렬된 Key정보를 이용하여 데이터를 추출/적재
        for (int i = 0; i < slstSortKey.size(); i++) {
            for (int k = 0; k < listDoubleData.size(); k++) {
                if (slstSortKey.get(i).equals(listDoubleData.get(k).get(1))) {
                    ArrayList<String> slstResult = listDoubleData.get(k);
                    listDoubleResult.add(slstResult);
                    break;
                }
            }
        }



        System.out.println("정렬 후 :");

        System.out.println(listDoubleResult);
//        for (int i = 0; i < listDoubleResult.size(); i++) {
//            System.out.println(listDoubleResult.get(i));
//        }
        System.out.println("뭐 들어있냐?" + DefineAPIDataSet.ins().lstWorldArea);
        DefineAPIDataSet.ins().lstWorldArea.clear();
        System.out.println("클리어 했냐?" + DefineAPIDataSet.ins().lstWorldArea);
        DefineAPIDataSet.ins().lstWorldArea.addAll(listDoubleResult);

        System.out.println("클리어 후 정렬 : " + listDoubleResult);

        System.out.println("listDoubleResult 사이즈 : " + listDoubleResult.size());
        System.out.println("DefineAPIDataSet.ins().lstWorldArea 사이즈 : " + DefineAPIDataSet.ins().lstWorldArea.size());


    }

    class AscendingInteger implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }

}