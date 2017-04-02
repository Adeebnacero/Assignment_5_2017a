package cput.ac.za.Strategy;

/**
 * Created by Adeebo on 2017/04/01.
 */
public class runStrategy {

    public static void main (String [] args){

        decisionMaker d1 = new decisionMaker(new attackPlan());
        System.out.println("Second half: " + d1.executePlan(78,";"));

        d1 = new decisionMaker(new defendPlan());
        System.out.println("First half: " + d1.executePlan(40,""));
    }
}
