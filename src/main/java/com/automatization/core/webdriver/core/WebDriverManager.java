package com.automatization.core.webdriver.core;

import com.automatization.core.exception.InitWebDriverException;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;

public class WebDriverManager {

    public WebDriverManager() {
        String property = System.getProperty("webdriver.type");
        if (property == null || property.isEmpty()) {
            throw new InitWebDriverException("Не указан тип драйвера");
        }
        try {
            WebDriverType webDriverType = WebDriverType.valueOf(property);
            switch (webDriverType) {
                case FIREFOX:
                    Configuration.browser = Browsers.FIREFOX;
                    break;
                case OPERA:
                    Configuration.browser = Browsers.OPERA;
                    break;
                case EDGE:
                    Configuration.browser = Browsers.EDGE;
                    break;
                case IE:
                    Configuration.browser = Browsers.INTERNET_EXPLORER;
                    break;
                default:
                    Configuration.browser = Browsers.CHROME;
                    break;
            }
        } catch (Exception ex) {
            throw new InitWebDriverException("Ошибка инициализации драйвера", ex);
        }
    }
}
