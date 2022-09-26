

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;




import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		
		
		  String url = "https://yourtechscore.com/";
			 
	        driver.get(url);
	        
	        driver.manage().window().maximize();
	       
	     
	 
	 
	        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[1]/div/div/button[2]/span[1]"));
	       
	        login.click();
	        Thread.sleep(4000);

	        WebElement email1 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/form/div/button/span[1]"));
	        email1.click();
	        
	        WebElement email = driver.findElement(By.id("email"));
	        email.sendKeys("madhurak1105@gmail.com");
	        WebElement passcode = driver.findElement(By.id("password"));
	        passcode.sendKeys("madhura@2000");
	        WebElement Signin = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/form/div[2]/button/span[1]"));
	        Signin.click();
	        
            driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[3]/div/div/div[1]/div/div[1]/div/div[1]/div/input")).sendKeys("C:\\Users\\user\\Pictures\\Camera Roll\\IMG_20190927_150511.jpg");
            Thread.sleep(6000);
	        WebElement targetProfile = driver.findElement(By.linkText("Start your target profile"));
	        targetProfile.click();
	        JavascriptExecutor jse=(JavascriptExecutor)driver;
	        jse.executeScript("scroll(0,800)");
	        WebElement getStart = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[5]/div[1]/div/button/span[1]"));
	        getStart.click();
	        WebElement quiz1 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/p"));
	        quiz1.click();
	        WebElement next = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/button/span[1]"));
	        next.click();
	        Thread.sleep(4000);
	        WebElement quiz2 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[4]/p"));
	        quiz2.click();
	        WebElement next2 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/button/span[1]"));
	        next2.click();
	        Thread.sleep(4000);
	        WebElement quiz3 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[1]/p"));
	        quiz3.click();
	        WebElement next3 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/button/span[1]"));
	        next3.click();
	        Thread.sleep(4000);
	        WebElement quiz4 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[4]/p"));
	        quiz4.click();
	        WebElement next4 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/button/span[1]"));
	        next4.click();
	        Thread.sleep(4000);
	        WebElement quiz5 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/p"));
	        quiz5.click();
	        WebElement submit = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/button/span[1]"));
	        submit.click();
            Thread.sleep(5000);
	     
	        
	    }


	}


