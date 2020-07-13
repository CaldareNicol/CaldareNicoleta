package lessons._24;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.endsWith;

public class CreateAccountTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Create new account and login successfully")
    public void createAccountTest() {
        String gender= "Mrs.";
        driver.navigate().to("http://automationpractice.com/");
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php"));

        driver.findElement(By.cssSelector("a.login")).click();
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php?controller=authentication&back=my-account"));

        By loginFormLocator = By.id("login_form");
        By createAccountFormLocator = By.id("create-account_form");

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.className("page-heading"), "AUTHENTICATION"));

        WebElement loginForm = driver.findElement(loginFormLocator);
        WebElement createAccountForm = driver.findElement(createAccountFormLocator);

        Assertions.assertTrue(loginForm.isDisplayed());
        Assertions.assertTrue(createAccountForm.isDisplayed());

        WebElement emailInput = createAccountForm.findElement(By.id("email_create"));
        emailInput.sendKeys("caldarenicol"+
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + "@getnada.com");

        createAccountForm.findElement(By.id("SubmitCreate")).click();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.className("page-heading"), "CREATE AN ACCOUNT"));
//        MatcherAssert.assertThat(driver.getCurrentUrl(), Matchers.endsWith("#account-creation"));

        WebElement creationAccountForm = driver.findElement(By.id("account-creation_form"));
        Assertions.assertTrue(creationAccountForm.isDisplayed());

      WebElement genderElement=creationAccountForm.findElement(By.xpath("//label[contains(@for ,'id_gender') and normalize-space()='"+gender +"']//input"));
        genderElement.click();

        WebElement date= creationAccountForm.findElement(By.id("days"));
        WebElement month= creationAccountForm.findElement(By.id("months"));
        WebElement year= creationAccountForm.findElement(By.id("years"));

        new Select(date).selectByIndex(27);
        new Select(month).selectByVisibleText("March ");
        new Select(year).selectByValue("2003");

        WebElement firstNameInput= creationAccountForm.findElement(By.id("customer_firstname"));
        firstNameInput.sendKeys("Caldare");

        WebElement lastNameInput=creationAccountForm.findElement(By.id("customer_lastname"));
        lastNameInput.sendKeys("Nicoleta");

        WebElement passwordInput=creationAccountForm.findElement(By.id("passwd"));
        passwordInput.sendKeys("parola123");

        WebElement companyInput=creationAccountForm.findElement(By.id("company"));
        companyInput.sendKeys("Bristol Myers Squibb Company");

        WebElement addressInput=creationAccountForm.findElement(By.id("address1"));
        addressInput.sendKeys(" 345 Park Ave, New York, NY 10154");

        WebElement cityInput=creationAccountForm.findElement(By.id("city"));
        cityInput.sendKeys("New York");

        WebElement stateInput=creationAccountForm.findElement(By.id("id_state"));
        new Select(stateInput).selectByVisibleText("New York");

        WebElement zipInput=creationAccountForm.findElement(By.id("postcode"));
        zipInput.sendKeys("10001");

        WebElement countryInput=creationAccountForm.findElement(By.id("id_country"));
        new Select(countryInput).selectByValue("21");

        WebElement mobilePhoneInput=creationAccountForm.findElement(By.id("phone_mobile"));

        mobilePhoneInput.sendKeys("+1 800-332-2056");

        driver.findElement(By.id("submitAccount")).click();

        WebElement logout= driver.findElement(By.className("logout"));
        Assertions.assertTrue(logout.isDisplayed());

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
