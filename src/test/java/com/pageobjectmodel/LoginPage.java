package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.LoginInterfaceElements;
import com.pageobjectmananger.PageObjectMananger;

public class LoginPage extends Base_Class implements LoginInterfaceElements {

	@FindBy(xpath = log_xpath)
	private WebElement login;

	@FindBy(xpath = gotit_xpath)
	private WebElement gotit;

	@FindBy(xpath = email_xpath)
	private WebElement email;

	@FindBy(xpath = password_xpath)
	private WebElement password;

	@FindBy(xpath = login_xpath)
	private WebElement signin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void getLogin() {
		clickElement(login);

	}

	public void getGotit() {
		clickElement(gotit);

	}

	public void getEmail() throws InterruptedException {
		explicitWait(email,"visibilityof",20);
		inputPass(email, PageObjectMananger.getpageObject().getFileReader().getDataProperty("username"));
	}

	public void getPassword() {
		explicitWait(email,"visibilityof",20);
		inputPass(password, PageObjectMananger.getpageObject().getFileReader().getDataProperty("userpassword"));

	}

	public void getSignin() {
		clickElement(signin);

	}

}
