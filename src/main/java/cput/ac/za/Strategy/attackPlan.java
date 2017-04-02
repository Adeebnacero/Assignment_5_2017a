package cput.ac.za.Strategy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class attackPlan implements strategyInterface{

    public String gamePlan(int minute, String msg) {

        if(minute <= 45) {

            msg = "Attack";

            return msg;
        }
            else

            msg = "Defend";

            return msg;
    }
}
