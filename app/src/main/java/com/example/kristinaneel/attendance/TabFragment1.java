package com.example.kristinaneel.attendance;

/**
 * Created by kristinaneel on 1/28/2017.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;

/**
 * Created by kristinaneel on 12/31/2016.
 */
public class TabFragment1 extends Fragment {
    ListView lv;
    CheckboxList[] checkboxListItems;
    String [] eventType = {"Professional", "Community Service", "Fundraising", "Social"};
    String [] eventID = {"1","2","3","4","5","6","7","8","9","10"};
    private PopupWindow popupWindow;
    private Button button;
    private Context context;
    private RelativeLayout relativeLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);

        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, eventType);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, eventID);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        lv = (ListView) view.findViewById(R.id.listView1);
        checkboxListItems = new CheckboxList[30];
        checkboxListItems[0] = new CheckboxList("Lucas Austin", 0);
        checkboxListItems[1] = new CheckboxList("Erin Bruggeman", 0);
        checkboxListItems[2] = new CheckboxList("Jon Caracci", 0);
        checkboxListItems[3] = new CheckboxList("Marcela Carias", 0);
        checkboxListItems[4] = new CheckboxList("Hanna Christianson", 0);
        checkboxListItems[5] = new CheckboxList("Daniel Creese", 0);
        checkboxListItems[6] = new CheckboxList("Brad Egan", 0);
        checkboxListItems[7] = new CheckboxList("Lauren Ewing", 0);
        checkboxListItems[8] = new CheckboxList("Connor Finholt", 0);
        checkboxListItems[9] = new CheckboxList("Zoey Glenn", 0);
        checkboxListItems[10] = new CheckboxList("Jenny Goodale", 0);
        checkboxListItems[11] = new CheckboxList("Wesley Hall", 0);
        checkboxListItems[12] = new CheckboxList("Andrew Hawkins", 0);
        checkboxListItems[13] = new CheckboxList("Erin Hirter", 0);
        checkboxListItems[14] = new CheckboxList("Kylie Jacobsen", 0);
        checkboxListItems[15] = new CheckboxList("Alli Kuhlmann", 0);
        checkboxListItems[16] = new CheckboxList("Ben Lacke", 0);
        checkboxListItems[17] = new CheckboxList("Isaac Landers", 0);
        checkboxListItems[18] = new CheckboxList("Brittany Logan", 0);
        checkboxListItems[19] = new CheckboxList("Michael Meyer", 0);
        checkboxListItems[20] = new CheckboxList("Kristina Neel", 0);
        checkboxListItems[21] = new CheckboxList("Matt Ness", 0);
        checkboxListItems[22] = new CheckboxList("Lauren Oreto", 0);
        checkboxListItems[23] = new CheckboxList("Taylor Pudenz", 0);
        checkboxListItems[24] = new CheckboxList("Ben Ransom", 0);
        checkboxListItems[25] = new CheckboxList("Erin Sawasky", 0);
        checkboxListItems[26] = new CheckboxList("Matthew VanHerzeele", 0);
        checkboxListItems[27] = new CheckboxList("Sydney Walther", 0);
        checkboxListItems[28] = new CheckboxList("Alec Wilcox", 0);
        checkboxListItems[29] = new CheckboxList("Rhiana Williams", 0);
        CustomAdapter adapterL = new CustomAdapter(getActivity(), checkboxListItems);
        lv.setAdapter(adapterL);

        button = (Button) view.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
                alertDialog.setTitle("Submitted");
                alertDialog.setMessage("The attendance records for this event have been submitted and sent to the email on file.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "EXIT", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
                alertDialog.show();
            }
        });
        return view;

    }


}