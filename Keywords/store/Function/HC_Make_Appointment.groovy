package store.Function

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class HC_Make_Appointment {
	@Keyword
	public static void Make_Appointment (String country) {
		
		store.Authentication.HC_Login_Make_Appointment.Login_Appointment()
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_dropdownlist'))
		
		if(country=='Seoul') {
			WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_Seoul_option'))
		}else if (country=='Tokyo') {
			WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_Tokyo_option'))
		}else {
			WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_HongKong_option'))
		}
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/VisitDate_Calendar_icon'))
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/VisitDate_Calendar_Date_option'))
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Book_appointment_button'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Healthcare/Summary/Appointment_Confirmation_label'),3)
	}
}
