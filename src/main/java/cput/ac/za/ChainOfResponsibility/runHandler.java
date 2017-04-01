package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runHandler {

    public static void main (String [] args){

        Handler h1 = new highPriorityHandler();
        Handler m1 = new mediumPriorityHandler();
        Handler l1 = new lowPriorityHandler();

        h1.setSuccession(m1);
        m1.setSuccession(l1);

        h1.handleRequest(new Request("Urgent resolution required", 5));
        h1.handleRequest(new Request("Attend to issue next week", 1));
        h1.handleRequest(new Request("Resolve asap", 3));
        h1.handleRequest(new Request("Attend to matter when time is available", 2));
    }
}
