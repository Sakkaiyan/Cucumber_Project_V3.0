package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.NakuriReasumeHeadlineInterfaceElements;
import com.pageobjectmananger.PageObjectMananger;

public class NakuriReasumeHeadlinePage extends Base_Class implements NakuriReasumeHeadlineInterfaceElements {

	@FindBy(xpath = headline_xpath)
	private WebElement headline;

	@FindBy(xpath = icon_xpath)
	private WebElement icon;

	@FindBy(xpath = text_xpath)
	private WebElement text;

	@FindBy(xpath = cancel_xpath)
	private WebElement cancel;

	public NakuriReasumeHeadlinePage() {
		PageFactory.initElements(driver, this);
	}

	public void getHeadline() {
		explicitWait(headline, "visibilityof", 20);
		clickElement(headline);

	}

	public void getIcon() {
		explicitWait(icon, "visibilityof", 20);
		clickElement(icon);

	}

	public void getText() {
		
		explicitWait(text, "visibilityof", 20);
		inputPass(text, PageObjectMananger.getpageObject().getFileReader().getDataProperty("ReasumeHeadline"));

	}

	public void getCancel() {
		explicitWait(cancel, "visibilityof", 20);
		clickElement(cancel);
	}
}
