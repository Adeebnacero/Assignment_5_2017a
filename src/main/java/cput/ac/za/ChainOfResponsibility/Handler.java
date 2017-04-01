package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public abstract class Handler {

    protected Handler succession;

    public void setSuccession(Handler successor){

        succession = successor;
    }

    abstract void handleRequest(Request rqst);


}
