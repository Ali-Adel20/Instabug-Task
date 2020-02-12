package SearchTest;

import BasePackage.BaseTest;
import GooglePage.GooglePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleAssertions extends BaseTest {

    @Test
    public void assertions() {
        GooglePage googlePage = new GooglePage();
        SoftAssert softAssertion = new SoftAssert();

        //Check URL of the WebSite
        String current_url = "https://www.google.com/";
        String url = driver.getCurrentUrl();
        softAssertion.assertEquals(url, current_url, "Google URL not opened");

        //Check Title of the WebSite
        String current_title = "Google";
        String title = driver.getTitle();
        softAssertion.assertEquals(current_title, title, "Google Title not opened");

        //Check Google Logo
        softAssertion.assertTrue(googlePage.icon_presence(), "Google Logo not Displayed");

        //Check Button of Google Search
        softAssertion.assertEquals(googlePage.Search_get_text(), "Google Search", "Button Google Search Text is incorrect");

        //Check Button of Lucky Search
        softAssertion.assertEquals(googlePage.Lucky_get_text(), "I'm Feeling Lucky", "Button Lucky Search Text is incorrect");
        softAssertion.assertAll();
    }
}
