package ValidParenthesesTest;

import ValidParentheses.ValidParentheses;
import ValidParentheses.EmptyParenthesesInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     *     Open brackets must be closed by the same type of brackets.
     *     Open brackets must be closed in the correct order.
     */

    private ValidParentheses validParentheses;

    @Before
    public void setUp(){
        validParentheses = new ValidParentheses();
    }

    @Test
    public void  validParenthesesSmallBracketReturnTrue() throws EmptyParenthesesInput{
        String input = "()";
        Assert.assertTrue(validParentheses.validParenthesesCode(input));
    }

    @Test
    public void  invalidParenthesesSmallBracketReturnFalse() throws EmptyParenthesesInput{
        String input = ")(";
        Assert.assertFalse(validParentheses.validParenthesesCode(input));
    }

    @Test
    public void  validParenthesesCurlyBracketReturnFalse() throws EmptyParenthesesInput{
        String input = "{}";
        Assert.assertTrue(validParentheses.validParenthesesCode(input));
    }

    @Test
    public void  invalidParenthesesCurlyBracketReturnFalse() throws EmptyParenthesesInput{
        String input = "}{";
        Assert.assertFalse(validParentheses.validParenthesesCode(input));
    }

    @Test
    public void validParenthesesFullBracketReturnFalse() throws EmptyParenthesesInput{
        String input = "[]";
        Assert.assertTrue(validParentheses.validParenthesesCode(input));
    }

    @Test
    public void invalidParenthesesFullBracketReturnFalse() throws EmptyParenthesesInput{
        String input = "][";
        Assert.assertFalse(validParentheses.validParenthesesCode(input));
    }

    @Test(expected = EmptyParenthesesInput.class)
    public void emptyParenthesesBracketReturnException() throws Exception {
        String input = "";
        validParentheses.validParenthesesCode(input);
    }

    @Test
    public void validParenthesesExampleReturnTrue() throws EmptyParenthesesInput{
        Assert.assertTrue(validParentheses.validParenthesesCode("{[]}"));
        Assert.assertTrue(validParentheses.validParenthesesCode("{}()[]"));
    }

    @Test
    public void invalidParenthesesExampleReturnFalse() throws EmptyParenthesesInput{
        Assert.assertFalse(validParentheses.validParenthesesCode("{]}"));
        Assert.assertFalse(validParentheses.validParenthesesCode("{}([)[]"));
    }
}
