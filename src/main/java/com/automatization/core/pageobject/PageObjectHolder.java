package com.automatization.core.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectHolder {
    public <T> T initPage(Class<T> pageObjects, WebDriver driver, String title) {
        if (!driver.getCurrentUrl().contains(title)) {
            throw new IllegalStateException("This page not found");
        }
        try {
            T t = pageObjects.getConstructor().newInstance();
            PageFactory.initElements(driver, t);
            return t;
        } catch (Exception e) {
            throw new IllegalStateException("Error of initialization page", e);
        }
    }
}

