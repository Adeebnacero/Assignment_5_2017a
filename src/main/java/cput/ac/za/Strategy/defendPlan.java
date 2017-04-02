package cput.ac.za.Strategy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class defendPlan implements strategyInterface {

    public String gamePlan(int minute, String msg) {

        if(minute >= 46) {

            msg = "Defend";

            return msg;
        }
        else

            msg = "Attack";

        return msg;
    }
}
