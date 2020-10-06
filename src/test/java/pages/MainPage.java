package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button buttonLogin = new Button(By.xpath("//a[@href=\"/users/showlogin\"]"), "[Login] Button on main page");

}
