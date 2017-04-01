package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class lowPriorityHandler extends Handler{

    public void handleRequest (Request rqst){

        if(rqst.getLevel() < 2 && rqst.getLevel() >= 0){

            System.out.println("Low priority ticket, add to backlog items");
            System.out.println("Request: " + rqst.getDescription() + "\nLevel: " + rqst.getLevel());
        }
            else {

                    //super.handleRequest(rqst);
        }
    }
}
