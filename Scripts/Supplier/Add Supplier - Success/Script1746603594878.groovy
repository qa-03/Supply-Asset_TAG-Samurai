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

WebUI.callTestCase(findTestCase('Supplier/Mengakses halaman supplier'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Supply-Supplier/Button Add Supplier'))

WebUI.setText(findTestObject('Supply-Supplier/Field Company Name'), '__CompanySupplier')

WebUI.click(findTestObject('Supply-Supplier/Dropdown Item Name'))

WebUI.click(findTestObject('Supply-Supplier/Option Item Name 1 - Laptop Dell XPS 13'))

WebUI.waitForElementClickable(findTestObject('Supply-Supplier/Dropdown SKU'), 10)

WebUI.click(findTestObject('Supply-Supplier/Dropdown SKU'))

WebUI.scrollToElement(findTestObject('Supply-Supplier/Option SKU 1 - SKU-IT'), 10)

WebUI.click(findTestObject('Supply-Supplier/Option SKU 1 - SKU-IT'))

WebUI.click(findTestObject('Supply-Supplier/Button Submit'))

