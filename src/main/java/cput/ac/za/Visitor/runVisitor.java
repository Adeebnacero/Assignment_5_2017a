package cput.ac.za.Visitor;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runVisitor {

    public static void main (String [] args){

        carInterface c1 = new car();
        c1.accept(new carVisitorDisplay());
    }
}
