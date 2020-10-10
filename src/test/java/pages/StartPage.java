package pages;

import control.Button;
import org.openqa.selenium.By;

public class StartPage {
    public Button buttonGoToStart = new Button(By.xpath("//*[@id=\"top_bar_inner\"]/div[1]/button[2]"), "[Start] Button on start page");
}
