package cput.ac.za;

import cput.ac.za.Prototype.manager;
import cput.ac.za.Prototype.worker;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class prototypeTest {

    @Test
    public void testManager() throws Exception {

        manager m1 = new manager("Adeeb Nacerodien");

        Assert.assertEquals("Manager: Adeeb Nacerodien", m1);
    }

    @Test
    public void testWorker() throws Exception {

        worker w1 = new worker("Bob Dylan");

        Assert.assertEquals("Worker: Bob Dylan", w1);
    }
}