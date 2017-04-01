package cput.ac.za;

import cput.ac.za.Adapter.imageReader;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class imageReaderTest {

    @Test
    public void testRead() throws Exception {

        imageReader iR1 = new imageReader();

        iR1.read("jpg","Moon.jpg");

        //Assert.assertEquals();
    }
}