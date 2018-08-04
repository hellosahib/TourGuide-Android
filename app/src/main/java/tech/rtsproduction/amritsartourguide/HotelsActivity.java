package tech.rtsproduction.amritsartourguide;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
        final ArrayList<Location> hotelList = new ArrayList<>();

        toolbar.setTitle(R.string.hotelInfo);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        hotelList.add(new Location(getString(R.string.hotelname1), getString(R.string.hotelAddress1), -1, getString(R.string.hotelPrice1)));
        hotelList.add(new Location(getString(R.string.hotelname2), getString(R.string.hotelAddress2), -1, getString(R.string.hotelPrice2)));
        hotelList.add(new Location(getString(R.string.hotelname3), getString(R.string.hotelAddress3), -1, getString(R.string.hotelPrice3)));
        hotelList.add(new Location(getString(R.string.hotelname4), getString(R.string.hotelAddress4), -1, getString(R.string.hotelPrice4)));
        hotelList.add(new Location(getString(R.string.hotelname5), getString(R.string.hotelAddress5), -1, getString(R.string.hotelPrice5)));
        hotelList.add(new Location(getString(R.string.hotelname6), getString(R.string.hotelAddress6), -1, getString(R.string.hotelPrice6)));

        LocationAdapter adapter = new LocationAdapter(this, hotelList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showAlert(hotelList.get(i));
            }
        });
    }

    private void showAlert(Location object) {
        AlertDialog.Builder alertAdd = new AlertDialog.Builder(HotelsActivity.this);
        alertAdd.setTitle(object.getLocationTitle());
        LayoutInflater inflater = LayoutInflater.from(HotelsActivity.this);

        final View view1 = inflater.inflate(R.layout.activity_detail, null);
        TextView t1 = view1.findViewById(R.id.subtitleTextDetail);
        t1.setText(object.getLocationSubtitle());
        TextView t2 = view1.findViewById(R.id.locationTextDetail);
        t2.setText(object.getLocationAddress());
        ImageView i1 = view1.findViewById(R.id.imageDetail);
        if (object.getLocationPhoto() != -1) {
            i1.setImageResource(object.getLocationPhoto());
        }

        alertAdd.setView(view1);
        alertAdd.setNeutralButton(R.string.done, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertAdd.show();
    }
}
