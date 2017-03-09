
package com.example.android.gitlagos;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link GitlagosAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Gitlagos} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class GitlagosAdapter extends ArrayAdapter<Gitlagos> {



    /**
     * Constructs a new {@link GitlagosAdapter}.
     *
     * @param context of the app
     * @param gitlagoses is the list of gitlagoses, which is the data source of the adapter
     */
    public GitlagosAdapter(Context context, List<Gitlagos> gitlagoses) {
        super(context, 0, gitlagoses);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.gitlagos_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Gitlagos currentGitlagos = getItem(position);

        // Find the TextView with view ID magnitude
        TextView photoView = (TextView) listItemView.findViewById(R.id.photo);

        // Display the photo of the lagos github user
        photoView.setText(currentGitlagos.getPhoto());


        // Find the TextView with view ID location
        TextView urlView = (TextView) listItemView.findViewById(R.id.url);
        // Display the location of the current earthquake in that TextView
        urlView.setText(currentGitlagos.getUrl());

        // Find the TextView with view ID location offset
        TextView usernameView = (TextView) listItemView.findViewById(R.id.username);
        // Display the location offset of the current earthquake in that TextView
        usernameView.setText(currentGitlagos.getUsername());

        // Create a new Date object from the time in milliseconds of the earthquake
        //Date dateObject = new Date(currentGitlagos.getTimeInMilliseconds());



        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
