package cput.ac.za.AbstractFactory;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class colorFactory extends abstractFactory {

    public colorInterface getColor(String vColor){

    if(vColor == null){

        return null;
    }

    if(vColor.equalsIgnoreCase("Red")){

        return new red();
    }

    if(vColor.equalsIgnoreCase("Black")){

        return new black();
    }

    return null;
}

    vehicleInterface getType(String vType){
        return null;
    }
}
