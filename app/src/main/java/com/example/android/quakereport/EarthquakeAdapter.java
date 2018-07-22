package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);

        }

        //Find the earthquake at the given position in the list of eartquekes
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView with view ID magnitute
        TextView magnituteView = (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current earthquake in that TextView
        magnituteView.setText(currentEarthquake.getMagnitute());

        //Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        //Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLocation());

        // Create a new Date object form the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        //Find the TextView with view Id date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        //Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        //Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        //Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);


        //Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return  dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
