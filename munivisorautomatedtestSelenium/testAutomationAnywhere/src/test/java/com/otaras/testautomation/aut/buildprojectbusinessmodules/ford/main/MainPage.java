package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.mainbase.BaseMainPage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class MainPage extends BaseMainPage{
	
	public MainPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}
