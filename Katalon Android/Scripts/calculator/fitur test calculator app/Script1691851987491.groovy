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

Mobile.startApplication('mobileapp/Calculator_v8.1.apk', false)

Mobile.tap(findTestObject('mobileapp-calculator/3dot.ImageView'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Choose theme'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/ThemeDark'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Theme.Button - OK'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - 4'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/perkalian.Button -'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - 5'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/samadengan.Button -'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - AC'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - 1'), 0)

Mobile.doubleTap(findTestObject('mobileapp-calculator/Button - 0'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/kurang.Button -'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - 2'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - 0'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/samadengan.Button -'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Button - AC'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/3dot.ImageView'), 0)

Mobile.tap(findTestObject('mobileapp-calculator/Help3dot'), 0)

Mobile.verifyElementExist(findTestObject('mobileapp-calculator/Popular articles'), 0)

Mobile.pressBack()

Mobile.closeApplication()

