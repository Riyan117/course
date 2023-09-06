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

WebUI.navigateToUrl('http://zero.webappsecurity.com/index.html')

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Personal Banking - Loans - Cred_03e923/button_Signin'))

WebUI.setText(findTestObject('Object Repository/zeroweb/Page_Zero - Log in/input_Login_user_login'), 'username')

WebUI.setEncryptedText(findTestObject('Object Repository/zeroweb/Page_Zero - Log in/input_Password_user_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Log in/input_Keep me signed in_submit'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Personal Banking - Loans - Cred_03e923/strong_Online Banking'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Free Access to Online Banking/span_Account Summary'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Account Summary/a_Account Activity'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Account Activity/a_Transfer Funds'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Transfer Funds/a_Pay Bills'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Pay Bills/a_My Money Map'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - My Money Map/a_Online Statements'))

WebUI.selectOptionByValue(findTestObject('Object Repository/zeroweb/Page_Zero - Online Statements/select_Savings                             _68be4f'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Online Statements/a_2009'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Online Statements/a_Zero Bank'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Personal Banking - Loans - Cred_03e923/strong_Feedback'))

WebUI.setText(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/input_IMPORTANT_name'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/input_IMPORTANT_email'), 'example@email.com')

WebUI.setText(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/input_IMPORTANT_subject'), 'Test')

WebUI.setText(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/textarea_IMPORTANT_comment'), 
    'Good Apps')

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/input_IMPORTANT_submit'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Contact Us/a_Zero Bank'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Personal Banking - Loans - Cred_03e923/a_username'))

WebUI.click(findTestObject('Object Repository/zeroweb/Page_Zero - Personal Banking - Loans - Cred_03e923/a_Logout'))

WebUI.closeBrowser()

