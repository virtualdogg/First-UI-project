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

WebUI.navigateToUrl('https://demoorangeforme-trials712.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Delete Education/Page_OrangeHRM/input_Login_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Delete Education/Page_OrangeHRM/input_Login_txtPassword'), 'Ns/gyzxDMr4pu6LNweHOow==')

WebUI.click(findTestObject('Object Repository/Delete Education/Page_OrangeHRM/button_Login'))

WebUI.setText(findTestObject('Object Repository/Delete Education/Page_Employee Management/input_search_menuQuickSearchmenuQuickSearch'), 
    'education')

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Employee Management/div_Education'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/label'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/i_more_horiz'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/a_Delete Selected'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/a_Yes, Delete'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/div_Successfully Deleted'))

WebUI.rightClick(findTestObject('Object Repository/Delete Education/Page_Qualifications/div_Successfully Deleted'))

WebUI.click(findTestObject('Object Repository/Delete Education/Page_Qualifications/th_Level of Education   arrow_upward'))
