package com.example.android.myProgramWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Translater> numbersArray = new ArrayList<>();
        numbersArray.add(new Translater("Black", "اسود",R.drawable.color_black));
        numbersArray.add(new Translater("Red", "احمر",R.drawable.color_red));
        numbersArray.add(new Translater("White", "ابيض",R.drawable.color_white));
        numbersArray.add(new Translater("Green", "اخضر",R.drawable.color_green));
        numbersArray.add(new Translater("Yellow", "اصفر",R.drawable.color_mustard_yellow));
        numbersArray.add(new Translater("Orange", "برتقالي",R.drawable.color_dusty_yellow));
        numbersArray.add(new Translater("Brown", "بني",R.drawable.color_brown));
        numbersArray.add(new Translater("Gray", "رصاصي",R.drawable.color_gray));



        TranslateAdapter numberAdapter = new TranslateAdapter(this, numbersArray);

        ListView listView = (ListView) findViewById(R.id.numbers_list);

        listView.setAdapter(numberAdapter);

    }
    }
