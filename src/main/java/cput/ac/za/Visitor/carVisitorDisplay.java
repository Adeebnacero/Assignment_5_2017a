package cput.ac.za.Visitor;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class carVisitorDisplay  implements visitorInterface{


    public void visit(engine e) {

        System.out.println("Engine view");
    }

    public void visit(gearbox g) {

        System.out.println("Gearbox view");
    }

    public void visit(car c) {

        System.out.println("Car view");
    }
}
