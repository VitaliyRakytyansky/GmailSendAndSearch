package pages;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Winterfall on 04.04.2016.
 */
public class Menu {

    public static void goToInbox() {
        $("a[title^='Inbox']").click();
    }

    public static void goToSent() {
        $(byLinkText("Sent Mail")).click();
    }

    public static void refreshPage() {
        $(".asf").click();
    }
}
