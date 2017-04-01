package cput.ac.za;

import cput.ac.za.Bridge.glass;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class glassTest {

    @Test
    public void testMakeHolders() throws Exception {

        glass g1 = new glass();

        g1.makeHolders("Red",100,17);

        Assert.assertEquals("Glass Color: Red\nHeight: 100\nWidth: 17",g1.toString());
    }
}