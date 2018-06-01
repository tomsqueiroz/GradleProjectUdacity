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

public class EndpointsTest extends AndroidTestCase{

    @Test
    public void testJoke() throws Exception{
        String piada = new EndpointsAsyncTask().execute(InstrumentationRegistry.getContext()).get();
        Assert.assertTrue(!piada.equals("") || piada != null );
    }
}
