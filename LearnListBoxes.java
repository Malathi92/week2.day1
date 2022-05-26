package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("dropdown1"));
		Select obj=new Select(ele);
		obj.selectByIndex(1);
		obj.getOptions();
		WebElement ele1 = driver.findElement(By.name("dropdown2"));
		Select obj1=new Select(ele1);
		obj1.selectByVisibleText("Appium");
		WebElement ele2 = driver.findElement(By.id("dropdown3"));
		Select obj2=new Select(ele2);		
		obj2.selectByValue("3");


	}

}


