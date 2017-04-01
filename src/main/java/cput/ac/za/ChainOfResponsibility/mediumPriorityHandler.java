package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class mediumPriorityHandler extends Handler{

    public void handleRequest (Request rqst){

        if(rqst.getLevel() < 4 && rqst.getLevel() >= 2){

            System.out.println("Medium priority ticket, resolve within short SLA");
            System.out.println("Request: " + rqst.getDescription() + "\nLevel: " + rqst.getLevel());
        }
            else {

                    //super.handleRequest(rqst);

            }
        }
}
