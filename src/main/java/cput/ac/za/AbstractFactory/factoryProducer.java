package cput.ac.za.AbstractFactory;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class factoryProducer {

    public static abstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("vehicle")){

            return new vehicleFactory();

        }else if(choice.equalsIgnoreCase("color")){

            return new colorFactory();
        }

        return null;
    }
}
