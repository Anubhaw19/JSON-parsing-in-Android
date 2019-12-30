package com.example.earthquake;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        //creating a DATE Object from Time in millisecond of EarthQuake.
        Date dateObject= new Date(CurrentItem.getmTime());

        TextView DateText = (TextView)ListItemView.findViewById(R.id.date);
        //DateText.setText((int) CurrentItem.getmTime()); //this is old code....
        String FormatedDate=formatDate(dateObject);
        DateText.setText(FormatedDate);

        TextView TimeText =(TextView)ListItemView.findViewById(R.id.time);
        TimeText.setText(formatTime(dateObject));


return ListItemView;
    }

    private String formatDate(Date dateObject)
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("LLL dd,yyyy");
        return dateFormat.format(dateObject);
    }

    private  String  formatTime(Date dateObject)
    {
        SimpleDateFormat timeFormat=new SimpleDateFormat("h:mm a"); // this line of code is important ,and new for me. as it's date format.
        return timeFormat.format(dateObject);
    }
}
