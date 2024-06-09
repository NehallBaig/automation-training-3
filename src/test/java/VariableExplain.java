import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VariableExplain {

    ChromeDriver driver;

    int amount;

    @Test(priority = 1)
    public void navigateToGoogle() {
        int amount;
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // url google
    }

    @Test(priority = 2)
    public void imOnGooglePage() {
        //driver = new ChromeDriver();
        String expected = "https://www.google.co";

        System.out.println("current url"+driver.getCurrentUrl());

        Assert.assertEquals(expected, driver.getCurrentUrl());
        // String water = "Water";
    }
    /*
        public void container1(){
            ChromeDriver driver = new ChromeDriver();
            // local variable
            String water = "Water";
        }

        public void container2(){
            ChromeDriver driver = new ChromeDriver();
            // String water = "Water";
            System.out.println(water);
        }

     */
}
