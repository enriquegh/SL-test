import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.junit.Assert.assertEquals;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkingSauce {

  public static final String USERNAME = System.getenv("SAUCE_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
  public WebDriver driver;

  public static void main(String[] args) throws Exception {
	/**
	*
	* Task II - Comment out the code from Task I. Update the test code so when it runs,
	* the test is able to write "Sauce" in the text box that currently says "I has no focus".
	*


	* Task III - Update the test code so when it runs, it adds an email to the email field,
	* adds text to the comments field, and clicks the "Send" button.


	* Note that email will not actually be sent!
	*
	* Task IV - Add a capability that adds a tag to each test that is run.
        * See this page for instructions: https://wiki.saucelabs.com/display/DOCS/Test+Configuration+Options
	*/

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 7");
    caps.setCapability("browserName", "chrome");
    caps.setCapability("version", "48");
    caps.setCapability("name", "Guinea-Pig Sauce");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

  /**
  * Goes to Sauce Lab's guinea-pig page and verifies the title
  */

    driver.get("https://saucelabs.com/test/guinea-pig");
    assertEquals("I am a page title - Sauce Labs", driver.getTitle());

// Task I

// FindBy(id="i am a link");    //Find element by id or other identifying factor (e.g. text)
// public WebElement activeLink;   // Set it equal to a variable to be used

// public void clickLink() {    //Define a function for the action to be performed
// this.activeLink.click();     // Define the action to be performed on the variable
// }
//
// this.createDriver(browserName, version, platform, method.getName());   // Create the web driver instance
//     WebDriver driver = this.getWebDriver();
//
//     GuineaPigPage page = GuineaPigPage.visitPage(driver);
//
//     page.clickLink();    // After directing the WebDriver to the correct page, use the function defined above.

// Task II

FindBy(id="i_am_a_textbox");
private WebElement textboxInput;

public static void main(String[] args) throws Exception {
  this.createDriver(String browser, String version, String os, Method method.getName());
      WebDriver driver = this.getWebDriver();

      textboxInput.sendKeys(Sauce); //No need to use page variable above since we're changing page content

// Task III

FindBy(id="comments");
private WebElement userComments;

FindBy(id="submit");
private WebElement submitButton;

public static void main(String[] args) throws Exception {
  this.createDriver(String browser, String version, String os, Method method.getName());
      WebDriver driver = this.getWebDriver();

      userComments.sendKeys(Sauce);
      submitButton.click() //Combination of the two prior tests

    driver.quit();
  }
}
