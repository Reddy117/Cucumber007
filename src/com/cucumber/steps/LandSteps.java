package com.cucumber.steps;

import com.cucumber.pages.HomePage;
import com.cucumber.pages.LandPage;
import com.cucumber.utils.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandSteps extends BaseClass{
	LandPage lp;
	HomePage hp;
	@Given("^User should open bro$")
	public void User_should_open_bro() throws Throwable {
	/* System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/com/cucumber/drivers/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.get("http://automationpractice.com/index.php");*/
		initialize("ff");
		lp=new LandPage();
		hp=new HomePage();
	}

	/*@Given("^User click signin link$")
	public void User_click_signin_link() throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

	@Given("^Enter email and password$")
	public void Enter_email_and_password() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gogi.reddyqa@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("anishsaireddy8");
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	}*/
	
	@Given("^user should login$")
	public void user_should_login() throws Throwable {
	    lp.login(p.getProperty("uName"), p.getProperty("pWord"));
	}

	@Then("^My account element should be visible$")
	public void My_account_element_should_be_visible() throws Throwable {
	   
	}


/*@When("^AddProduct to kart$")
public void AddProduct_to_kart() throws Throwable {
	hp.addProductToKart(hp.womanLink,hp.tshirts,hp.tshirtxt,"2","L");
}*/

@Given("^AddProduct to kart using \"([^\"]*)\" and \"([^\"]*)\"$")
public void AddProduct_to_kart_using_and(String qty, String size) throws Throwable {
	hp.addProductToKart(hp.womanLink,hp.tshirts,hp.tshirtxt,qty,size);
}

@Then("^Product should be displayed in the kart$")
public void Product_should_be_displayed_in_the_kart() throws Throwable {

}

@After
public void tearDown(){
	try{
		hp.logOut();
	}catch(Exception e){
		
	}
	driver.quit();
}
}
