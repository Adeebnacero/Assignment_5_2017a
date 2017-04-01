package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class highPriorityHandler extends Handler{

    public void handleRequest(Request rqst){

        if (rqst.getLevel() >= 4){

            System.out.println("High priority ticket. Please resolve as soon as possible!");
            System.out.println("Request: " + rqst.getDescription() + "\nLevel: " + rqst.getLevel());
        }
            else {

                    //super.handleRequest(rqst);
            }


    }
}
