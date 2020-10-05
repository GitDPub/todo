package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button singUpFreeButton= new Button(By.xpath("//a[@href=\"/users/showlogin\"]"), "[Login] Button on main page");

}
