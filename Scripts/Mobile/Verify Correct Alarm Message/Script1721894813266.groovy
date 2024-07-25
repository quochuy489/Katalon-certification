import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil

import internal.GlobalVariable

//Get full directory\'s path of android application
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.App_path, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

//navigates the application to Activity form

Mobile.tap(findTestObject('Application/android.widget.TextView - App'), 10)

Mobile.tap(findTestObject('Application/App/android.widget.TextView - Activity'), 10)

//taps on the Custom Dialog button

Mobile.tap(findTestObject('Application/App/Activity/android.widget.TextView - Custom Dialog'), 10)

//Get displayed message on the dialog
def message = Mobile.getText(findTestObject('Application/App/Activity/Custom Dialog/android.widget.TextView - Message'), 
    10)

//the correct dialog message should be displayed

Mobile.verifyEqual(message, 'Example of how you can use a custom Theme.Dialog theme to make an activity that looks like a customized dialog, here with an ugly frame.')

Mobile.closeApplication()


