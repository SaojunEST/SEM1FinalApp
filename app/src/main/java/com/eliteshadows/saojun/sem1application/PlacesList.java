package com.eliteshadows.saojun.sem1application;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.eliteshadows.saojun.sem1application.R;

public class PlacesList extends ActionBarActivity {



    public void setupExamplePlaceButton(View view) {
        Intent intent = new Intent(this,ExamplePlace.class);
        startActivity(intent);
    }

    public void setupAlbertusMagnusButton(View view) {
        Intent intent = new Intent(this,AlbertusMagnus.class);
        startActivity(intent);
    }

    public void setupUSTCarparkButton(View view) {
        Intent intent = new Intent(this,USTCarpark.class);
        startActivity(intent);
    }

    public void setupBeatoAngelinoButton(View view) {
        Intent intent = new Intent(this,BeatoAngelino.class);
        startActivity(intent);
    }

    public void setupBenavidesButton(View view) {
        Intent intent = new Intent(this,Benavides.class);
        startActivity(intent);
    }

    public void setupAlumniCenterButton(View view) {
        Intent intent = new Intent(this,AlumniCenter.class);
        startActivity(intent);
    }

    public void setupMainBuildingButton(View view) {
        Intent intent = new Intent(this,MainBuilding.class);
        startActivity(intent);
    }

    public void setupRoqueRuanoButton(View view) {
        Intent intent = new Intent(this,RoqueRuano.class);
        startActivity(intent);
    }

    public void setupMartinDePorresButton(View view) {
        Intent intent = new Intent(this,MartinDePorres.class);
        startActivity(intent);
    }

    public void setupRaymundButton(View view) {
        Intent intent = new Intent(this,Raymund.class);
        startActivity(intent);
    }

    public void setupTanYanKeeButton(View view) {
        Intent intent = new Intent(this,TanYanKee.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.places_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_places_list, container, false);
            return rootView;
        }
    }
}
