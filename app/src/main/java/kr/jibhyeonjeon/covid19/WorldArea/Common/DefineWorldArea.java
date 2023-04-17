package kr.jibhyeonjeon.covid19.WorldArea.Common;

import java.util.ArrayList;

public class DefineWorldArea {

    public ArrayList<ArrayList<String>> lstConvertHangeul = new ArrayList<>();

    /**
     * @author -SweetyCat-
     * @since 2014 - 08 - 05
     * @param    instance Singleton Pattern
     */
    private static DefineWorldArea instance;

    public static DefineWorldArea ins() {
        if (instance == null) {
            instance = new DefineWorldArea();
        }

        return instance;

    }
}
