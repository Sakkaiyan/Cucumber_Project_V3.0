package com.pageobjectmananger;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.NakuriKeySkillsPage;
import com.pageobjectmodel.NakuriProfileUpdatePage;
import com.pageobjectmodel.NakuriReasumeHeadlinePage;
import com.pageobjectmodel.NaukriEducationPage;
import com.utility.FileReaderManager;

public class PageObjectMananger {

	private FileReaderManager fileReader;
	private static PageObjectMananger pageObjectManager;
	private LoginPage loginpage;
	private NakuriProfileUpdatePage profileupdate;
	private NakuriReasumeHeadlinePage reasumeheadline;
	private NakuriKeySkillsPage keyskills;
	private NaukriEducationPage education;
	
	public NaukriEducationPage getEducation() {
		if(education == null)
			education = new NaukriEducationPage();
		return education;
	}
	
	
	
	

	public NakuriKeySkillsPage getKeySkills() {
		if (keyskills == null)
			keyskills = new NakuriKeySkillsPage();
		return keyskills;
	}

	public NakuriReasumeHeadlinePage getReasumeHeadline() {
		if (reasumeheadline == null)
			reasumeheadline = new NakuriReasumeHeadlinePage();
		return reasumeheadline;
	}

	public NakuriProfileUpdatePage getProfileUpdate() {
		if (profileupdate == null)
			profileupdate = new NakuriProfileUpdatePage();
		return profileupdate;
	}

	public LoginPage getLoginPage() {
		if (loginpage == null)
			loginpage = new LoginPage();
		return loginpage;
	}

	public FileReaderManager getFileReader() {
		if (fileReader == null)
			fileReader = new FileReaderManager();
		return fileReader;
	}

	public static PageObjectMananger getpageObject() {
		if (pageObjectManager == null) {
			pageObjectManager = new PageObjectMananger();
		}
		return pageObjectManager;
	}
}
