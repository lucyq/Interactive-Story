package com.example.lucyqin.interactivestory.model;

/**
 * Created by lucyqin on 5/11/16.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }



}
