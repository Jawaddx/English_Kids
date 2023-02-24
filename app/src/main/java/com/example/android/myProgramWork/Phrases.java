package com.example.android.myProgramWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_numbers);

        ArrayList<Translater> numbersArray = new ArrayList<>();
        numbersArray.add(new Translater("Math is my favorite subject", "الرياضيات هيا مادتي المفضلة",R.drawable.math));
        numbersArray.add(new Translater("Subscribe to Jawad's explanations channel" , "أشتركوا بقناة شروحات جواد ",R.drawable.jawadexplain));
        numbersArray.add(new Translater("I love Programing", "انا احب البرمجة ",R.drawable.programing));
        numbersArray.add(new Translater("Always Stand up for shake hand", "دائما قف عندما تريد ان تصافح الاخرين ",R.drawable.handshake));
        numbersArray.add(new Translater("Set down and be polite in your class", "اجلس وكن مؤدب في الصف ",R.drawable.student_class));
        numbersArray.add(new Translater("I am hungry", "أنا جائع ",R.drawable.hungry));
        numbersArray.add(new Translater("I do my homework", "انا احل واجباتي  ",R.drawable.exam));
        numbersArray.add(new Translater("Collage need a patient students", "الجامعة تحتاج لطلاب صبورين ",R.drawable.advisor));
        numbersArray.add(new Translater("Walking is good for health", " المشي مفيد للصحة ",R.drawable.walking));


        TranslateAdapter numberAdapter = new TranslateAdapter(this, numbersArray);

        ListView listView = (ListView) findViewById(R.id.numbers_list);

        listView.setAdapter(numberAdapter);

    }
}