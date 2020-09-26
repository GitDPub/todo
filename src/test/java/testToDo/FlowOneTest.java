package testToDo;

import activity.CreationActivity;
import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class FlowOneTest {

    MainActivity flowOne;
    CreationActivity flowOneCreation;

    @Before
    public void before() {
        flowOne = new MainActivity();
        flowOneCreation = new CreationActivity();
    }

    @Test
    public void VerifyTaskAdded() throws MalformedURLException {
        String expectedResult = "Flow One";
        flowOne.addButton.Click();
        flowOneCreation.inputTitle.Write("Flow One");
        flowOneCreation.inputNotes.Write("Flow One automation.");
        flowOneCreation.simpleCheckButton.Click();
        String actualResult = flowOne.labelTitleOneTaskOnly.GetText();
        Assert.assertEquals("no match", expectedResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().CloseSession();
    }
}
