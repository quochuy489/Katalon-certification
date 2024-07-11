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

/* Create test case with following steps:
1. Access login page with Login_URL in default profle
2. Click on Sign up link
3. Verify Sign up page present
4. Fill email with wrong format
5. Verify error message display

*/

WebUI.openBrowser(GlobalVariable.Signup_URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up/Sign_up_page'), 5)

WebUI.setText(findTestObject('Object Repository/Sign up/Email_input'), username)

WebUI.sendKeys(findTestObject('Object Repository/Sign up/Email_input'), Keys.chord(Keys.TAB))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up/Email_error_message_lb'), 5)

String Actual_email_error = WebUI.getText(findTestObject('Object Repository/Sign up/Email_error_message_lb'))

WebUI.verifyEqual(Actual_email_error, expec_email_error)

WebUI.closeBrowser()