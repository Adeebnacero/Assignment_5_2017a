package cput.ac.za.Proxy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runProxy {

    public static void main (String [] args){

        imageInterface i1 = new proxyImage("Picture1.jpg");

        i1.render();
        System.out.println("Below image from loaded via proxy");
        i1.render();
    }
}
