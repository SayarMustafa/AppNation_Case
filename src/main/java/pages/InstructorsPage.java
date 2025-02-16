package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InstructorsPage extends BasePage{

    @FindBy(css = ".instructor-item")
    private List<WebElement> instructorsList;

    @FindBy(css = "div[class='page-title'] div[class='container']")
    private WebElement instructorsPageTitle;


    public Integer getNumberOfInstructors() {
        return instructorsList.size();
    }

    public Boolean isInstructorListEmpty() {
        return instructorsList.isEmpty();
    }

    public String getInstructorsPageTitle() {
        return instructorsPageTitle.getText();
    }
}
