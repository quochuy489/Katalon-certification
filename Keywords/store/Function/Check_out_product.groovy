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

public class Check_out_product {
	@Keyword
	public static void Check_out_a_product () {
		
		WebUI.click(findTestObject('Object Repository/Product Overview/Add_to_cart_button'))
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Cart/Cart_page'), 3)
		
		WebUI.click(findTestObject('Object Repository/Cart/Check_out_button'))
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Check out/Checkout_page'), 3)
		
		WebUI.click(findTestObject('Object Repository/Check out/Confirm_checkout_button'))
	}
}
