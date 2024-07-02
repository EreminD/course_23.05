package ru.inno.lesson12.enums;

import static ru.inno.lesson12.enums.DriverType.*;

public class WebDriverFactory {


    public void getDriver(DriverType type){

        if (type == CHROME){
            //return new ChromeDriver();
        }

        if (type == FIREFOX){
            //return new FirefoxDriver():
        }
    }
}
