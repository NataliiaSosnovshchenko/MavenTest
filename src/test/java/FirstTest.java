import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*Alt+Enter подтянуть библиотеки с подчеркнутях красных*/
public class FirstTest
{
    @Test
    public void FirstTest()
    {
        System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.opencart.com/");
    }

}
