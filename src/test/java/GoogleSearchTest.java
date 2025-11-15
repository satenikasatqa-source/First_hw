import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
    @Test
    void testGoogleSearch() {

        open("https://www.google.com/");
        $("[name='q']").setValue("selenide").pressEnter();
        $("html").shouldHave(text("selenide"));
    }
}

