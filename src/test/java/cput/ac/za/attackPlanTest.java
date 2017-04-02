package cput.ac.za;

import cput.ac.za.Strategy.attackPlan;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/04/02.
 */
public class attackPlanTest {

    @Test
    public void testGamePlan() throws Exception {

        attackPlan ap1 = new attackPlan();

        String result = ap1.gamePlan(32,"");

        Assert.assertEquals(result, 32,"");

    }
}