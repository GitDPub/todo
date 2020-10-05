package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox textBoxEmail= new TextBox(By.id("email"), "[Email] textBox on Login Page");
    public TextBox textBoxPassword = new TextBox(By.id("password"), "[Password] textBox on Login Page");
    public Button buttonLogIn = new Button(By.className("submit_btn ist_button ist_button_red sel_login"), "[Log In] button on Login Page");
}
