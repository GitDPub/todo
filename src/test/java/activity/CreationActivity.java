package activity;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreationActivity {

    public TextBox inputTitle;
    public TextBox inputNotes;
    public Button simpleCheckButton;
    public Button doubleCheckButton;
    public Button exitButton;
    public CheckBox checkBoxCompleted;

    public CreationActivity() {
        this.inputTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        this.inputNotes = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        this.simpleCheckButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        this.doubleCheckButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveAndNew"));
        this.exitButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
        this.checkBoxCompleted = new CheckBox(By.id("com.vrproductiveapps.whendo:id/note_item_marked"));
    }
}
