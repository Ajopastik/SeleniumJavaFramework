package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.EpamMainPageObjects;
import io.cucumber.java.en.*;

public class Steps {

	static WebDriver driver = null;

	static EpamMainPageObjects mainPageObj;

	public static void main(String[] args) {

		MainPageTest();
		mainPageObj = new EpamMainPageObjects(driver);

	}

	public static void MainPageTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectPath+"/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epam.com");
		
	}
	@Given("the user clicks on Apply")
	public void the_user_clicks_on_apply() {

		mainPageObj.clickApplyCookiesButton();
	}


	@When("the user clicks on Contact us")
	public void the_user_clicks_on_contact_us() {

		mainPageObj.clickcontactUsButton(); 

	}

	@Given("the user clicks on Search")
	public void the_user_clicks_on_search() {

		mainPageObj.clickSearchButton();

	}

	
	@When("the user type special word to find in field")
	public void the_user_type_special_word_to_find_in_field() {

		mainPageObj.setTextInSearchBox("box");

	}

	@When("clicks Find")
	public void clicks_find() {

		mainPageObj.clickFindButton();

	}
	
	@Given("the user clicks on button How we do it")
	public void the_user_clicks_on_button_how_we_do_it() {

		mainPageObj.clickHowWeDoItButton();

	}

	@When("the user click on words our own IP")
	public void the_user_click_on_words_our_own_ip() {

		mainPageObj.clickOurOwnIP();

	}
	
	@When("the user on the page How we do it")
	public void the_user_on_the_page_how_we_do_it() {
		mainPageObj.clickHowWeDoItButton();
	}

	@When("the user click on infographic")
	public void the_user_click_on_infographic() {
		mainPageObj.clickInfographic();
	}
		
	@Given("the user click on Search button")
	public void the_user_click_on_search_button() {
	    mainPageObj.clickSearchButton();
	}
	
	@When("the user search for Automation")
	public void the_user_search_for_automation() {

		mainPageObj.setTextInSearchBox("Automation");

	}

	@Given("the user click on About")
	public void the_user_click_on_about() {

		mainPageObj.clickAboutButton();

	}

	@When("the user click on Investors")
	public void the_user_click_on_investors() {

		mainPageObj.clickInvestorsButton();

	}

	@When("the user click on FAQ")
	public void the_user_click_on_faq() {

		mainPageObj.clickFaqButton();

	}

	@Given("the user click langButton")
	public void the_user_click_lang_button() {

		mainPageObj.clickLangButton();

	}

	@Given("the user change language to Ukrainian")
	public void the_user_change_language_to_ukrainian() {

		mainPageObj.clickUkrLangButton();

	}
			
	@When("the user search for cucumber")
	public void the_user_search_for_cucumber() {
		mainPageObj.setTextInSearchBox("cucumber");
	}

	@Given("the user navigates to insights")
	public void the_user_navigates_to_insights() {

		mainPageObj.clickInsightsButton();

	}

	@When("the user click on Epam")
	public void the_user_click_on_epam() {
		mainPageObj.clickEpamButton();
	}

	@Then("the user navigates to main page")
	public void the_user_navigates_to_main_page() {
		
		driver.quit();
	}


}

