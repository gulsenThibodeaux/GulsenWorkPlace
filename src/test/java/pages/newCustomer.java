package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtil;
import utilities.browserUtils;

public class newCustomer extends basePage {
    //Third page is for New Customer Entry Page where you need to locate : customer information boxes
    // such as name,adrees,gender,email,password etc.


    @FindBy(xpath = "//p[@class='heading3']")
    public WebElement addNewCustomerButton;
    @FindBy(xpath ="//input[@name='name']" )
    public WebElement customerName;
    @FindBy(xpath = "(//input[@name='rad1'])[2]")
    public WebElement gender;
    @FindBy(xpath = "//input[@onblur='validatedob();']")
    public WebElement calender;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement adress;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;
    @FindBy(xpath ="//input[@name='telephoneno']")
    public WebElement Phone;
    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submit;
    @FindBy(xpath = "(//table[@id='regmsg']/tbody/tr/td)/table/tbody/tr")
    public WebElement heading;





    public boolean verifyHeader() throws InterruptedException {
        browserUtils.wait(4);

        boolean isVerified = false;
        if(addNewCustomerButton.getText().equalsIgnoreCase("Add New Customer"))
        {
            isVerified = true;
        }
        return isVerified;

    }

    public void newCustomerName(String customer){
        customerName.sendKeys(customer);

    }
    public void customerGender(){
        gender.click();
    }
    public void calenderdrop(String birthDate){
        calender.clear();
        calender.sendKeys(birthDate);
    }
    public void customerAdress(String addAdress,String AddCity,String AddState,String AddPin,String AddPhone,
                               String AddEmail,String Addpassword){
        adress.sendKeys(addAdress);
        city.sendKeys(AddCity);
        state.sendKeys(AddState);
        pin.sendKeys(AddPin);
        Phone.sendKeys(AddPhone);
        email.sendKeys(AddEmail);
        password.sendKeys(Addpassword);

    }
    public void SubbmitButton(){
        submit.click();

    }
    public boolean verrifyHeader(String expectedheader){
        if (heading.getText().equalsIgnoreCase(expectedheader)){
            return true;
        }else{
            return false;
        }


    }



    }



