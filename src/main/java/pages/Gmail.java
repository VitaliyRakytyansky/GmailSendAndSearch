package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Winterfall on 04.04.2016.
 */
public class Gmail {

    public static void visit() {
        open("http://gmail.com");
    }

    public static void login(String login, String password) {
        $("#Email").setValue(login).pressEnter();
        $("#Passwd").setValue(password).pressEnter();
    }
}
