package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{
    @FindBy(css = "a[href='/instructors']")
    private WebElement instructorsTab;


    public void clickInstructorsTab() {
        instructorsTab.click();
    }

}
