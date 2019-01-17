package ReverseArrayTest;

import ReverseCharArray.ReverseCharArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayCharTest {

    private ReverseCharArray reversecharArr;

    @Before
    public void setUp(){
        reversecharArr = new ReverseCharArray();
    }

    @Test
    public void reverseArrayOfChar(){
        char[] inputChars = {'a', 'b', 'c', 'd', 'e'};
        char[] outputChars = {'e', 'd', 'c', 'b', 'a'};
        Assert.assertArrayEquals(outputChars, reversecharArr.reverseCharArray(inputChars));
    }
}
