package kr.jibhyeonjeon.covid19.WorldArea.ListView;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;

public class ListDuplicate {

    public ListDuplicate(){


    }

//    public static List<String> getDistinctStream(List<List<String>> orignList) {
//
//        System.out.println("getDistinctStream");
//
//        List<String>  finalWorldList = new ArrayList<String>();
//
//        for(int a = 0; a < orignList.size(); a++){
//            for (int b = 0; b < orignList.size(); b++){
//                if(!finalWorldList.contains(orignList.get(a))){
//                    finalWorldList.add(orignList.get(a).get(b));
//                }
//            }
//        }
//
//        return finalWorldList;
//    }

    public void hsList(){

        HashSet hs = new HashSet();
        hs.addAll(DefineAPIDataSet.ins().lstWorldArea);
        DefineAPIDataSet.ins().lstWorldArea.clear();
        DefineAPIDataSet.ins().lstWorldArea.addAll(hs);


    }

}
