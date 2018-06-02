package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsTest extends AndroidTestCase implements EndpointsAsyncTask.OnJokeRetrievedListener{

    @Test
    public void testJoke() throws Exception{
        new EndpointsAsyncTask(this).execute(InstrumentationRegistry.getContext());

    }

    @Override
    public void onJokeRetrieved(String joke) {
        Assert.assertTrue(!joke.equals("") || joke != null );
    }
}
