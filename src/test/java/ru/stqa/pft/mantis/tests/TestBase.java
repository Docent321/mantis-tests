package ru.stqa.pft.mantis.tests;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.mantis.appmanager.ApplicationManager;

import java.io.IOException;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", "CHROME"));


    @BeforeSuite(alwaysRun = true)
    public void setUp() throws IOException {
        app.init();
        System.out.println("f");

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {

        app.stop();
    }


}
