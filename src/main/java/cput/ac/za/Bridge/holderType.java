package cput.ac.za.Bridge;

/**
 * Created by Adeebo on 2017/04/01.
 */
public abstract class holderType {

    protected produceInterface produce;

    protected holderType(produceInterface produce){

        this.produce = produce;
    }

    public abstract void production();
}
