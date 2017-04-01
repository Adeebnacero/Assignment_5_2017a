package cput.ac.za.ChainOfResponsibility;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class Request {

    private int level;
    private String description;

    public Request(String desc, int lvl) {

        description = desc;
        level = lvl;
    }

    public String getDescription() {

        return description;
    }

    public int getLevel() {

        return level;
    }
}
