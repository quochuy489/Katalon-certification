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

//Create a test case sign up with all empty info

WebUI.openBrowser(GlobalVariable.Signup_URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up/Sign_up_page'), 5)

WebUI.setText(findTestObject('Object Repository/Sign up/Email_input'), '')

WebUI.setText(findTestObject('Object Repository/Sign up/Password_input'), '')

WebUI.setText(findTestObject('Object Repository/Sign up/Verify_password_input'), '')

WebUI.click(findTestObject('Object Repository/Sign up/Sign_up_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Sign up/Email_error_message_lb'), 'Required')

WebUI.verifyElementText(findTestObject('Object Repository/Sign up/Password_error_message_lb'), 'Required')

WebUI.verifyElementText(findTestObject('Object Repository/Sign up/VerifyPass_error_message_lb'), 'Required')

WebUI.closeBrowser()
