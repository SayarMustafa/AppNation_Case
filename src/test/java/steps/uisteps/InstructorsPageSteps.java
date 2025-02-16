package steps.uisteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class InstructorsPageSteps extends UiBaseSteps {
    @When("user clicks the Instructors tab")
    public void userClicksTheInstructorsTab() {
        PAGES.getHomepage().clickInstructorsTab();
    }

    @Then("user should be on the instructors page")
    public void userShouldBeOnTheInstructorsPage() {
        Assertions.assertThat(PAGES.getInstructorsPage().getInstructorsPageTitle()).as("The user should be on the instructors page").isEqualTo("Instructors");
    }

    @Then("the number of instructors should be greater than {int}")
    public void theNumberOfInstructorsShouldBeGreaterThan(int count) {
        Assertions.assertThat(PAGES.getInstructorsPage().getNumberOfInstructors()).as("The instructors count should be greater than %s", count).isGreaterThan(count);
    }

    @Then("the number of instructors should be equal to {int}")
    public void theNumberOfInstructorsShouldBeEqualTo(int count) {
        Assertions.assertThat(PAGES.getInstructorsPage().getNumberOfInstructors()).as("The instructors count should be %s", count).isEqualTo(count);
    }

}
