package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.NaukriEducationInterfaceElements;
import com.pageobjectmananger.PageObjectMananger;

public class NaukriEducationPage extends Base_Class implements NaukriEducationInterfaceElements {

	@FindBy(xpath = education_xpath)
	private WebElement education;

	@FindBy(xpath = addeducation_xpath)
	private WebElement addeducation;

	@FindBy(id = selecteducation_id)
	private WebElement selecteducation;

	@FindBy(xpath = chooseeducation_xpath)
	private WebElement chooseeducation;

	@FindBy(id = university_id)
	private WebElement university;

	@FindBy(id = course_id)
	private WebElement course;

	@FindBy(xpath = selectcourse_xpath)
	private WebElement selectcouse;

	@FindBy(xpath = coursetype_xpath)
	private WebElement cousetype;

	@FindBy(id = Startingyear_id)
	private WebElement Startingyear;

	@FindBy(id = selectyear_id)
	private WebElement selectyear;

	@FindBy(id = Endingyear_id)
	private WebElement Endingyear;

	@FindBy(xpath = chooseyear_xpath)
	private WebElement chooseyear;

	@FindBy(xpath = grade_xpath)
	private WebElement grade;

	@FindBy(xpath = selectgrade_xpath)
	private WebElement selectgrade;

	@FindBy(xpath = cancel_xpath)
	private WebElement cancel;

	public NaukriEducationPage() {
		PageFactory.initElements(driver, this);
	}

	public void getEducation() throws InterruptedException {
		Thread.sleep(2000);
		explicitWait(education, "visibilityof", 20);
		clickElement(education);

	}

	public void getAddeducation() {
		explicitWait(addeducation, "visibilityof", 20);
		clickElement(addeducation);

	}

	public void getSelecteducation() {
		explicitWait(selecteducation, "visibilityof", 20);
		mouseClickAndHold(selecteducation);

	}

	public void getChooseeducation() {
		explicitWait(chooseeducation, "visibilityof", 20);
		clickElement(chooseeducation);
	}

	public void getUniversity() {
		explicitWait(university, "visibilityof", 20);
		inputPass(university, PageObjectMananger.getpageObject().getFileReader().getDataProperty("universityname"));
	}

	public void getCourse() {
		explicitWait(course, "visibilityof", 20);
		clickElement(course);

	}

	public void getSelectcouse() {
		explicitWait(selectcouse, "visibilityof", 20);
		clickElement(selectcouse);

	}

	public void getCousetype() {
		explicitWait(cousetype, "visibilityof", 20);
		clickElement(cousetype);
	}

	public void getStartingyear() {
		explicitWait(Startingyear, "visibilityof", 20);
		mouseClickAndHold(Startingyear);
	}

	public void getSelectyear() {
		explicitWait(selectyear, "visibilityof", 20);
		clickElement(selectyear);
	}

	public void getEndingyear() {
		explicitWait(Endingyear, "visibilityof", 20);
		mouseClickAndHold(Endingyear);
	}

	public void getChooseyear() {
		explicitWait(chooseyear, "visibilityof", 20);
		clickElement(chooseyear);
	}

	public void getGrade() {
		explicitWait(grade, "visibilityof", 20);
		mouseClickAndHold(grade);

	}

	public void getSelectgrade() {
		explicitWait(selectgrade, "visibilityof", 20);
		clickElement(selectgrade);

	}

	public void getCancel() {
		explicitWait(cancel, "visibilityof", 20);
		clickElement(cancel);
	}

}
