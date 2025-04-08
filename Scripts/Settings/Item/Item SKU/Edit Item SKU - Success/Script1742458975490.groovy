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

WebUI.callTestCase(findTestCase('Settings/Item/Item SKU/Mengakses halaman Item SKU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Supply-Item-Item SKU/FInd by SKU Action Button'))

WebUI.click(findTestObject('Supply-Item-Item SKU/Find by SKU Action Button Edit'))

WebUI.click(findTestObject('Supply-Item-Item SKU/Select Brand - Edit SKU'))

WebUI.setText(findTestObject('Supply-Item-Item SKU/Search Field Brand - Select Brand - Edit'), 'Valve')

WebUI.click(findTestObject('Supply-Item-Item SKU/Search Option - Select Brand - Edit'))

WebUI.click(findTestObject('Supply-Item-Item SKU/Select ModelType - Edit SKU'))

WebUI.setText(findTestObject('Supply-Item-Item SKU/Search Field ModelType - Select ModelType - Edit'), 'Test')

WebUI.click(findTestObject('Supply-Item-Item SKU/Search Option - Select ModelType - Edit'))

WebUI.setText(findTestObject('Supply-Item-Item SKU/SKU Field - Edit'), 'VWXYZ')

WebUI.setText(findTestObject('Supply-Item-Item SKU/SKU Alias Field - Edit'), 'Alphabet')

WebUI.setText(findTestObject('Supply-Item-Item SKU/Minimum Stock Field - Edit'), '30')

WebUI.click(findTestObject('Supply-Item-Item SKU/Select TAG Type - Edit SKU'))

WebUI.setText(findTestObject('Supply-Item-Item SKU/Search Field TAG Type - Select TAG Type - Edit'), 'RFID')

WebUI.click(findTestObject('Supply-Item-Item SKU/Search Option - Select TAG Type - Edit'))

WebUI.click(findTestObject('Supply-Item-Item SKU/Button Save - Edit Item SKU'))

