package cput.ac.za.Bridge;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class holder extends holderType {

    private String color;
    private int height, width;

    public holder(String color, int height, int width, produceInterface produce){

        super(produce);
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void production(){

        produce.makeHolders(color,height,width);
    }
}
