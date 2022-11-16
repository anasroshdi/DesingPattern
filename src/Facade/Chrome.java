package Facade;

import java.sql.Driver;

public class Chrome {

    public static Driver getChromeDriver(){
        return null;
    }

    public static void generateHTMLReoports(String test, Driver driver){
        System.out.println("Genereating html report for chrome driver");
    }

    public static void generateJUnitReports(String test, Driver driver){
        System.out.println("Genereating junit report for chrome driver");
    }
}
