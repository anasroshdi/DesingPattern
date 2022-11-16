package Facade;

import java.sql.Driver;

public class Firefox {

    public static Driver getFirefoxDriver(){
        return null;
    }

    public static void generateHTMLReoports(String test, Driver driver){
        System.out.println("Genereating html report for firfox driver");
    }

    public static void generateJUnitReports(String test, Driver driver){
        System.out.println("Genereating junit report for firfox driver");
    }

}
