package cput.ac.za.Prototype;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class manager implements cloneInterface{

    private String position;

    public manager(String position){

        this.position = position;
    }

    //@Override
    public cloneInterface copy(){

        return new manager(position);
    }

    @Override
    public String toString(){

        return "Manager: " + position;
    }

}
