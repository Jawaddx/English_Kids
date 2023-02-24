/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.myProgramWork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


// Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView family_members = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView pharses = (TextView) findViewById(R.id.phrases);

// Set a click listener on that View
        numbers.setOnClickListener(view -> {
            // The code in this method will be executed when the numbers View is clicked on.
            Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
            startActivity(numbersIntent);
});
        //Set a click listener on family view
        family_members.setOnClickListener(view -> {
            // The code in this method will be executed when the family members View is clicked on.
            Intent familyIntent = new Intent(MainActivity.this , FamilyMembers.class);
            startActivity(familyIntent);
        });

        //Set a click listener on color view
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the color View is clicked on.
            // Hint this is the old way to do this code and i do it just for be know how many way I have
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(colorsIntent);
            }
        });


        pharses.setOnClickListener(view -> {
            Intent pharsesIntent = new Intent(MainActivity.this, Phrases.class);
            startActivity(pharsesIntent);
        });

    }
   /* private void onClick(View view) {
        // The code in this method will be executed when the colors members View is clicked on.
        Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
        startActivity(colorsIntent);
    }*/

}


