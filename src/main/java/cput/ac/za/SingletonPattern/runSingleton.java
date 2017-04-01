package cput.ac.za.SingletonPattern;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runSingleton {

    public static void main (String [] args) {

        Singleton single = Singleton.getInstance();

        System.out.println(single.concat("Adeeb","Nacerodien")+"\n"+single.idNumber(880));

    }
}
