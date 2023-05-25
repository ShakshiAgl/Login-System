import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    // constructor for the class
    IDandPasswords() {
        // key is username and value is password
        // sample ids
        logininfo.put("Bro", "pizza");
        logininfo.put("Sis", "hamburger");
        logininfo.put("Dude", "pick");
    }

    // method with a HashMap return-type
    protected HashMap getLoginInfo() {
        return logininfo;
    }

}
