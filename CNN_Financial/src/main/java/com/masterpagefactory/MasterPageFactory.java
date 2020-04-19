package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	WebDriver driver;
	public  MasterPageFactory( WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	@FindBy(xpath="(//*[@class='sc-htoDjs dpodOf'])[1]//li")
	private List<WebElement> allpage;
	

	public List<WebElement> getAllpage() {
		return allpage;
	}
	@FindBy(xpath="(//*[text()='Markets'])[1]")
	private WebElement market;

	public WebElement getMarket() {
		return market;
	}
	@FindBy(xpath="//*[@class='ticker-name-change']")
	private List<WebElement> Topname;

	public List<WebElement> getTopname() {
		return Topname;
	}
	
	@FindBy(xpath="//*[@class='stock']")
	private List<WebElement> mostpopulerstock;

	public List<WebElement> getMostpopulerstock() {
		return mostpopulerstock;
	}
	@FindBy(xpath="(//*[@class='disclaimer'])[2]")
	private WebElement timeupdate;

	public WebElement getTimeupdate() {
		return timeupdate;
	}
	
	
	
	
	
	
	
	
	/*@ FindBy //Source>>>Getter and Setter>>Click on elemnt u want to get>>>then click on getter>>generate
	(xpath=("(//*[@name='markets'])[1]"))
	private WebElement market;
	public WebElement getMarket() {
		return market;
	}
	
	@FindBy
	(xpath=("(//*[text()='Tech'])[1]"))
	private WebElement tech;
	public WebElement getTech() {
		return tech;
	}
	
	@FindBy
	(xpath=("(//*[text()='Media'])[1]"))
	private WebElement media;
	public WebElement getMedia() {
		return media;
	}
	@FindBy
	(xpath=("(//*[text()='Success'])[1]"))
	private WebElement success;
	public WebElement getSuccess() {
		return success;
	}
	@FindBy
	(xpath=("(//*[text()='Perspectives'])[1]"))
	private WebElement perspective;
	public WebElement getPerspective() {
		return perspective;
	}
	@FindBy
	(xpath=("(//*[text()='Videos'])[1]"))
	private WebElement videos;
	public WebElement getVideos() {
		return videos;
	}
	@FindBy
	(xpath=("//*[contains(@class,'three-equal-columns wsod')]"))
	private List <WebElement> topSection;
	public List<WebElement> getTopSection() {
		return topSection;
	}
	
	*/
	

	
}
