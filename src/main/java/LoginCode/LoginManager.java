package LoginCode;

import java.util.HashMap;
import java.util.Map;

public class LoginManager {
    Map<String, String> credentials = new HashMap<String, String>();

    public boolean login(String username, String password) throws EmptyCredentailsDetails, InvalidCredentailsException{
        credentials.put("username", "password");
        if(username.isEmpty() || password.isEmpty()){
            throw new EmptyCredentailsDetails("Input Credentials are empty!");
        }
        if(credentials.containsKey(username) && credentials.get(username).equals(password)){
            return true;
        }

        throw new InvalidCredentailsException("Input Credentials are invalid");
    }
}
