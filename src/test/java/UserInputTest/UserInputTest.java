package UserInputTest;

import UserInputCode.NumericInput;
import UserInputCode.TextInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserInputTest {

    private TextInput textinput;

    /*@Before
    public void setUp(){
        textinput = new TextInput();
    }*/

    @Test
    public void getAddedCharacterAsString(){
        textinput = new TextInput();
        textinput.add('a');
        textinput.add('1');
        System.out.println(textinput.getValue());
        Assert.assertEquals("a1",textinput.getValue());
    }

    @Test
    public void removeNumericCharacterWhenAdded(){
        textinput = new NumericInput();
        textinput.add('a');
        textinput.add('1');
        System.out.println(textinput.getValue());
        Assert.assertEquals("a",textinput.getValue());
    }

}
