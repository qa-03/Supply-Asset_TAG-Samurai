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

WebUI.callTestCase(findTestCase('Settings/User/Mengakses halaman user di Module Settings'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Setting-User-List/Button Add User'), 11)

WebUI.click(findTestObject('Setting-User-List/Button Add User'))

WebUI.setText(findTestObject('Setting-User-List/Field First Name'), 'QA')

WebUI.setText(findTestObject('Setting-User-List/Field Last Name'), 'Tester 1')

WebUI.setText(findTestObject('Setting-User-List/Field Email'), 'qatester1@mailnesia.com')

WebUI.click(findTestObject('Setting-User-List/Dropdown Division'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Division Opsi QA'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Position'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Position Opsi Testing'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Dialcode'))

WebUI.setText(findTestObject('Setting-User-List/Dropdown Dialcode Search'), 'Indonesia')

WebUI.click(findTestObject('Setting-User-List/Dropdown Division Opsi Indonesia'))

WebUI.setText(findTestObject('Setting-User-List/Field Phone Number'), '09876543210')

WebUI.click(findTestObject('Setting-User-List/Dropdown Access'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting-User-List/Dropdown Access'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Access Opsi Settings Portal'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Access Opsi Supply Asset'))

WebUI.click(findTestObject('Setting-User-List/Dropdown Access'))

WebUI.click(findTestObject('Setting-User-List/Button Submit'))

WebUI.click(findTestObject('Setting-User-List/Button Create'))

