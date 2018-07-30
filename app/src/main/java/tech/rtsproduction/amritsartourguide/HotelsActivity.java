package tech.rtsproduction.amritsartourguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        toolbar = findViewById(R.id.toolbarHotel);
        listView = findViewById(R.id.listViewHotel);

        toolbar.setTitle("Hotel Info");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<LocationClass> hotelList = new ArrayList<>();
        hotelList.add(new LocationClass("Hotel 42","Mall Road, INA Colony,Amritsar",-1,"Price - Rs1500"));
        hotelList.add(new LocationClass("Welcome Inn","Near Railway Station,Albert Road,Amritsar",-1,"Price - Rs2000"));
        hotelList.add(new LocationClass("Hotel C7","Kot Atma Singh,Ram Bagh,Amritsar",-1,"Price - Rs1500"));
        hotelList.add(new LocationClass("Hotel Downtown Suite","Mall Road,Amritsar",-1,"Price - Rs2500"));
        hotelList.add(new LocationClass("Sallow Royal Suite","Near Golden Temple Flyover,GT Road,Amritsar",-1,"Price - Rs2000"));
        hotelList.add(new LocationClass("Hotel Narula Aurrum","Taylor Road,Amritsar",-1,"Price- Rs - 3000"));

        LocationAdapter adapter = new LocationAdapter(this,hotelList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LocationClass object = hotelList.get(i);
                showAlert(object);
            }
        });



    }

    private void showAlert(LocationClass object) {
        AlertDialog.Builder alertAdd = new AlertDialog.Builder(HotelsActivity.this);
        alertAdd.setTitle(object.getLocationTitle());
        LayoutInflater inflater = LayoutInflater.from(HotelsActivity.this);

        final View view1 = inflater.inflate(R.layout.activity_detail,null);
        TextView t1 = view1.findViewById(R.id.subtitleTextDetail);
        t1.setText(object.getLocationSubtitle());
        TextView t2 = view1.findViewById(R.id.locationTextDetail);
        t2.setText(object.getLocationAddress());
        ImageView i1 = findViewById(R.id.imageDetail);

        alertAdd.setView(view1);
        alertAdd.setNeutralButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertAdd.show();
    }
}