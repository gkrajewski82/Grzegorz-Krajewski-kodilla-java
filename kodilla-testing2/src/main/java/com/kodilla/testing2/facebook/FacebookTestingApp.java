package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES = "//div[@class=\"_9xo5\"]/button";
    public static final String XPATH_OPEN_REGISTRATION = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_SELECT_BIRTHDAY = "//span[@class=\"_5k_4\"]/span/select[1]";
    public static final String XPATH_SELECT_BIRTHMONTH = "//span[@class=\"_5k_4\"]/span/select[2]";
    public static final String XPATH_SELECT_BIRTHYEAR = "//span[@class=\"_5k_4\"]/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptCookies.click();

        WebElement OpenRegistration = driver.findElement(By.xpath(XPATH_OPEN_REGISTRATION));
        OpenRegistration.click();
        Thread.sleep(2000);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_BIRTHDAY));
        Select selectBirthDay = new Select(selectComboDay);
        selectBirthDay.selectByValue("15");
        Thread.sleep(2000);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_BIRTHMONTH));
        Select selectBirthMonth = new Select(selectComboMonth);
        selectBirthMonth.selectByValue("2");
        Thread.sleep(2000);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_BIRTHYEAR));
        Select selectBirthYear = new Select(selectComboYear);
        selectBirthYear.selectByValue("1982");
    }
}
