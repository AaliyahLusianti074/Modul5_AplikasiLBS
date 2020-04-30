package com.example.mapsschool4;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sdi = new LatLng(-7.896490, 112.820323);
        mMap.addMarker(new MarkerOptions()
                .position(sdi)
                .title("SDI Sunan Drajat")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pushpin))
        );
        LatLng home = new LatLng(-7.897237, 112.820596);
        mMap.addMarker(new MarkerOptions()
                .position(home)
                .title("My Home")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.house))
        );

        mMap.addPolyline(new PolylineOptions().add(
                sdi,
                new LatLng(-7.896600, 112.820475),
                new LatLng(-7.896871, 112.820364),
                new LatLng(-7.896892, 112.820662),
                new LatLng(-7.897232, 112.820644),
                new LatLng(-7.897237, 112.820596),
                home
                )
                .width(10)
                .color(Color.RED)

        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sdi, 18));
    }
}
