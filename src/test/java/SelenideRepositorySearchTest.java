import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SelenideRepositorySearchTest {

    @Test
    void sortAssertionsContainsJUnit5Example() {
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click();

        $$(".flex-1.py-1").last().shouldHave(text("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").ancestor("h4")
                .shouldHave(text("Using JUnit5 extend test class:"));
    }

}
