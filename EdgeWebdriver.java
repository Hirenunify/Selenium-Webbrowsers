package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebdriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();


    }
}
