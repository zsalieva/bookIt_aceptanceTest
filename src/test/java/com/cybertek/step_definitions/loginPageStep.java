package com.cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageStep {

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String string, String string2) {
        System.out.println("Email: "+string + " password "+string2);

    }
    @Then("title should {string}")
    public void title_should(String string) {
        System.out.println(" Title is "+ string);
    }
    @Then("there should be {int} menu options")
    public void there_should_be_menu_options(Integer int1) {
        System.out.println(" number given "+int1);
    }





}
