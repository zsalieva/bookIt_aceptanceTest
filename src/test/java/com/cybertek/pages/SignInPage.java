package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
          @FindBy(css="*[name='email']")
        //@FindBy (xpath ="//input[@name='email']")
        public WebElement email;

        @FindBy(xpath ="//input[@name='password']")
        public WebElement password;

        @FindBy(xpath="//button[@type='submit']")
         public WebElement signIn;

}
