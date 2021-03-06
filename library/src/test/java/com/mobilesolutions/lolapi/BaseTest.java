package com.mobilesolutions.lolapi;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.test.ServiceTestCase;

import junit.framework.TestCase;

import org.junit.Before;

import java.lang.reflect.Method;

import retrofit.RestAdapter;

/**
 * The base test for all tests.
 * <p/>
 * Created by georgi.eftimov on 12/06/2015.
 */
public class BaseTest  extends InstrumentationTestCase {

    protected static final String API_KEY = "1fcc2cda-891d-4042-a454-a61a2c79fa4b";

    @Before
    public void init() {
        LolApi.init(API_KEY, RestAdapter.LogLevel.FULL,getInstrumentation().getContext());
        LolApi.setRegion("eune");
    }
}
