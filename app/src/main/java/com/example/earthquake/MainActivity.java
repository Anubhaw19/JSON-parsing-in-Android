package com.example.earthquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView List=(ListView)findViewById(R.id.list);
        // here we TODO SOME CODE.....fro input in ArrayList.

        ArrayList<Quake> earth=QueryUtils.extractEarthquakes();
   //DONE
        // don't know but without this for loop it working fine .
      //  for (int i=0;i<earth.size();i++) {
            EarthAdapter adapter = new EarthAdapter(this, earth);
            List.setAdapter(adapter);
       // }
    }
}
