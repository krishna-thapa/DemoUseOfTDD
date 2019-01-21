package ValidAnagramTest;

import ValidAnagram.ValidAnagram;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {

    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     */

    private ValidAnagram validAnagram;

    @Before
    public void setUp(){
        validAnagram = new ValidAnagram();
    }

    @Test
    public void whenInputAreNullReturnTrue(){
        String s = "";
        String t = "";
        Assert.assertTrue(validAnagram.calculateValidAnagram(s,t));
    }

    @Test
    public void whenInputsAreNotEqualLengthReturnFalse(){
        String s = "abc";
        String t = "abcdef";
        Assert.assertFalse(validAnagram.calculateValidAnagram(s,t));
    }

    @Test
    public void whenInputsValidReturnTrue(){
        String s = "abc";
        String t = "bca";
        Assert.assertTrue(validAnagram.calculateValidAnagram(s,t));
        Assert.assertTrue(validAnagram.calculateValidAnagram("anagram","gramnaa"));
    }

    @Test
    public void whenInputsInValidReturnFalse(){
        String s = "abc";
        String t = "bcg";
        Assert.assertFalse(validAnagram.calculateValidAnagram(s,t));
    }
}
