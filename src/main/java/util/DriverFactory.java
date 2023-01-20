package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static AppiumDriver appiumDriver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initialize_Driver(String browser){
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")) {
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid","emulator-5554");
            capabilities.setCapability("addPackage","com.dmall.mfandroid");
            capabilities.setCapability("appActivity","com.dmall.mfandroid.activity.base.NewSplash");
        }else if(browser.equals("IOS")){
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("udid","");
            capabilities.setCapability("addPackage","");
            capabilities.setCapability("appActivity","");
        }
        try {
            appiumDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int impWait = Integer.parseInt(properties.getProperty("implicitlyWait"));
        appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return getAppiumDriver();
    }
    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }

}
