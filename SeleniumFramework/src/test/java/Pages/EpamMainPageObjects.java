package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EpamMainPageObjects {
	
	WebDriver driver = null;

	By applyCookies = By.className("button__content");
	
	By contactUsButton = By.className("cta-button__text");
	
	By searchButton = By.className("is-a11y-only");
	
	By textBoxSearch = By.id("new_form_search");
	
	By findButton = By.className("header-search__submit");
	
	By howWeDoItButton = By.className("top-navigation__item-link");
	
	By ourOwnIP = By.linkText("https://solutionshub.epam.com");
	
	By infographicButton = By.className("featured-content-card__content-type");
	
	By aboutButton = By.className("top-navigation__item-link");
	
	By investordButton = By.className("in-page-navigation__title");
	
	By faqButton = By.className("in-page-navigation__title");
	
	By langButton = By.className("location-selector__button");
	
	By ukrLangButton = By.className("location-selector__link");
	
	By insightsButton = By.className("top-navigation__item-link");
	
	By epamButton = By.className("header__logo");
	
	//constructor
	public EpamMainPageObjects(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void clickApplyCookiesButton() {
		
		driver.findElement(applyCookies).click();
		
	}
	
	public void clickcontactUsButton() {
		
		driver.findElement(contactUsButton).click();
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(searchButton).click();
		
	}
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textBoxSearch).sendKeys(text);
	}
	
	public void clickFindButton() {
		
		driver.findElement(findButton).click();
		
	}
	
	public void clickHowWeDoItButton() {
		
		driver.findElement(howWeDoItButton).clear();
		
	}
	
	public void clickOurOwnIP() {
		
		driver.findElement(ourOwnIP).click();
		
	}
	
	public void clickInfographic() {
		
		driver.findElement(infographicButton).click();
		
	}
	
	public void clickAboutButton() {
		
		driver.findElement(aboutButton).click();
		
	}
	
	public void clickInvestorsButton() {
		
		driver.findElement(investordButton).click();
		
	}
	
	public void clickFaqButton() {
		
		driver.findElement(faqButton).click();
		
	}
	
	public void clickLangButton() {
		
		driver.findElement(langButton).click();
		
	}
	
	public void clickUkrLangButton() {
		
		driver.findElement(ukrLangButton).click();
		
	}
	
	public void clickInsightsButton() {
		
		driver.findElement(insightsButton).click();
		
	}
	
	public void clickEpamButton() {
		
		driver.findElement(epamButton).click();
		
	}
}
