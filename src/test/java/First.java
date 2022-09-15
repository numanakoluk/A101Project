import org.junit.Assert;
import org.junit.Test;

public class First {

    @Test
    public void run() throws InterruptedException {

        Boolean data = Init.StartTest();
        Assert.assertTrue(data);
        System.out.println("Success");
    }


}
