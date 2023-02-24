package com.example.android.myProgramWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList <Translater> numbersArray = new ArrayList<>();
        numbersArray.add(new Translater("One","واحد" ,R.drawable.number_one));
        numbersArray.add(new Translater("Two","اثنان", R.drawable.number_two));
        numbersArray.add(new Translater("Three","ثلاثة" ,R.drawable.number_three));
        numbersArray.add(new Translater("Four","اربعة" ,R.drawable.number_four));
        numbersArray.add(new Translater("Five","خمسة" ,R.drawable.number_five));
        numbersArray.add(new Translater("Six","ستة" ,R.drawable.number_six));
        numbersArray.add(new Translater("Seven","سبعة" ,R.drawable.number_seven));
        numbersArray.add(new Translater("Eight","ثمانية" ,R.drawable.number_eight));
        numbersArray.add(new Translater("Nine","تسعة" ,R.drawable.number_nine));
        numbersArray.add(new Translater("Ten","عشرة" ,R.drawable.number_ten));



        TranslateAdapter numberAdapter = new TranslateAdapter(this , numbersArray );

        ListView listView = (ListView) findViewById(R.id.numbers_list);

        listView.setAdapter(numberAdapter);














// This is for msg that's apper in logcat to make sure the values are be excuted
        Log.v("this is sooo goood ", String.valueOf(numbersArray.get(0)));
      //  Log.v("you can add just 23char" ,  numbersArray.get(1));








    }
}