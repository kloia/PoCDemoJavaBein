package com.poc.stepDefinitions;

import com.poc.pages.Homepage;
import com.poc.pages.LoginPage;
import com.poc.pages.PlayerPage;
import com.poc.utils.ConfReader;
import com.poc.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepDefinitions {

    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    PlayerPage playerPage = new PlayerPage();

    @Given("the homepage is opened")
    public void the_homepage_is_opened() {
        String url = ConfReader.get("url");

        Driver.get().get(url);
    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        homepage.clickLoginButton();
    }

    @Given("user login with valid account")
    public void user_login_with_valid_account() {
        loginPage.loginWithValidAccount();

    }

    @When("user navigate to {string} under {string}")
    public void user_navigate_to_under(String subMenu, String title) {
        homepage.navigateModule(subMenu, title);
    }

    @Then("page should include {string}")
    public void page_should_include(String channelName) {
        playerPage.isChannelInTheList(channelName);
    }

    @Then("user pause and start player")
    public void user_pause_and_start_player() {
        playerPage.clickPlayButton();
        playerPage.clickPlayButton();
        Assert.assertTrue(false);
    }


    @And("my hobby")
    public void myHobby() {
        System.out.println("hobilerim şunlar");
    }
}
