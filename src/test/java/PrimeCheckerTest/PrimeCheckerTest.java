package PrimeCheckerTest;

import PrimeCheckerCode.PrimeChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeCheckerTest {

    private PrimeChecker primeChecker;

    @Before
    public void setUp(){
        primeChecker = new PrimeChecker();
    }

    @Test
    public void returnTrueWhenNumberIsPrime(){
        Assert.assertTrue(primeChecker.checkPrime(5));
    }

    @Test
    public void returnFalseWhenNumberIsNotPrime(){
        Assert.assertFalse(primeChecker.checkPrime(0));
    }

}
