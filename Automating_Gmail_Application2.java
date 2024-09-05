package practical_Assignment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automating_Gmail_Application2 {
	WebDriver driver;
	String applicationURL = "https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AS5LTATtbwKwWuUyRuTyys5QkKN0Tp2tUPtzdfLTImfuXSkOJ6X2386IauvW7-2qXymAq_Cob3F03Q&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	@BeforeTest
	public void Login_to_Gmail() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pushpa\\Desktop\\java folder\\JavaNewProgramms\\browser files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		 * Login using EmailId
		 * Realative xpath for EmailId=//*[@id="identifierId"]
		 */
		By EmailIdProperty=By.xpath("//*[@id=\"identifierId\"]");
		WebElement EmailId=driver.findElement(EmailIdProperty);
		EmailId.sendKeys("n170062@rguktn.ac.in");
		/*
		 * click on next button
		 * Absolute xpath for next button=/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/div[3]
		 * /html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button
		 */
		By next_button_Property=By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button");
		WebElement next_button=driver.findElement(next_button_Property);
		next_button.click();		
		/*
		 * password element is an hidden element so we have to wait for sometime to locate the element
		 * /html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/div
		 * #password > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)
		 * <input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" name="Passwd" aria-disabled="false" autocapitalize="none" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		 */
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input ")));
		password.sendKeys("6305534352");
		/*
		 * 
		 * /html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button
		 * <div class="T-I T-I-KE L3" style="user-select: none" role="button" tabindex="0" jscontroller="eIu7Db" jsaction="click:dlrqf; clickmod:dlrqf" jslog="20510; u014N:cOuCgd,Kr2w4b">Compose</div>
		 */
		By next_button_Property2=By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button");
		WebElement next_button2=driver.findElement(next_button_Property2);
		next_button2.click();
		
		/*
		 * div.aqn:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)
		 * 
		 * Absolute xpath for compose button=/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/div
		 * 
		 * <div class="T-I T-I-KE L3" style="user-select: none" role="button" tabindex="0" jscontroller="eIu7Db" jsaction="click:dlrqf; clickmod:dlrqf" jslog="20510; u014N:cOuCgd,Kr2w4b">Compose</div>
		 */
		 
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
	        WebElement composeButton = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/div")));
	        composeButton.click();
	        
	        /*
	         * Relative xpath for To address=//*[@id=":sq"]
	         * //*[@id=":sq"]
	         * 
	         */
	        WebDriverWait wait3 = new WebDriverWait(driver, 20);
	        WebElement toField = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":sq\"]")));
	        toField.sendKeys("n170062@rguktn.ac.in");
	        /*
	         * Relative xpath for subject=//*[@id=":p2"]
	         */
	        WebDriverWait wait4 = new WebDriverWait(driver, 20);
	        WebElement subject = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":p2\"]")));
	        subject.sendKeys("Test Mail");
	        
	        /*
	         * Relative xpath for body=//*[@id=":qc"]
	         */
	        WebDriverWait wait5 = new WebDriverWait(driver, 20);
	        WebElement body = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":qc\"]")));
	        body.sendKeys("Test Email Body");
	        
	        /*
	         * Relative xpath for send button=//*[@id=":os"]
	         */
	        
	        ///html/body/div[19]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[5]/div[2]/div[2]
	        //<div class="J-J5-Ji J-JN-M-I-JG"></div>
	      //*[@id=":ni"]
	        //<td id=":ni" class="gU aYL"><div class="J-J5-Ji a0A"></div><div id=":r7" class="J-JN-M-I J-J5-Ji Xv L3 T-I-ax7 T-I" jslog="147027; u014N:cOuCgd,Kr2w4b,xr6bB;" role="button" tabindex="1" aria-haspopup="true" aria-expanded="false" style="user-select: none;" data-tooltip="More options" aria-label="More options"><div class="J-J5-Ji J-JN-M-I-Jm"><img class="Y1" src="images/cleardot.gif" alt=""><div class="a3I">&nbsp;</div></div><div class="J-J5-Ji J-JN-M-I-JG"></div></div></td>
	       By label_property=By.id(":r7");
	       WebElement label=driver.findElement(label_property);
	       label.click();
	        
	        ///html/body/div[40]/div/div[3]/div[1]/div/div
	       //<div class="J-Ph Gi J-N" id=":ra" jslog="121763" role="menuitem" style="user-select: none;" aria-haspopup="true"><div class="J-N-Jz">Label<span class="J-Ph-hFsbo">►</span></div></div>
	       //<div class="J-Ph Gi J-N J-Ph-Kq J-N-JT" id=":ra" jslog="121763" role="menuitem" style="user-select: none;" aria-haspopup="true"><div class="J-N-Jz">Label<span class="J-Ph-hFsbo">►</span></div></div>
	       
	        By Click_label_Property=By.xpath("//*[@id=\":ra\"]");         
	        WebElement Click_label=driver.findElement(Click_label_Property);
	        Click_label.click();
	        
	        
	        
	        By send_button_Property=By.xpath("//*[@id=\":os\"]");
			WebElement send_button=driver.findElement( send_button_Property);
			send_button.click();
			
			///html/body/div[8]/div[3]/div/div[2]/div[4]/div/div/div/div[2]/div/div[1]/div/div[4]/div/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td
	         WebElement firstSentEmail = driver.findElement(By.xpath("//tr[@class='zA zE']//td[@class='xY a4W']"));
	         firstSentEmail.click();
	         
	         ///html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div
	          
	          WebElement starmail = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div"));
	          starmail.click();
	         
	          
		       ////*[@id=":kk"]
		          WebElement more = driver.findElement(By.xpath("//*[@id=\":kk\"]"));
		          more.click();
		          ///html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/div[3]/span/a
		          
		          WebElement categories_optin = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/div[3]/span/a"));
		          categories_optin.click();
		        ///html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div/div/div[3]/span/a
			     WebElement Social_optin = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div/div/div[3]/span/a"));
			     Social_optin.click();   
			     
			     
		}
	@AfterTest
	public void Gmail_application_close()
	{
		
	//<span class="Zt">
    //class="bq4 xY"
		
		 driver.quit();
	}
}

//  Instructions to run the code
/*
 * download Eclipse and create a package ,then create a class like "Automating_Gmail_Application"
 * and install "Firefox WebDriver" to interact with browser in to Eclipse.
 *To run user defined methods  Login_to_Gmail() and Gmail_application_close() import TestNG Annotations
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	          