package code;

import base.testbase2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import pages.newCustomer;
import utilities.DriverUtil;
import utilities.PropertiesReadingUtil;

public class lab13 extends testbase2 {
//    POM Example TEST - Share Github Link for this
//    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully
// Hint-TestNG :

//Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer // verify the message customer registered sucessfully.

    loginPage login=new loginPage();
    newCustomer customer= new newCustomer();
    @Test
    public void TC1(){
         DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("Url"));

        Assert.assertTrue(login.verifyHeader("Guru99 Bank"));


    }
    @Test
    public void TC2() {
    login.userIdInput(PropertiesReadingUtil.getProperties("userId"), PropertiesReadingUtil.getProperties("password"));
}   @Test
    public void TC3() {
    homePage home = new homePage();
    Assert.assertEquals(home.checkManagerID(), PropertiesReadingUtil.getProperties("userId"));
    home.clickNewCustomerButton();

}
    @Test
    public void TC4() throws InterruptedException {

    newCustomer customer= new newCustomer();
    Assert.assertTrue(customer.verifyHeader());
    customer.newCustomerName(PropertiesReadingUtil.getProperties("newCustomername"));
    customer.customerGender();
    customer.calenderdrop(PropertiesReadingUtil.getProperties("Dob"));
    customer.customerAdress(PropertiesReadingUtil.getProperties("Adress"),PropertiesReadingUtil.getProperties("CityName"),PropertiesReadingUtil.getProperties("StateName"),
            PropertiesReadingUtil.getProperties("Pin"),PropertiesReadingUtil.getProperties("PhoneNumber"),PropertiesReadingUtil.getProperties("email"),
            PropertiesReadingUtil.getProperties("Password"));

    customer.SubbmitButton();
    Assert.assertTrue(customer.verrifyHeader(  "Customer Registered Successfully!!!"));


        System.out.println(customer.heading.getText());


}




}



