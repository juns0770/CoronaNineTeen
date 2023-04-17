package kr.jibhyeonjeon.covid19.Domestic.ListView;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kr.jibhyeonjeon.covid19.R;

public class DomesticAreaAdapter extends BaseAdapter {

    private ArrayList<DomesticAreaItem> dItems = new ArrayList<>();

    @Override
    public int getCount() {
        return dItems.size();
    }

    @Override
    public DomesticAreaItem getItem(int position) {
        return dItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.domestic_listview_item, parent, false);
        }



        TextView tvCityname = (TextView)convertView.findViewById(R.id.tv_cityname);
        TextView tvConfirm = (TextView)convertView.findViewById(R.id.tv_confirm);
        TextView tvNonisolation = (TextView)convertView.findViewById(R.id.tv_nonisolation);
        TextView tvDeath = (TextView)convertView.findViewById(R.id.tv_death);
        TextView tvInidence = (TextView)convertView.findViewById(R.id.tv_incidence);
        TextView tvCompare = (TextView)convertView.findViewById(R.id.tv_compare);

        DomesticAreaItem domesticAreaItem = getItem(position);

        tvCityname.setText(domesticAreaItem.getCityname());
        tvCompare.setText(domesticAreaItem.getCompare());
        tvConfirm.setText(domesticAreaItem.getConfirm());
        tvDeath.setText(domesticAreaItem.getDeath());
        tvNonisolation.setText(domesticAreaItem.getNonisolation());
        tvInidence.setText(domesticAreaItem.getIncidence());

        return convertView;
    }

    public void addItem(String cityname, String compare, String confirm, String nonisolation, String death, String incidence) {
        DomesticAreaItem domesticAreaItem = new DomesticAreaItem();

        domesticAreaItem.setCityname(cityname);
        domesticAreaItem.setCompare("(+" + compare + ")");
        domesticAreaItem.setConfirm(confirm);
        domesticAreaItem.setDeath(death);
        domesticAreaItem.setNonisolation(nonisolation);
        domesticAreaItem.setIncidence(incidence + "%");

        dItems.add(domesticAreaItem);
    }

    public void clearDomesticItem() {
        dItems.clear();
    }


}
