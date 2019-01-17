package LoginTest;

import LoginCode.EmptyCredentailsDetails;
import LoginCode.InvalidCredentailsException;
import LoginCode.LoginManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    /*
    Login Manager
    Implement a login manager that supports the login operation.

    Acceptance Criteria
    if credentials are valid should return true.
    if credentials are invalid should throw InvalidCredentialsException.
    if password is empty should throw EmptyPasswordException.
     */

    private LoginManager loginManager;

    @Before
    public void setUp(){
        loginManager = new LoginManager();
    }

    @Test
    public void validTestCredentialsReturnTrue() throws Exception{
        String username = "username";
        String password = "password";
        Assert.assertTrue(loginManager.login(username,password));
    }

    @Test(expected = InvalidCredentailsException.class)
    public void inValidTestCredentialsReturnFalse() throws Exception{
        String username = "username";
        String invalidUsername = "invalidusername";
        String password = "wrongpassword";
        Assert.assertFalse(loginManager.login(username,password));
        Assert.assertFalse(loginManager.login(invalidUsername,password));
    }

    @Test(expected = EmptyCredentailsDetails.class)
    public void emptyExceptionReturnWhenEmptyCredentialsProvided() throws Exception{
        String username = "username";
        String password = "";
        loginManager.login(username,password);
        loginManager.login("",password);
    }
}
