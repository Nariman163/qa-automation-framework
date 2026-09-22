package com.qa.restfulbooker;

import com.qa.restfulbooker.core.BaseUiTest;
import org.junit.jupiter.api.Test;

public class SmokeTest extends BaseUiTest {

    @Test
    public void openBrowser() {
        wait.until(d -> !d.getTitle().isEmpty());
        System.out.println("Title: " + driver.getTitle());
    }
}
