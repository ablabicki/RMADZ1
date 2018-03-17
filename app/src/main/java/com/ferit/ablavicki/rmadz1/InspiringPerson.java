package com.ferit.ablavicki.rmadz1;

/**
 * Created by Anamarija on 17.3.2018..
 */

public class InspiringPerson {

    int mPicture;
    String mName, mText;

    public InspiringPerson (int picture, String name, String text){
        mPicture = picture;
        mName = name;
        mText = text;
    }

    public int getPicture() {
        return mPicture;
    }

    public String getName() {
        return mName;
    }

    public String getText() {
        return mText;
    }
}
