package AmazonTestCase;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationcore.BaseClass;
public class AmazonTest extends BaseClass{
public WebDriver driver;
@BeforeMethod
public void initialisation() throws Exception 
{
	driver = browserInitialisation("Chrome");
	driver.get("https://www.amazon.in/");
}
@Test
public void tc01() throws InterruptedException
{
	//System.out.println("tc 1");
	//driver.navigate().to("https://www.amazon.in/Haier-Direct-Single-Refrigerator-HED-204DS-P/dp/B0BTHLMS39/ref=lp_96349197031_1_1?pf_rd_p=9e034799-55e2-4ab2-b0d0-eb42f95b2d05&pf_rd_r=H01MB6JMFRQ1R6S2RGY3&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D");
   // driver.navigate().back();
   // driver.navigate().forward();
   // driver.navigate().refresh();
   // driver.close();
    //driver.quit();
   // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
  //  driver.findElement(By.name("field-keywords")).clear();
  //  driver.findElement(By.className("nav-searchbar nav-progressive-attribute")).sendKeys("samsung");
  //driver.findElement(By.tagName("input"));
   // driver.findElement(By.linkText("Shop on Amazon Business")).click();
  //  driver.findElement(By.partialLinkText("Conditions of")).click();
    
  //  driver.findElement(By.id("navFooter")).sendKeys("LG 108 cm (43 inches) 4K Ultra HD Smart LED TV 43UR7500PSC (Dark Iron Gray)");
	//List<WebElement> products=driver.findElement(By.xpath(//span[@class="a-size-medium a-color-base a-text-normal"]));
  //  int productsize = products.size();
	//System.out.println("No of Products = "+productsize);
	//Actions action = new Actions(driver);	//obj created for actions class
	//action.contextClick().build().perform();	//right clicking
	//action.doubleClick(driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"))).build().perform();
	//driver.findElement(By.xpath("//span[text()='Xiaomi 125 cm (50 inches) X 4K Dolby Vision Series Smart Google TV L50M8-A2IN (Black)']")).click();
   /* String value=driver.findElement(By.xpath("//span[text()='Deals &  Discounts']")).getText();
	System.out.println(value);
	String value2=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getTagName();
	System.out.println(value2);
	//driver.findElement(By.className("s-image")).click();
	String value3=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
	System.out.println(value3);
	//driver.findElement(By.id("twotabsearchtextbox")).clear();
	
		//example site for dropdown
		/*driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = driver.findElement(By.name("country"));
		Select obj = new Select(dropdown);
		//obj.selectByValue("ANGOLA");
		obj.selectByVisibleText("ANTARCTICA");*/
		
	//for dropdown selection with xpath
		//driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		//driver.findElement(By.id("s-result-sort-select_2")).click();
	/*driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
	WebElement source = driver.findElement(By.id("column-a"));
	WebElement target = driver.findElement(By.id("column-b"));
	Actions action = new Actions(driver);
	//action.dragAndDrop(source, target).build().perform();
	
	driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	WebElement signInBox = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	action.moveToElement(signInBox).build().perform();*/		//mouseOvering
	
	/*driver.navigate().to("https://www.91mobiles.com/phonefinder.php");
	//radioButtonSelection & checkBox Selection
	driver.findElement(By.id("latestandexpectprice1000002000001")).click();	//radioButtonSelection
	driver.findElement(By.id("latestandexpectprice2000003000001")).click();	//radioButtonSelection
	driver.findElement(By.id("mobraminmb614401000000")).click();			//checkBox Selection
	
	//isSelected()
		boolean buttonSelectedStatus = driver.findElement(By.id("mobraminmb614401000000")).isSelected();
		System.out.println("isSelected="+buttonSelectedStatus);
		
	//isDsplayed()
	boolean pricerangeboxVarification = driver.findElement(By.xpath("//div[contains(@class,'price_tag_finder new-finder-left')]")).isDisplayed();
	System.out.println(pricerangeboxVarification);	
	//isDsplayed()
	//driver.findElement(By.xpath("//input[@id='oneplus2120']")).click();
	//driver.findElement(By.id("samsung157")).click();
	//boolean marketStatusVerification = driver.findElement(By.xpath("//div[@class='new-finder-left heading_block' and @data-header='Market Status']")).isDisplayed();
	//System.out.println("2"+marketStatusVerification);
	//boolean marketStatusVerification2 = driver.findElement(By.xpath("//div[@class='_block'")).isDisplayed();
	//System.out.println("3"+marketStatusVerification2);
	 //isEnabled()
	/*driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	boolean buyNowButtonStatus = driver.findElement(By.id("nav-search-submit-button")).isEnabled();
	System.out.println(buyNowButtonStatus);
	*/
	 

	//driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	//driver.findElement(By.name("cusid")).sendKeys("123");
	//driver.findElement(By.name("submit")).click();
	//driver.switchTo().alert().accept();
	
	
	//driver.navigate().to("https://selenium.qabible.in/");
	//Practice
	//dropdown select
	//driver.get("https://demo.guru99.com/test/newtours/register.php");
	//WebElement CountryDropDown=driver.findElement(By.name("country"));
	//Select dropdownobj=new Select(CountryDropDown);
	//dropdownobj.selectByValue("ALBANIA");
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart tv");//select amazon and inspect search bar
   //driver.findElement(By.id("nav-search-submit-button")).click();//inspect search button
	//Thread.sleep(2000);
	//driver.findElement(By.id("a-autoid-0-announce")).click();//id value of whole drop down
	//driver.findElement(By.linkText("Avg. Customer Review")).click();// id of drop down value

	
	//driver.navigate().to("https://demoqa.com/select-menu");
	//WebElement OldSelect=driver.findElement(By.id("oldSelectMenu"));
	//Select dropobj=new Select(OldSelect);
	//dropobj.selectByVisibleText("Green");
	
	//driver.navigate().to("https://www.myntra.com/");
	//driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Kurta");
	
	//List<WebElement> product=driver.findElements(By.xpath("//span[@class='a-size-base a-color-secondary']"));inspect any product(tv)
	//System.out.println(product);
    
	//clicks
	//driver.navigate().to("https://demoqa.com/buttons");
	//Actions actionobj=new Actions(driver);
	//actionobj.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();inspect doubleclick
	//actionobj.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();inspect rightclick
	//driver.findElement(By.id("gHjjO")).click();
	
	//drag and drop
	//driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	//WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	//WebElement target=driver.findElement(By.id("mydropzone"));
	//Actions action1=new Actions(driver);
	//action1.dragAndDrop(source, target).build().perform();
	
	//MouseHOver
	//WebElement mousehover=driver.findElement(By.className("nav-line-2 "));//hover inspect copy id
	//Actions action=new Actions(driver);//object creation
	//action.moveToElement(mousehover).build().perform();
	
	//Checkbox
	//driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");//path of checkbox
	//driver.findElement(By.id("check-box-one")).click();//inspect checkbox
	//driver.findElement(By.id("check-box-four")).click();//inspect checkbox
	//driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");//path of radiobutton
	//driver.findElement(By.id("inlineRadio2")).click();//inspect radio button
	
	//idisplayed
	//driver.navigate().to("https://selenium.qabible.in/form-submit.php");
	//boolean text=driver.findElement(By.className("form-check-input")).isDisplayed();//classname of text
	//System.out.println(text);
	//isselected
	//driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	//driver.findElement(By.className("form-check-label")).click();//classname of selected radio button
	//boolean selected=driver.findElement(By.className("form-check-label")).isDisplayed();//if selected display
	//System.out.println(selected);
	
	//is enabled
	//driver.navigate().to("https://demoqa.com/dynamic-properties");
	//boolean check=driver.findElement(By.id("enableAfter")).isEnabled();inspect will be enable for 5 seconds button
	//System.out.println(check);
	//Thread.sleep(6000);
	//boolean check1=driver.findElement(By.id("enableAfter")).isEnabled();
	//System.out.println(check1);
	
	//alert handling
//	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
//	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();//need to copy the x path we cannot do it by other ways click me inspect
	//Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	


}
	//multiple windows handling
	@Test
	public void tc02() throws InterruptedException {
		System.out.println("test");
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	//	driver.findElement(By.id("nav-search-submit-button")).click();
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")));
	//	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bradley");	
}
	
