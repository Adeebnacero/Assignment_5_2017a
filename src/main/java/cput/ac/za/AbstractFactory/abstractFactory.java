package cput.ac.za.AbstractFactory;

/**
 * Created by Adeebo on 2017/04/01.
 */
public abstract class abstractFactory {

    abstract vehicleInterface getType(String type);
    abstract colorInterface getColor(String color);
}
