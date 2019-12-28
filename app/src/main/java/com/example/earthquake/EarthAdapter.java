package com.example.earthquake;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EarthAdapter extends ArrayAdapter<Quake> {
    //creating a constructor
    public  EarthAdapter(Activity context, ArrayList<Quake> earth){
    super(context,0,earth);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView==null)
        {
          ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Quake CurrentItem = getItem(position);

        TextView MagText= (TextView)ListItemView.findViewById(R.id.magnitude);
        MagText.setText(CurrentItem.getmMagnitude());

        TextView PlaceText = (TextView)ListItemView.findViewById(R.id.place);
        PlaceText.setText(CurrentItem.getmPlace());

        TextView TimeText = (TextView)ListItemView.findViewById(R.id.time);
        TimeText.setText(CurrentItem.getmTime());

return ListItemView;
    }
}
