package cput.ac.za.Visitor;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class car implements carInterface {

    carInterface [] components;

    public car(){

        components = new carInterface[] {new engine(), new gearbox()};
    }

    public void accept(carVisitorDisplay carPartVisitor) {

        for(int i = 0; i < components.length; i++){

            components[i].accept(carPartVisitor);
        }

        carPartVisitor.visit(this);
    }
}
