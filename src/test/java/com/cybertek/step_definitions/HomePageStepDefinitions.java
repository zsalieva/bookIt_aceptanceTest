package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {



    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("login");
       // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user logs in as Team lead")
    public void user_logs_in_as_Team_lead() {
        System.out.println("email "+ ConfigurationReader.getProperty("leader_email"));
        System.out.println("password "+ConfigurationReader.getProperty("leader_password"));

        SignInPage signInpage = new SignInPage();
        signInpage.email.sendKeys(ConfigurationReader.getProperty("leader_email"));
        signInpage.password.sendKeys(ConfigurationReader.getProperty("leader_password"));
        signInpage.signIn.click();
    }


    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        //Verify the Header
        String expected ="map";

        MapPage mapPage = new MapPage();
        String actual =mapPage.header.getText();

        //Assertions from Junit
        Assert.assertEquals(expected,actual);
        System.out.println("Expected Result: "+expected +"Actuual result: "+ actual);


    }

    @Then("the title should be correct")
    public void the_title_should_be_correct() {
        System.out.println("title should be");

    }


    @When("user logs in as teacher")
    public void user_logs_in_as_teacher() {
        System.out.println("teacher");
    }


    @When("user logs in as team member")
    public void user_logs_in_as_team_member() {

    }






}
