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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-console.tagsamurai.com/modules')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login Page/TAG Samurai logo'), 300)

WebUI.setText(findTestObject('Login Page/Input Email'), 'user-development@mailnesia.com')

WebUI.setText(findTestObject('Login Page/Input Password'), 'Moderator12@')

//WebUI.verifyElementPresent(findTestObject('Login Page/reCAPTCHA'), 60)
//WebUI.click(findTestObject('Login Page/reCAPTCHA'))
WebUI.click(findTestObject('Login Page/Button Login'))

if (WebUI.verifyElementPresent(findTestObject('Login Page/Confirm Button'), 10, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Login Page/Confirm Button'))
}

WebUI.verifyElementPresent(findTestObject('Module Page/img_Supply Asset'), 120)

WebUI.click(findTestObject('Module Page/img_Supply Asset'))

WebUI.verifyElementPresent(findTestObject('Supply Home Page/img_TAG Samurai logo'), 120)

WebUI.waitForElementClickable(findTestObject('Supply Home Page/Button Setting sidebar'), 20)

WebUI.click(findTestObject('Supply Home Page/Button Setting sidebar'))

WebUI.click(findTestObject('Supply Home Page/Button Setting sidebar - item'))

