package testData;

import org.junit.Test;
import pages.Gmail;
import pages.Mails;
import pages.Menu;

import static core.Helpers.getUniqueText;

public class GmailTest {

    public static String mailSubject = getUniqueText("Letter");

    @Test
    public void testLoginSendAndSearch() {

        Gmail.visit();

        Gmail.login(TestData.email, TestData.password);

        Mails.send(TestData.email, mailSubject);

        Menu.refreshPage();
        Mails.assertMail(0, mailSubject);

        Menu.goToSent();
        Mails.assertMail(0, mailSubject);

        Menu.goToInbox();
        Mails.searchBySubject(mailSubject);

        Mails.assertMails(mailSubject);
    }

}
