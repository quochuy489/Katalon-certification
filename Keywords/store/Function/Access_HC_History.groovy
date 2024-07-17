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

public class Access_HC_History {
	@Keyword
	public static void Access_History () {
		
		store.Authentication.HC_Login_Burger_menu.Login_via_Burger_menu()
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Burger menu/a_Burger_menu'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Healthcare/Burger menu/Slidebar_opened'), 3)
		
		WebUI.click(findTestObject('Object Repository/Healthcare/Burger menu/a_History'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Healthcare/History/History_page'), 3)
	}
}
