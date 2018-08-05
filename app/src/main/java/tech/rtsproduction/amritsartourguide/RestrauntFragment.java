package tech.rtsproduction.amritsartourguide;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestrauntFragment extends Fragment {

    android.support.v7.widget.Toolbar toolbar;
    ListView listView;

    public RestrauntFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restraunt,container,false);
        toolbar = rootView.findViewById(R.id.toolbarRestaraunts);
        listView = rootView.findViewById(R.id.listViewRestaraunts);

        toolbar.setTitle(R.string.restInfo);
        toolbar.setTitleTextColor(Color.WHITE);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        if (((AppCompatActivity)getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        final ArrayList<Location> restraList = new ArrayList<>();
        restraList.add(new Location(getString(R.string.restrauntName1), getString(R.string.restrauntAddress1), R.drawable.haveli, getString(R.string.restrauntDetail1)));
        restraList.add(new Location(getString(R.string.restrauntName2), getString(R.string.restrauntAddress2), R.drawable.langarhall, getString(R.string.restrauntDetail2)));
        restraList.add(new Location(getString(R.string.restrauntName3), getString(R.string.restrauntAddress3), R.drawable.charmingchicken, getString(R.string.restrauntDetail3)));
        restraList.add(new Location(getString(R.string.restrauntName4), getString(R.string.restrauntAddress4), R.drawable.ahuja, getString(R.string.restrauntDetail4)));
        restraList.add(new Location(getString(R.string.restrauntName5), getString(R.string.restrauntAddress5), R.drawable.kulchaland, getString(R.string.restrauntDetail5)));
        restraList.add(new Location(getString(R.string.restrauntName6), getString(R.string.restrauntAddress6), R.drawable.kesardhaba, getString(R.string.restrauntDetail6)));
        restraList.add(new Location(getString(R.string.restrauntName7), getString(R.string.restrauntAddress7), R.drawable.gianiteastall, getString(R.string.restrauntDetail7)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), restraList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Location object = restraList.get(i);
                showAlert(object);
            }
        });
    return rootView;
    }

    private void showAlert(Location object) {
        AlertDialog.Builder alertAdd = new AlertDialog.Builder(getActivity());
        alertAdd.setTitle(object.getLocationTitle());
        LayoutInflater inflater = LayoutInflater.from(getActivity());

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
