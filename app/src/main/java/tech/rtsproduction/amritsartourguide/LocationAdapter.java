package tech.rtsproduction.amritsartourguide;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<LocationClass>{

    public LocationAdapter(@NonNull Context context, @NonNull List<LocationClass> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LocationClass object = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView title = convertView.findViewById(R.id.titleTextItem);
        TextView subTitle = convertView.findViewById(R.id.subTitleItem);
        ImageView imageTile = convertView.findViewById(R.id.iconImageItem);

        title.setText(object.getLocationTitle());
        subTitle.setText(object.getLocationAddress());
        if(object.getLocationPhoto() != -1){
            imageTile.setImageResource(object.getLocationPhoto());
        }

        return convertView;
    }

}
