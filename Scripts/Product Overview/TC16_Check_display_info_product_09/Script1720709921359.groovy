import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/* Write a test case similar with test case TC09_Check_display_info_product_01 but with product 4*/

// Open browser to the URL stored in default profile with name Dashborad_URL
WebUI.openBrowser(GlobalVariable.Dashborad_URL)

WebUI.maximizeWindow()

// Click the product item in the Dashboard page
WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Product_item', [('product_name'):product_name]), 5)

WebUI.click(findTestObject('Object Repository/Dashboard/Product_item', [('product_name'):product_name]))

// Wait for element Prduct_Overview_page is present
WebUI.waitForElementPresent(findTestObject('Object Repository/Product Overview/Product_Overview_page'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Overview/Product_title', [('product_name'):product_name]), 5)

String price_web = WebUI.getText(findTestObject('Object Repository/Product Overview/Product_price'))

boolean get_price = price_web.contains(price)

WebUI.verifyEqual(get_price, true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Overview/Product_color', [('color'):color]), 5)

// Close the browser
WebUI.closeBrowser()