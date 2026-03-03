package com.stepdefination;

import com.baseclass.Base_Class;
import com.pageobjectmananger.PageObjectMananger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base_Class {

	@Given("user must be launch the browser")
	public void user_must_be_launch_the_browser() {
		browserlaunch(PageObjectMananger.getpageObject().getFileReader().getDataProperty("browser"));
		getUrl(PageObjectMananger.getpageObject().getFileReader().getDataProperty("url"));

	}

	@When("user must be click the login button")
	public void user_must_be_click_the_login_button() {
		PageObjectMananger.getpageObject().getLoginPage().getLogin();

	}

	@When("user must be click the gotit button")
	public void user_must_be_click_the_gotit_button() {
		PageObjectMananger.getpageObject().getLoginPage().getGotit();
	}

	@When("user must be enter the username in the {string} username field")
	public void user_must_be_enter_the_username_in_the_username_field(String string) throws InterruptedException {
		PageObjectMananger.getpageObject().getLoginPage().getEmail();

	}

	@When("user must be enter the password in the {string} password field")
	public void user_must_be_enter_the_password_in_the_password_field(String string) {
		PageObjectMananger.getpageObject().getLoginPage().getPassword();

	}

	@When("user must be click the signin button")
	public void user_must_be_click_the_signin_button() {
		PageObjectMananger.getpageObject().getLoginPage().getSignin();

	}

	@Then("user should be navigate to the homepage {string}")
	public void user_should_be_navigate_to_the_homepage(String string) {

	}

//PROFILE UPDATE FUNCTIONALITY	

	@When("user must click the profile button")
	public void user_must_click_the_profile_button() {
		PageObjectMananger.getpageObject().getProfileUpdate().getProfile();

	}

	@When("user must be click the view & update profile label")
	public void user_must_be_click_the_view_update_profile_label() {
		PageObjectMananger.getpageObject().getProfileUpdate().getUpdate();

	}

	@Then("user should be navigate to the profilepage")
	public void user_should_be_navigate_to_the_profilepage() {

	}

// 	REASUME HEADLINE FUNCTIONALITY

	@When("user must be click the Resume headline label")
	public void user_must_be_click_the_resume_headline_label() {
		PageObjectMananger.getpageObject().getReasumeHeadline().getHeadline();

	}

	@When("user must click the edit icon button")
	public void user_must_click_the_edit_icon_button() {
		PageObjectMananger.getpageObject().getReasumeHeadline().getIcon();

	}

	@When("user must enter the summary in the Resume headline field")
	public void user_must_enter_the_summary_in_the_resume_headline_field() {
		PageObjectMananger.getpageObject().getReasumeHeadline().getText();

	}

	@When("user must be click the save button")
	public void user_must_be_click_the_save_button() {
		PageObjectMananger.getpageObject().getReasumeHeadline().getCancel();

	}

	@Then("Display that the Resume headline has been Successfully saved")
	public void display_that_the_resume_headline_has_been_successfully_saved() {

	}

// KEY SKILLS FUNCTIONALITY

	@When("user must be click the Key skills label")
	public void user_must_be_click_the_key_skills_label() throws InterruptedException {
		PageObjectMananger.getpageObject().getKeySkills().getSkills();
	}

	@When("user must be click the icon symbol")
	public void user_must_be_click_the_icon_symbol() {
		PageObjectMananger.getpageObject().getKeySkills().getIcon();
	}

	@When("user enter the skill in the add skills field")
	public void user_enter_the_skill_in_the_add_skills_field() {
		PageObjectMananger.getpageObject().getKeySkills().getAddskill();
	}

	@When("user should be click the save button")
	public void user_should_be_click_the_save_button() {
		PageObjectMananger.getpageObject().getKeySkills().getSubmit();
	}

	@Then("Display that the Keyskills has been Successfully saved")
	public void display_that_the_keyskills_has_been_successfully_saved() {

	}

// EDUCATION FUNCTIONALITY	

	@When("user must be click the Education label")
	public void user_must_be_click_the_education_label() throws InterruptedException {
		PageObjectMananger.getpageObject().getEducation().getEducation();

	}

	@When("user must click the Add education label")
	public void user_must_click_the_add_education_label() {
		PageObjectMananger.getpageObject().getEducation().getAddeducation();

	}

	@When("user must click the education in the Select education field")
	public void user_must_click_the_education_in_the_select_education_field() {
		PageObjectMananger.getpageObject().getEducation().getSelecteducation();
	}

	@When("user must select the education into the Select education field")
	public void user_must_select_the_education_into_the_select_education_field() {
		PageObjectMananger.getpageObject().getEducation().getChooseeducation();
	}

	@When("user must enter the University in the University\\/Institute field")
	public void user_must_enter_the_university_in_the_university_institute_field() {
		PageObjectMananger.getpageObject().getEducation().getUniversity();
	}

	@When("user must click the select course field")
	public void user_must_click_the_select_course_field() {
		PageObjectMananger.getpageObject().getEducation().getCourse();
	}

	@When("user must select the course into the select course field")
	public void user_must_select_the_course_into_the_select_course_field() {
		PageObjectMananger.getpageObject().getEducation().getSelectcouse();
	}

	@When("user must select the course type field")
	public void user_must_select_the_course_type_field() {
		PageObjectMananger.getpageObject().getEducation().getCousetype();
	}

	@When("user must click the Starting year field")
	public void user_must_click_the_starting_year_field() {
		PageObjectMananger.getpageObject().getEducation().getStartingyear();
	}

	@When("user must select the year into the Starting year field")
	public void user_must_select_the_year_into_the_starting_year_field() {
		PageObjectMananger.getpageObject().getEducation().getSelectyear();
	}

	@When("user must click the Ending year field")
	public void user_must_click_the_ending_year_field() {
		PageObjectMananger.getpageObject().getEducation().getEndingyear();

	}

	@When("user must select the year into the Ending year field")
	public void user_must_select_the_year_into_the_ending_year_field() {
		PageObjectMananger.getpageObject().getEducation().getChooseyear();
	}

	@When("user must click the Select grading system field")
	public void user_must_click_the_select_grading_system_field() {
		PageObjectMananger.getpageObject().getEducation().getGrade();
	}

	@When("user select the grade into the Select grading system field")
	public void user_select_the_grade_into_the_select_grading_system_field() {
		PageObjectMananger.getpageObject().getEducation().getSelectgrade();
	}

	@When("user must click the save buttons")
	public void user_must_click_the_save_buttons() {
		PageObjectMananger.getpageObject().getEducation().getCancel();

	}

	@Then("Display that the Education Details has been Successfully saved")
	public void display_that_the_education_details_has_been_successfully_saved() {

	}

}