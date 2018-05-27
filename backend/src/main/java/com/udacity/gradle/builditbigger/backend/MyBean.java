package com.udacity.gradle.builditbigger.backend;

import com.example.jokelibrary.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        Jokes jokes = new Jokes();
        return jokes.getJokes();
    }

    public void setData(String data) {
        myData = data;
    }
}