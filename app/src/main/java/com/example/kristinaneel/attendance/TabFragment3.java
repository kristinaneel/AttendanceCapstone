package com.example.kristinaneel.attendance;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kristinaneel on 2/1/2017.
 */
public class TabFragment3 extends Fragment {
    ListView lv;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_3, container, false);

        ListView lv = (ListView) view.findViewById(R.id.list);
        final ArrayList<String> list = new ArrayList<String>();

        list.add("Lucas Austin");
        list.add("Erin Bruggeman");
        list.add("Jon Caracci");
        list.add("Marcela Carias");
        list.add("Hanna Christianson");
        list.add("Daniel Creese");
        list.add("Brad Egan");
        list.add("Lauren Ewing");
        list.add("Connor Finholt");
        list.add("Zoey Glenn");
        list.add("Jenny Goodale");
        list.add("Wesley Hall");
        list.add("Andrew Hawkins");
        list.add("Erin Hirter");
        list.add("Kylie Jacobsen");
        list.add("Alli Kuhlmann");
        list.add("Ben Lacke");
        list.add("Isaac Landers");
        list.add("Brittany Logan");
        list.add("Michael Meyer");
        list.add("Kristina Neel");
        list.add("Matt Ness");
        list.add("Lauren Oreto");
        list.add("Taylor Pudenz");
        list.add("Ben Ransom");
        list.add("Erin Sawasky");
        list.add("Matthew VanHerzeele");
        list.add("Sydney Walther");
        list.add("Alec Wilcox");
        list.add("Rhiana Williams");



        final CustomArrayAdapter adapter = new CustomArrayAdapter(list, getActivity());
        lv.setAdapter(adapter);

        Button addButton = (Button) view.findViewById(R.id.add_btn);
        final EditText newMember = (EditText) view.findViewById(R.id.newMember);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String needToAdd = newMember.getText().toString();
                list.add(needToAdd);
                adapter.notifyDataSetChanged();
                newMember.setText("");
            }


        });

        return view;
    }


}