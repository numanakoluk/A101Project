import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    @Test
    public void run() throws InterruptedException {

        Boolean data = Init.StartTest();
        Assert.assertTrue(data);
        System.out.println("Success");
    }


}
