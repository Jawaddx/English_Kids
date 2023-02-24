package com.example.android.myProgramWork;

public class Translater {

// this class will take two word from arabic and english
        private String arabicWord ;
        private String englishWord ;
        private int icon ;
        public Translater (String englishWord , String arabicWord , int icon){

            this.arabicWord = arabicWord ;
            this.englishWord = englishWord;
            this.icon = icon ;

        }

    public String getArabicWord() {
        return arabicWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public int getIcon() {
        return icon;
    }
}