	@Test
	public void tc03()  {
		System.out.println("test1");
		//TABLE HANDLING
		driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bruno");
		String age = driver.findElement(By.xpath("(//tr[@class='odd']//td)[4]")).getText();
		System.out.println(age);
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		driver.navigate().refresh();
		List<WebElement> data = driver.findElements(By.xpath("//tr[@class='odd' or @class ='even']//td"));
		ArrayList<String> value1 = new ArrayList<String>();
		for(int i=0; i<data.size(); i++) {
			//String elementText = data.get(i).getText();
			value1.add(data.get(i).getText());
			
			}
		//System.out.println(value1);
		String name = value1.get(5);
		System.out.println(name);
		System.out.println("...........");
		System.out.println(value1);
		
		ArrayList<String> value2 = new ArrayList<String>();

		value2.add("Airi Satou");
		value2.add("Accountant");
		value2.add("Tokyo");
		value2.add("33");
		value2.add("2008/11/28");
		value2.add("$162,700");
		
		value2.add("Angelica Ramos");
		value2.add("Chief Executive Officer (CEO)");
		value2.add("London");
		value2.add("47");
		value2.add("2009/10/09");
		value2.add("$1,200,000");

		value2.add("Ashton Cox");
		value2.add("Junior Technical Author");
		value2.add("San Francisco");
		value2.add("66");
		value2.add("2009/01/12");
		value2.add("$86,000");
		
		value2.add("Bradley Greer");
		value2.add("Software Engineer");
		value2.add("London");
		value2.add("41");
		value2.add("2012/10/13");
		value2.add("$132,000");
		
		value2.add("Brenden Wagner");
		value2.add("Software Engineer");
		value2.add("San Francisco");
		value2.add("28");
		value2.add("2011/06/07");
		value2.add("$206,850");
		
		value2.add("Brielle Williamson");
		value2.add("Integration Specialist");
		value2.add("New York");
		value2.add("61");
		value2.add("2012/12/02");
		value2.add("$372,000");
		
		value2.add("Bruno Nash");
		value2.add("Software Engineer");
		value2.add("London");
		value2.add("38");
		value2.add("2011/05/03");
		value2.add("$163,500");

		value2.add("Caesar Vance");
		value2.add("Pre-Sales Support");
		value2.add("New York");
		value2.add("21");
		value2.add("2011/12/12");
		value2.add("$106,450");

		value2.add("Cara Stevens");
		value2.add("Sales Assistant");
		value2.add("New York");
		value2.add("46");
		value2.add("2011/12/06");
		value2.add("$145,600");


		value2.add("Cedric Kelly");
		value2.add("Senior Javascript Developer");
		value2.add("Edinburgh");
		value2.add("22");
		value2.add("2012/03/29");
		value2.add("$433,060");	
		
		System.out.println(value2);
		
		boolean compareValue = value1.equals(value2);
		System.out.println(compareValue);
	}
	
	@Test
	public void tc04() {
		//Handling Frames
		driver.navigate().to("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");		//driver inside frame
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();	
		
	}
	}




