package cput.ac.za.Visitor;

/**
 * Created by Adeebo on 2017/04/01.
 */
public interface visitorInterface {

    public void visit(engine e);
    public void visit(gearbox g);
    public void visit(car c);
}
