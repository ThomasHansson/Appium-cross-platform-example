# Appium-cross-platform-example
An Appium (java) example project for cross platform testing of an Android and an iOS application

Instructions:

1. Download and setup Appium (see http://appium.io/getting-started.html)

2. Import this project as a maven project in e.g. IntelliJ or Eclipse.

3. Set the executionOS variable in the AppiumController class (src/test/java/AppiumSupport/AppiumController.java) to Android or iOS depending on what platform you want to execute the example test on. (For Android it should work to run on both emulator and device but for iOS it will only work on the simulator.)

4. Start the appium server and run the example test “searchContact” in src/test/java/Test/Test_ContactSearch.java.


Browserstack:

It's also possible to run the tests against Browserstack (https:www.browserstack.com). To do this you need to do the following.

1. Enter your Browserstack credentials in the AppiumController class (BS_USERNAME and BS_ACCESSKEY). 

2. Upload the applications to Browserstack and set the hashed application id you get back also in AppiumController class (IOS_HASHED_APP_ID and ANDROID_HASHED_APP_ID). More info how to do this can be found here: https://www.browserstack.com/app-automate.

3. Set the executionOS variable in the AppiumController class to ANDROID_BROWSERSTACK or IOS_BROWSERSTACK

4. Run the example test “searchContact” in src/test/java/Test/Test_ContactSearch.jav
