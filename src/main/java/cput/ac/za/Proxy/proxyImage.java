package cput.ac.za.Proxy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class proxyImage implements imageInterface {

    private actualImage aImage;
    private String file;

    public proxyImage(String file){

        this.file = file;
    }

    //@Override
    public void render() {
        if(aImage == null){

            aImage = new actualImage(file);
        }

            aImage.render();
    }
}
