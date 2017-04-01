package cput.ac.za.Adapter;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runReader {

    public static void main (String [] args){

        imageReader reading = new imageReader();

        reading.read("pdf","githublink.pdf");
        reading.read("jpeg","screenshot.jpeg");
        reading.read("giff","runningman.giff");
        reading.read("dmi","backup.dmi");
    }
}
