package example.checkfriday;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

  private String today;
  private String answer;

  @Given("today is {string}")
  public void today_is(String weekday) {
    today = weekday;
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_it_s_friday_yet() {
    CheckFriday checkFriday = new CheckFriday();
    answer = checkFriday.check(today);
  }

  @Then("I should be told {string}")
  public void i_should_be_told(String string) {
    assertEquals(string, answer);
  }

}
