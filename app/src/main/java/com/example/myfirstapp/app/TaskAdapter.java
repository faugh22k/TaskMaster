package com.example.myfirstapp.app;
/**
 *
 */

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import android.widget.GridView;
import android.content.Context;

/**
 * @author jacqui; kim
 *
 */
public class TaskAdapter extends BaseAdapter {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    private Context context;

    TaskAdapter(Context c) {
        context = c;
    }


    /* (non-Javadoc)
     * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
     */
    @Override
    public View getView(int index, View convertView, ViewGroup parent) {
        //this probably needs to be moved for efficiency
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            //get layout form main screen
            gridView = inflater.inflate(R.layout.activity_main, null);

            // set task text into textview
            TextView textView = (TextView) gridView.findViewById(R.id.grid_item_text);
            textView.setText(tasks.get(index).getTaskText().getText());

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }


    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Task getItem(int index) {
        return tasks.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

}