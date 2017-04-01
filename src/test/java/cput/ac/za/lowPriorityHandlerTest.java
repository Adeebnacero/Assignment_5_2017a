package cput.ac.za;

import cput.ac.za.ChainOfResponsibility.Request;
import cput.ac.za.ChainOfResponsibility.lowPriorityHandler;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class lowPriorityHandlerTest {

    @Test
    public void testHandleRequest() throws Exception {

        lowPriorityHandler l1 = new lowPriorityHandler();

        l1.handleRequest(new Request("Urgent resolution required", 5));

        //Assert.assertEquals();

    }
}