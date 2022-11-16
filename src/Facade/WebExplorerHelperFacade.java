package Facade;

import java.sql.Driver;

public class WebExplorerHelperFacade {

    public static void generateReports(String explorer, String reports, String test){
        Driver driver = null;
        switch (explorer){
            case "firefox":
                driver = Firefox.getFirefoxDriver();
                switch(reports){
                    case "html":
                        Firefox.generateHTMLReoports(test,driver);
                        break;
                    case "junit":
                        Firefox.generateJUnitReports(test,driver);
                        break;
                }

            break;

            case "chrome":
                driver = Chrome.getChromeDriver();
                switch (reports){
                    case "html":
                        Chrome.generateHTMLReoports(test,driver);
                        break;
                    case "junit":
                        Chrome.generateJUnitReports(test,driver);
                        break;
                }
        }

    }
}
