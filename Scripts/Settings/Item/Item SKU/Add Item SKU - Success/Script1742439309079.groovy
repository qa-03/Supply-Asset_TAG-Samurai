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

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Button Add Item SKU'))

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Select Item Name - Register Item SKU'))

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/Search Field Test Item Name - Select Item Name - Register Item SKU'), 
    'Test_Item_Name')

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Search Option - Select Item Name - Register'))

WebUI.delay(3)

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Select Brand - Register Item SKU'))

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/Search Field Brand - Select Brand - Register'), 'Y2K')

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Search Option - Select Brand - Register'))

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Select ModelType - Register Item SKU'))

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/Search Field ModelType - Select ModelType - Register'), 'ZXCV')

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Search Option - Select ModelType - Register'))

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/SKU Field - Register'), 'Test_Item_Name_1')

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/Minimum Stock Field - Register'), '50')

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Select TAG Type - Register Item SKU'))

WebUI.setText(findTestObject('Supply-Settings-Item-Item SKU/Search Field TAG Type - Select TAG Type - Register'), 'Non TAG')

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Search Option - Select TAG Type - Register'))

WebUI.click(findTestObject('Supply-Settings-Item-Item SKU/Button Submit - Add Item SKU'))

