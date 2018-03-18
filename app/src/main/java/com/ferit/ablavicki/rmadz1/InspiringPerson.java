package com.ferit.ablavicki.rmadz1;

/**
 * Created by Anamarija on 17.3.2018..
 */

public class InspiringPerson {

    int mPicture;
    String mText;
    String mQuote [];


    public InspiringPerson (int picture, String text, String [] quote){
        mPicture = picture;
        mText = text;
        mQuote = quote;
    }

    public int getPicture() {
        return mPicture;
    }

    public String getText() {
        return mText;
    }

    public String randomQuote(){
        int length = mQuote.length;
        int random = (int) (Math.random()*length);
        return mQuote[random];
    }

    public String[] getQuote() {
        return mQuote;
    }

    public void setPicture(int mPicture) {
        this.mPicture = mPicture;
    }

    public void setText(String mText) {
        this.mText = mText;
    }
}
