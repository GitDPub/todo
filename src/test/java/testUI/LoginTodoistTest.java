package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.StartPage;
import session.Session;

public class LoginTodoistTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    StartPage startPage = new StartPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com");
    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify verify The Login Using User And Password")
    @Owner("Dieter")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.buttonLogin.click();
        loginPage.textBoxEmail.type("dportanda@gmail.com");
        loginPage.textBoxPassword.type("1234abcd");
        loginPage.buttonLogIn.click();

        Thread.sleep(2000);

        Assert.assertTrue("ERROR , not able to login!", startPage.buttonGoToStart.isDisplayedOnPage());
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }

}
