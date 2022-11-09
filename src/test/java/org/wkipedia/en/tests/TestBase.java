package org.wkipedia.en.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.wkipedia.en.drivers.BrowserstackMobileDriver;
import org.wkipedia.en.drivers.PersonalMobileDriver;
import org.wkipedia.en.drivers.VirtualMobileDriver;
import org.wkipedia.en.helpers.Attach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;
import static org.wkipedia.en.helpers.Attach.sessionId;

public class TestBase {
    public static String device = System.getProperty("deviceHost");

    @BeforeAll
    public static void setup() {
        switch (device) {
            case ("browserstackDevice"):
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
            case ("personalDevice"):
                Configuration.browser = PersonalMobileDriver.class.getName();
                break;
            case ("virtualDevice"):
                Configuration.browser = VirtualMobileDriver.class.getName();
                break;
            default:
                throw new RuntimeException("Host is not found!");
        }

        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        
        step("Close driver", Selenide::closeWebDriver);

        if (device.equals("browserstackDevice"))
            Attach.video(sessionId);
    }
}
