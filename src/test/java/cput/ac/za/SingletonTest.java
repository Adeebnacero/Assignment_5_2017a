package cput.ac.za;

import cput.ac.za.SingletonPattern.Singleton;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class SingletonTest {

    @Test
    public void testGetInstance() throws Exception {

        Singleton single1 = Singleton.getInstance();

        String one = single1.concat("Bob","Dylan");
        int two = single1.idNumber(23);

        Assert.assertNotNull(single1,"Object is not null");
        Assert.assertEquals(one,"Bob Dylan");
        Assert.assertEquals(two,23);
    }

}