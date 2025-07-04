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

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action 1 - __ARCANA'))

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Action - Edit Group'))

WebUI.setText(findTestObject('Sidebar Category (Can be Multimenu)/Field Category Name di Sidebar Category'), '__ARCANA99')

WebUI.delay(3)

Runtime.runtime.exec('netsh interface set interface "Ethernet" admin=disable')

Thread.sleep(10000)

WebUI.click(findTestObject('Sidebar Category (Can be Multimenu)/Button Save di Sidebar Category'))

Thread.sleep(2500)

Runtime.runtime.exec('netsh interface set interface "Ethernet" admin=enable')

WebUI.verifyTextPresent('Error, failed to edit category. Please check your connection and try again.', false)

