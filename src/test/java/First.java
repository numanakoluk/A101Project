import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class First {


    @Test
    public void run() throws InterruptedException {

        Boolean data = Init.StartTest();
        Assert.assertTrue(data);
        System.out.println("Success");
    }



}
