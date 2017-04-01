package cput.ac.za.SingletonPattern;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class Singleton {

    private static Singleton single = null;

    private Singleton() {
    }

    public static Singleton getInstance(){

        if(single == null){

            single = new Singleton();
        }

        return single;
    }

    public String concat(String name, String surname){

        return name+ " " +surname;
    }

    public int idNumber(int id){

        return id;
    }
}
