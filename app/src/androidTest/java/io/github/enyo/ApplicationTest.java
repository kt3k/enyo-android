package io.github.enyo;

import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(RobolectricTestRunner.class)
public class ApplicationTest {
    private SimpleTestable simpleTestable;

    @Before
    public void setUp() throws Exception {
        this.simpleTestable = new SimpleTestable();
    }

    @Test
    public void testConstructor() throws Exception {
        Assert.assertNotNull(simpleTestable);
    }
}