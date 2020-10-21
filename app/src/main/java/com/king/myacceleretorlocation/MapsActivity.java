package com.king.myacceleretorlocation;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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
        LatLng dodoma = new LatLng(-6.172943, 35.7031096);
        mMap.addMarker(new MarkerOptions().position(dodoma).title("Marker in Dodoma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dodoma));

        LatLng nairobi = new LatLng(-1.3032051, 36.707308);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Marker in Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));


        LatLng kigali = new LatLng(-1.9297648, 29.9871556);
        mMap.addMarker(new MarkerOptions().position(kigali).title("Marker in Kigali"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kigali));

        LatLng kampala = new LatLng(0.3130291, 32.5290843);
        mMap.addMarker(new MarkerOptions().position(kampala).title("Marker in Kampala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kampala));

        LatLng dar_es_salaam = new LatLng(-6.769511, 38.9740948);
        mMap.addMarker(new MarkerOptions().position(dar_es_salaam).title("Marker in Dar Es Salaam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dar_es_salaam));
    }
}