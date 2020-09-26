package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addButton;
    public Label labelTitleOneTaskOnly;

    public MainActivity() {
        this.addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        this.labelTitleOneTaskOnly = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    }
}
