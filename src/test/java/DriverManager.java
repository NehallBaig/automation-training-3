import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

    public static void main(String[] args) {


        // Add Comment

        // chromeDriver is Reference of ChromeDriver's Object
        ChromeDriver chromeDriver = new ChromeDriver();

        // Get function is used to navigate to the url
        chromeDriver.get("https://www.google.com");

        // edgeDriver is Reference of EdgeDriver's Object
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.youtube.com");

        chromeDriver.get("https://www.youtube.com");






        //System.out.println("HI helo: ) ");
    }
}
