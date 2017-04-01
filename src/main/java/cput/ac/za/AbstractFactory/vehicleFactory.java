package cput.ac.za.AbstractFactory;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class vehicleFactory extends abstractFactory{

    public vehicleInterface getType(String vType){

        if(vType == null){

            return null;
        }

        if(vType.equalsIgnoreCase("SUV")){

            return new suv();
        }

        if(vType.equalsIgnoreCase("Saloon")){

            return new saloon();
        }

        return null;
    }

    colorInterface getColor(String vColor){
        return null;
    }
}
