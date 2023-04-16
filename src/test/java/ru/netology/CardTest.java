package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CardTest {
//    private WebDriver driver;
//
//    @BeforeAll
//    static void setUpAll() {
//        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//    }
//
//    @BeforeEach
//    void setUp() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;    }

    @Test
    void webFormSuccessTest() {
        open("http://localhost:9999");
//        SelenideElement form = $("[data-test-id=cardtest-form]");
        $("[data-test-id=name] input").setValue("Киркорова Алла-Виктория");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}

