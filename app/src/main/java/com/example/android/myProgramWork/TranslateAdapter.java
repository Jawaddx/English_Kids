package com.example.android.myProgramWork;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TranslateAdapter extends ArrayAdapter<Translater> {

    private Translater translate;

    public TranslateAdapter(Activity context, ArrayList<Translater> numbersArray) {

        super(context,0, numbersArray);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, null, false);
            //If i return the (listItemView) now i will get the Mold of the list  راح تاخذ القالب للقائمة
         // return listItemView;

        }
         translate = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_word);
        // Get the version number from the current translate object and
        // set this text on the number TextView
        numberTextView.setText(translate.getEnglishWord());

        // Find the TextView in the list_item.xml layout with the ID arabic_word
        TextView arabicTextView = (TextView) listItemView.findViewById(R.id.arabic_word);
        // Get the version name from the current translate object and
        // set this text on the name TextView
        arabicTextView.setText(translate.getArabicWord());

        ImageView Imageicon = (ImageView) listItemView.findViewById(R.id.icon_list);
        // Get the version name from the current translate object and
        // set this text on the name ImageView
        Imageicon.setImageResource(translate.getIcon());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
