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

//Create test case similar with test case TC18_Fill_wrong_email_format but change it to password rules

WebUI.openBrowser(GlobalVariable.Signup_URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Sign up/Sign_up_page'), 5)

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Sign up/Verify_password_input'), password)

WebUI.sendKeys(findTestObject('Object Repository/Shopping Cart/Sign up/Verify_password_input'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Sign up/VerifyPass_error_message_lb'), 5)

String Actual_verify_password_error = WebUI.getText(findTestObject('Object Repository/Shopping Cart/Sign up/VerifyPass_error_message_lb'))

WebUI.verifyEqual(Actual_verify_password_error, expec_verify_password_error)

WebUI.closeBrowser()
