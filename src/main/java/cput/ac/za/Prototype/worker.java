package cput.ac.za.Prototype;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class worker implements cloneInterface {

    private String name;

    public worker (String name){

        this.name = name;
    }

   //@Override
    public cloneInterface copy(){

        return new worker(name);
    }

    @Override
    public String toString(){

        return "Worker: " + name;
    }
}
