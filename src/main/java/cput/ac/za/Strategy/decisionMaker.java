package cput.ac.za.Strategy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class decisionMaker {

    private strategyInterface strategy;

    public decisionMaker(strategyInterface strategy){

        this.strategy = strategy;
    }

    public int executePlan(int minute){

        return strategy.gamePlan(minute);
    }
}
