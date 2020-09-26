package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addButton;

    public MainActivity() {
        this.addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }
}
