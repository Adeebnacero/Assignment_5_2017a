package cput.ac.za.Bridge;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runHolder {

    public static void main(String[] args) {

        holderType cup = new holder("Red",50, 15, new cup());
        holderType glass = new holder("Clear",100, 10, new glass());

        cup.production();
        glass.production();
    }
}
