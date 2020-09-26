package testToDo;

import activity.CreationActivity;
import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class FlowTwoTest {
    MainActivity flowTwo;
    CreationActivity flowTwoCreation;

    @Before
    public void before() {
        flowTwo = new MainActivity();
        flowTwoCreation = new CreationActivity();
    }

    @Test
    public void TaskAddedDoubleCheckCompleted() throws MalformedURLException {
        String expectedResult = "Flow Two";
        flowTwo.addButton.Click();
        flowTwoCreation.inputTitle.Write("Flow Two");
        flowTwoCreation.inputNotes.Write("Flow Two automation.");
        flowTwoCreation.checkBoxCompleted.Check();
        flowTwoCreation.doubleCheckButton.Click();

        String titleAfterFilled = flowTwoCreation.inputTitle.GetText();
        String notesAfterFilled = flowTwoCreation.inputNotes.GetText();
        boolean completedCheckBox = flowTwoCreation.checkBoxCompleted.IsChecked();

        flowTwoCreation.exitButton.Click();

        String actualResult = flowTwo.labelTitleOneTaskOnly.GetText();

        Assert.assertTrue("No empty input title after task created", titleAfterFilled.equals("Title"));
        Assert.assertTrue("No empty input notes after task created", notesAfterFilled.equals("Notes"));
        Assert.assertFalse("Completed CheckBox is checked", completedCheckBox);
        Assert.assertEquals("New task is not in the list", expectedResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().CloseSession();
    }
}
