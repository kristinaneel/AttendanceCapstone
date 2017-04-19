package com.example.kristinaneel.attendance;

/**
 * Created by kristinaneel on 3/28/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
public class CustomAdapter extends ArrayAdapter{
        CheckboxList[] checkboxListItems = null;
        Context context;
public CustomAdapter(Context context, CheckboxList[] resource) {
        super(context,R.layout.row,resource);
        this.context = context;
        this.checkboxListItems = resource;
        }
@Override
public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(checkboxListItems[position].getName());

        if(checkboxListItems[position].getValue() == 1)
                checkBox.setChecked(true);
        else
                checkBox.setChecked(false);
        return convertView;
        }
}