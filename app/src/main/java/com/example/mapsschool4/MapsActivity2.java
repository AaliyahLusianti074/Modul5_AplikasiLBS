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

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sdn = new LatLng(-7.896150, 112.821455);
        mMap.addMarker(new MarkerOptions()
                .position(sdn)
                .title("SDN Nongkojajar 1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green))
        );
        LatLng home = new LatLng(-7.897237, 112.820596);
        mMap.addMarker(new MarkerOptions()
                .position(home)
                .title("My Home")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.house))
        );

        mMap.addPolyline(new PolylineOptions().add(
                sdn,
                new LatLng(-7.896149, 112.821556),
                new LatLng(-7.896638, 112.821943),
                new LatLng(-7.897003, 112.822152),
                new LatLng(-7.896892, 112.820662),
                new LatLng(-7.897232, 112.820644),
                new LatLng(-7.897237, 112.820596),
                home
                )
                        .width(10)
                        .color(Color.RED)

        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sdn, 18));
    }
}