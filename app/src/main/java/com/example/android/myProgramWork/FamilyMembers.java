package com.example.android.myProgramWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Translater> numbersArray = new ArrayList<>();
        numbersArray.add(new Translater("Father", "اب" ,R.drawable.family_father));
        numbersArray.add(new Translater("Mother", "ام",R.drawable.family_mother));
        numbersArray.add(new Translater("Older Brother", "الاخ الكبير",R.drawable.family_older_brother));
        numbersArray.add(new Translater("Younger Brother", "الاخ الصغير",R.drawable.family_younger_brother));

        numbersArray.add(new Translater("Older Sister", "الاخت الكبيرة",R.drawable.family_older_sister));
        numbersArray.add(new Translater("Younger Sister", "الاخت الصغيرة",R.drawable.family_younger_sister));

        numbersArray.add(new Translater("Nephew", "ابن الاخ",R.drawable.family_younger_brother));
        numbersArray.add(new Translater("GrandFather", "جد",R.drawable.family_grandfather));
        numbersArray.add(new Translater("GrandMother", "جدة",R.drawable.family_grandmother));
        numbersArray.add(new Translater("Uncle", "عم - خال",R.drawable.family_father));


        TranslateAdapter numberAdapter = new TranslateAdapter(this, numbersArray);

        ListView listView = (ListView) findViewById(R.id.numbers_list);

        listView.setAdapter(numberAdapter);

    }
}