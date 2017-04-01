package cput.ac.za.Visitor;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class engine implements carInterface {

    public void accept(carVisitorDisplay carPartVisitor) {

        carPartVisitor.visit(this);
    }
}
