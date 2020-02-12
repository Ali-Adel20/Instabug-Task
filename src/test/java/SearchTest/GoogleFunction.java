package SearchTest;

import BasePackage.BaseTest;
import GooglePage.GooglePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleFunction extends BaseTest {

    @Test
    public void function() {
        GooglePage googlePage = new GooglePage();
        SoftAssert softAssertion = new SoftAssert();
        String Text = "instabug";
        googlePage.Search_Field(Text);

        //Check Title of the WebSite
        boolean title = driver.getTitle().contains("instabug");
        softAssertion.assertTrue(title, "Google Seacrh Title is inscorrect");
    }
}
