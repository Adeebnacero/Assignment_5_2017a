package cput.ac.za.Proxy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class actualImage implements imageInterface {

    private String file;

    public actualImage(String file){

        this.file = file;
        USBload(file);

    }

    //@Override
    public void render(){

        System.out.println("Rendering image: " + file);
    }

    private void USBload(String file){

        System.out.println("Loading image from USB: " + file);
    }
}
