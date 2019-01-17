package BuzzFizzTest;

import BuzzFizzCode.BuzzFizzCode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuzzFizzTest {

    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”
    private BuzzFizzCode buzzFizz;

    @Before
    public void setUp(){
        buzzFizz = new BuzzFizzCode();
    }
    @Test
    public void leaveNormalNumberAlone(){
        Assert.assertEquals("1", buzzFizz.checkNumber(1));
        Assert.assertEquals("2", buzzFizz.checkNumber(2));
    }

    @Test
    public void printFizzWhenInputIsMultipleThree(){
        Assert.assertEquals("Fizz", buzzFizz.checkNumber(3));
        Assert.assertEquals("Fizz", buzzFizz.checkNumber(6));
    }

    @Test
    public void printBuzzWhenInputIsMultipleFive(){
        Assert.assertEquals("Buzz", buzzFizz.checkNumber(5));
        Assert.assertEquals("Buzz", buzzFizz.checkNumber(10));
    }

    @Test
    public void printBuzzFizzWhenInoutIsMultipleThreeFive(){
        Assert.assertEquals("BuzzFizz", buzzFizz.checkNumber(15));
        Assert.assertEquals("BuzzFizz", buzzFizz.checkNumber(30));
    }

    @Test
    public void printAllOutputFromOneToHundred(){
        for(int i = 1; i <= 100; i++){
            System.out.println(buzzFizz.checkNumber(i));
        }
    }
}
