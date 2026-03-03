package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.NakuriProfileUpdateInterfaceElements;

public class NakuriProfileUpdatePage extends Base_Class implements NakuriProfileUpdateInterfaceElements {

	@FindBy(xpath = profile_xpath)
	private WebElement profile;

	@FindBy(xpath = update_xpath)
	private WebElement update;

	public NakuriProfileUpdatePage() {
		PageFactory.initElements(driver, this);
	}

	public void getProfile() {
		explicitWait(profile, "visibilityof", 20);
		clickElement(profile);

	}

	public void getUpdate() {
		explicitWait(update, "visibilityof", 20);
		clickElement(update);

	}

}
