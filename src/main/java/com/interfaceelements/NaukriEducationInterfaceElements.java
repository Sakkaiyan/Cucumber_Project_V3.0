package com.interfaceelements;

public interface NaukriEducationInterfaceElements {

	String education_xpath = "(//span[text()='Education'])[1]";

	String addeducation_xpath = "//span[text()='Add education']";

	String selecteducation_id = "//input[@id='highEduFor']";

	String chooseeducation_xpath = "//a[@data-id='highEdu_1']";

	String university_id = "//input[@id='institute']";

	String course_id = "//input[@id='crsFor']";

	String selectcourse_xpath = "//a[@data-id='crs_11']";

	String coursetype_xpath = "//label[@for='part_time']";

	String Startingyear_id = "//input[@id='yosFieldFor']";

	String selectyear_id = "//a[@data-id='yosField_2026']";

	String Endingyear_id = "//input[@id='yopFieldFor']";

	String chooseyear_xpath = "//a[@data-id='yopField_2030']";

	String grade_xpath = "//input[@id='gradeFieldFor']";

	String selectgrade_xpath = "//a[@data-id='gradeField_4']";

	String cancel_xpath = "(//a[text()='Cancel'])[3]";

}
