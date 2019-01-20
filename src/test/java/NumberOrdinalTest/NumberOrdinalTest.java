package NumberOrdinalTest;

import NumberOrdinal.NumberOrdinal;
import NumberOrdinal.ZeroException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOrdinalTest {

    private NumberOrdinal numberOrdinal;

    @Before
    public void setUp(){
        numberOrdinal = new NumberOrdinal();
    }

    @Test
    public void whenEnterEndingWithOneReturnst() throws ZeroException{
        int input = 1;
        Assert.assertEquals("1st", numberOrdinal.calculateNumberOrdinal(input));
    }

    @Test
    public void whenEnterEndingWithTwoReturnnd() throws ZeroException{
        int input = 2;
        Assert.assertEquals("2nd", numberOrdinal.calculateNumberOrdinal(input));
    }

    @Test
    public void whenEnterEndingWithThirdReturnrd() throws ZeroException{
        int input = 3;
        Assert.assertEquals("3rd", numberOrdinal.calculateNumberOrdinal(input));
    }

    @Test
    public void whenEnterEndingWithRestReturnth() throws ZeroException{
        int input = 4;
        Assert.assertEquals("4th", numberOrdinal.calculateNumberOrdinal(input));
    }

    @Test(expected = ZeroException.class)
    public void whenEnterEndingWithZeroReturnException() throws ZeroException {
        int input = 0;
        numberOrdinal.calculateNumberOrdinal(input);
    }
}
