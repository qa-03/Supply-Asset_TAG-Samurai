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

WebUI.callTestCase(findTestCase('Settings/Item/Item Name/Mengakses halaman item name'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button New Category'))

WebUI.setText(findTestObject('Sidebar Category (Can be Multimenu)/Field Category Name di Sidebar Category'), '__123')

WebUI.delay(3)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Submit di Sidebar Category'))

Thread.sleep(15000)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action 4 - __123 Delete Sub'))

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action - Create Sub Group'))

WebUI.setText(findTestObject('Sidebar Category (Can be Multimenu)/Field Category Name di Sidebar Category'), '__4')

WebUI.delay(3)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Submit di Sidebar Category'))

Thread.sleep(15000)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action 4 - __123 Delete Sub'))

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action - Create Sub Group'))

WebUI.setText(findTestObject('Sidebar Category (Can be Multimenu)/Field Category Name di Sidebar Category'), '__999')

WebUI.delay(3)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Submit di Sidebar Category'))

Thread.sleep(15000)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action 4 - __123 Delete Sub'))

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action - Delete Group'))

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Delete di Sidebar Category'))

Thread.sleep(1500)

WebUI.verifyTextPresent('Success, category has been deleted.', false)

