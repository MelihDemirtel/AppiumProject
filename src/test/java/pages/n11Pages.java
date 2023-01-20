package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class n11Pages {
    AppiumDriver appiumDriver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategorilerButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By appleButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Apple\")");
    By filitreButonu = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterRL\")");
    By dahiliHafizaButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By gbButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Uygula\")");
    By sonuclariGosterButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By sepetimButonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By sepetKontrol = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemTitleTV\")");

    public n11Pages(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        this.wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(appiumDriver);
    }

    public void kategoriTiklama() {
        appiumDriver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {
        List<WebElement> listOfElement = appiumDriver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(1).click();
    }

    public void telefonveAksesuarlariSecimi() {
        List<WebElement> listOfElement = appiumDriver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();
    }

    public void cepTelefonuSecimi() {
        List<WebElement> listOfElement = appiumDriver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();
    }

    public void markaSecimi() {
        appiumDriver.findElement(appleButonu).click();
    }

    public void filtrelemeyeTiklama() {
        appiumDriver.findElement(filitreButonu).click();
    }

    public void filtrelemeYapma() {
        appiumDriver.findElement(dahiliHafizaButonu).click();
        appiumDriver.findElement(gbButonu).click();
        appiumDriver.findElement(uygulaButonu).click();
    }

    public void sonuclarigostereTiklama() {
        appiumDriver.findElement(sonuclariGosterButonu).click();
    }

    public void urunSepeteEkleme() {
        List<WebElement> listOfElement = appiumDriver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")"));
        listOfElement.get(0).click();
    }

    public void sepetimeGitme() {
        appiumDriver.findElement(sepetimButonu).click();
    }

    public void sepeteUrununGeldigiKontrolEtme() {
        elementHelper.checkVisible(sepetKontrol);
    }
}
