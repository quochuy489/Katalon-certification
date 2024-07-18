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

CustomKeywords.'store.Authentication.HC_Login_Make_Appointment.Login_Appointment'()

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_dropdownlist'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_Seoul_option'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Facility_Seoul_option'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/VisitDate_Calendar_icon'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/VisitDate_Calendar_Date_option'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Comment_textarea'))

WebUI.check(findTestObject('Object Repository/Healthcare/Appointment/Apply_hopital_readmission_checkbox'))

WebUI.click(findTestObject('Object Repository/Healthcare/Appointment/Book_appointment_button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Healthcare/Summary/Appointment_Confirmation_label'),3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Healthcare/Summary/Apply_hopital_readmission_Yes'),3)

WebUI.closeBrowser()