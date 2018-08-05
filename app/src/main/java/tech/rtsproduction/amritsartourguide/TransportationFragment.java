package tech.rtsproduction.amritsartourguide;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TransportationFragment extends Fragment {

    Toolbar toolbar;

    public TransportationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_transportation,container,false);

        toolbar = rootView.findViewById(R.id.toolbarTransportation);
        toolbar.setTitle(R.string.transporationInfo);
        toolbar.setTitleTextColor(Color.WHITE);

        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        if (((AppCompatActivity)getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
