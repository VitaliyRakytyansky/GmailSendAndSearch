package pages;

import com.codeborne.selenide.ElementsCollection;
import TestData;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;



/**import static
 * Created by Winterfall on 04.04.2016.
 */
public class Mails {

    public static ElementsCollection mails = $$("[role = 'main'] .zA");

    public static void send(String email, String mailSubject) {
        $(byText("COMPOSE")).click();
        $(byName("to")).setValue(TestData.email);
        $(byName("subjectbox")).setValue(mailSubject);
        $(byText("Send")).click();
    }

    public static void assertMail(int index, String emailText) {
        mails.get(index).shouldHave(text(emailText));
    }

    public static void assertMails(String... emailTexts) {
        mails.shouldHave(texts(emailTexts));
    }

    public static void searchBySubject(String mailSubject) {
        $(byName("q")).setValue("subject :" + mailSubject).pressEnter();
    }
}
