package GooglePage;

import BasePackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseTest {
    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    WebElement Search_Field;

    @FindBy(name = "btnK")
    WebElement Search_btn;

    @FindBy(name = "btnI")
    WebElement Lucky_btn;

    @FindBy(id = "hplogo")
    WebElement google_icon;

    public boolean icon_presence() {
        boolean appear = google_icon.isDisplayed();
        return appear;
    }

    public String Search_get_text() {
        String button1 = Search_btn.getText();
        return button1;
    }

    public String Lucky_get_text() {
        String button2 = Lucky_btn.getText();
        return button2;
    }

    public void Search_Field(String search_txt) {

        Search_Field.click();
        Search_Field.clear();
        Search_Field.sendKeys(search_txt);
        Search_Field.submit();
    }

}
