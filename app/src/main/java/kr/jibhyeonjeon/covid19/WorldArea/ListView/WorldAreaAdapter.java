package kr.jibhyeonjeon.covid19.WorldArea.ListView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import kr.jibhyeonjeon.covid19.R;

public class WorldAreaAdapter extends BaseAdapter {

    private ArrayList<WorldAreaItem> alWorldAreaItem = new ArrayList<WorldAreaItem>();

    @Override
    public int getCount() {
        return alWorldAreaItem.size();
    }

    @Override
    public WorldAreaItem getItem(int position) {
        return alWorldAreaItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.worldarea_listview_item, parent, false);
        }

        ImageView ivCountryImage = (ImageView)convertView.findViewById(R.id.country_image);
        TextView tvCountryName = (TextView)convertView.findViewById(R.id.countryname);
        TextView tvAccumulateConfirmed = (TextView)convertView.findViewById(R.id.accumulate_confirmed);
        TextView tvConfirmed = (TextView)convertView.findViewById(R.id.confirmed);
        TextView tvAccumulateDeath = (TextView)convertView.findViewById(R.id.accumulate_death);
        TextView tvCountryDeath = (TextView)convertView.findViewById(R.id.country_death);
        TextView tvCountryNonisolation = (TextView)convertView.findViewById(R.id.country_nonisolation);
        TextView tvTreatment = (TextView)convertView.findViewById(R.id.treatment);

        WorldAreaItem worldAreaItem = getItem(position);

        ivCountryImage.setImageDrawable(worldAreaItem.getCountryImage());
        tvCountryName.setText(worldAreaItem.getCountryname());
        tvAccumulateConfirmed.setText(worldAreaItem.getAccumulateConfirmed()); //요거
        tvConfirmed.setText(worldAreaItem.getConfirmed());
        tvAccumulateDeath.setText(worldAreaItem.getAccumulateDeath());
        tvCountryDeath.setText(worldAreaItem.getCountryDeath());
        tvCountryNonisolation.setText(worldAreaItem.getNonisolation());
        tvTreatment.setText(worldAreaItem.getTreatment());

        return convertView;
    }

    public void addItem(Drawable countryimage, String countryname, String accumulateconfirmed, String confirmed, String accumulatedeath, String countrydeath, String countrynonisolation, String treatment) {
        WorldAreaItem worldAreaItem = new WorldAreaItem();

        worldAreaItem.setCountryImage(countryimage);
        worldAreaItem.setCountryname(countryname);
        worldAreaItem.setAccumulateConfirmed(accumulateconfirmed);
        worldAreaItem.setConfirmed("(+" + confirmed + ")");
        worldAreaItem.setAccumulateDeath(accumulatedeath);
        worldAreaItem.setCountryDeath("(+" + countrydeath    + ")");
        worldAreaItem.setCountryNonisolation(countrynonisolation);
        worldAreaItem.setTreatment(treatment);

        alWorldAreaItem.add(worldAreaItem);

    }

    public void clearWorldAreaItem() {
        alWorldAreaItem.clear();
    }

}
