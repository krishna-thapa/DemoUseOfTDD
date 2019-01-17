package StringVowelsTest;

import StringVowels.EmptyStringException;
import StringVowels.StringChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringVowelsTest {

    /*
    String Processor
    Implement a string processor that allows to do operations with strings.

    Acceptance Criteria
    countVowels
    if vowels exist should return the number of vowels.
    if vowels don't exist should return 0.
    if string is empty should throw EmptyStringException.
     */

    private StringChecker stringChecker;

    @Before
    public void setUp(){
        stringChecker = new StringChecker();
    }

    @Test
    public void countTotalVowelsInString() throws EmptyStringException {
        Assert.assertEquals(5,stringChecker.countVowels("aeious"));
        Assert.assertEquals(5,stringChecker.countVowels("AEIOU"));
    }

    @Test
    public void returnZeroWhenNoVowels() throws EmptyStringException{
        Assert.assertEquals(0,stringChecker.countVowels("sdfghjkl"));
    }

    @Test(expected = EmptyStringException.class)
    public void emptyExceptionWhenEnterEmptyString() throws EmptyStringException{
        stringChecker.countVowels("");
    }
}
