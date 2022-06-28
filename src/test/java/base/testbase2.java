package base;

import org.testng.annotations.*;
import utilities.DriverUtil;
import utilities.browserUtils;

import java.util.concurrent.TimeUnit;

public class testbase2 {
    //abstraction example

    @BeforeClass
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterClass
    public void closing(){
        browserUtils.wait(5);
        //  DriverUtil.closeDriver();
    }

}
