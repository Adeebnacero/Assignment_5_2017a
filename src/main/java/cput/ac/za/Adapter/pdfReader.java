package cput.ac.za.Adapter;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class pdfReader implements advancedViewerInterface {

    public void readPDF(String fileName){

        System.out.println("Reading PDF file.\n" + "File Name: " + fileName + " Downloaded");
    }

    public void readGIF(String fileName){

    }
}
