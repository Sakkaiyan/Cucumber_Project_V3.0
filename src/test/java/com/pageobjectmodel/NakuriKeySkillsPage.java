package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.NakuriKeySkillsInterfaceElements;
import com.pageobjectmananger.PageObjectMananger;

public class NakuriKeySkillsPage extends Base_Class implements NakuriKeySkillsInterfaceElements {

	@FindBy(xpath = skills_xpath)
	private WebElement skills;

	@FindBy(xpath = icon_xpath)
	private WebElement icon;

	@FindBy(xpath = addskill_id)
	private WebElement addskill;

	@FindBy(xpath = submit_xpath)
	private WebElement submit;

	public NakuriKeySkillsPage() {
		PageFactory.initElements(driver, this);
	}

	public void getSkills() throws InterruptedException {
		Thread.sleep(2000);
		explicitWait(skills, "visibilityof", 20);
		clickElement(skills);
	
	}

	public void getIcon() {
		explicitWait(icon, "visibilityof", 20);
		clickElement(icon);

	}

	public void getAddskill() {
		explicitWait(addskill, "visibilityof", 20);
		inputPass(addskill, PageObjectMananger.getpageObject().getFileReader().getDataProperty("Enterskills"));
	}

	public void getSubmit() {
		explicitWait(submit, "visibilityof", 20);
		clickElement(submit);

	}

}
