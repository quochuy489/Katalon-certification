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

//Create a test case check out when logged in

CustomKeywords.'store.Authentication.Login.Login_successed'(username, password)

WebUI.maximizeWindow()

// Click the product item in the Dashboard page
WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Product_item', [('product_name'):product_name]), 3)

WebUI.click(findTestObject('Object Repository/Dashboard/Product_item', [('product_name'):product_name]))

// Wait for element Prduct_Overview_page is present
WebUI.waitForElementPresent(findTestObject('Object Repository/Product Overview/Product_Overview_page'), 3)

CustomKeywords.'store.Function.Check_out_product.Check_out_a_product'()

WebUI.verifyElementPresent(findTestObject('Object Repository/Check out/Success page/Checkout_success_page'), 5)
