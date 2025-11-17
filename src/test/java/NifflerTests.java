import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class NifflerTests {
    @Test
    void addSpendingTests(){
        Configuration.pageLoadStrategy="eager";
        open("https://auth.niffler.qa.guru");
        $("#username").setValue("Saten");
        $("#password").setValue("Tester1234");
        $("#login-button").click();
        $("header").$(byText("New spending")).click();
        $("#amount").setValue("1005");
        $("#category").setValue("Education_MASTER");
        $("#save").click();
        $("[placeholder=Search").setValue("Education_5").pressEnter();
        $("tbody").$("tr").shouldHave(text("Education_5")).shouldHave(text("1005"));

        sleep(7000L);



    }
}

