package cput.ac.za.Adapter;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class viewerAdapter implements viewerInterface {

    advancedViewerInterface advancedViewer;

    public viewerAdapter(String fileType){

        if(fileType.equalsIgnoreCase("pdf")){

            advancedViewer = new pdfReader();

        }   else if (fileType.equalsIgnoreCase("giff")) {

                advancedViewer = new giffReader();
            }
    }

    //@Override
    public void read(String fileType, String fileName){

        if(fileType.equalsIgnoreCase("pdf")){

            advancedViewer.readPDF(fileName);

        }   else if(fileType.equalsIgnoreCase("giff")) {

                advancedViewer.readGIF(fileName);
            }
    }
}
