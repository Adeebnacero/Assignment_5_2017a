package cput.ac.za.Adapter;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class imageReader implements viewerInterface {

    viewerAdapter viewer;

    public void read(String fileType, String fileName) {

        if(fileType.equalsIgnoreCase("jpg") || fileType.equalsIgnoreCase("jpeg")){

            System.out.println("Reading JPEG file \n"+ "Name: " + fileName + " Downloaded");

        }
            else if(fileType.equalsIgnoreCase("pdf") || fileType.equalsIgnoreCase("giff")){

                viewer = new viewerAdapter(fileType);
                viewer.read(fileType, fileName);

            }
                else{

            System.out.println("Reading " + fileType + " file \n"+ "Image file format not supported: " + fileName);
        }
    }
}
