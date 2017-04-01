package cput.ac.za.AbstractFactory;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runAbstractFactory {

    public static void main (String [] args){

        abstractFactory vehicleFactory = factoryProducer.getFactory("vehicle");
        abstractFactory colorFactory = factoryProducer.getFactory("color");

        vehicleInterface v1 = vehicleFactory.getType("suv");
        v1.type();

        colorInterface c1 = colorFactory.getColor("black");
        c1.color();

        vehicleInterface v2 = vehicleFactory.getType("saloon");
        v2.type();

        colorInterface c2 = colorFactory.getColor("red");
        c2.color();
    }
}
