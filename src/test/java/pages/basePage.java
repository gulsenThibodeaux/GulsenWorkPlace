package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtil;

public class basePage {



    public basePage()
    {


        PageFactory.initElements(DriverUtil.getDriver(), this);

    }
}
