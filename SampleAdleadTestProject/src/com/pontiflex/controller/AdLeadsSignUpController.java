package com.pontiflex.controller;

import com.pontiflex.model.AdLeadsSignUpModel;
import com.pontiflex.data.AdLeadSignUpData;
import com.pontiflex.base.WebDriverWrapper;

import static org.junit.Assert.assertTrue;

/**
 * User: reaz
 * Date: Mar 2, 2012
 */
public class AdLeadsSignUpController extends WebDriverWrapper {
    private AdLeadsSignUpModel model = new AdLeadsSignUpModel();
    private AdLeadSignUpData data = new AdLeadSignUpData();
    
    public AdLeadsSignUpController() {
        super();
        model = new AdLeadsSignUpModel();
    }
    
    public void enterFirstName() {
        type(model.getFirstNameTextbox(), data.getFirstName());
    }

    public void enterLastname() {
        type(model.getLastNameTextbox(), data.getLastName());
    }

    public void enterCompany() {
        type(model.getCompanyTextbox(), data.getCompany());
    }

    public void selectCountry() {
        selectByVisibleText(model.getCountrySelectionBox(), data.getCountry());
    }

    public void enterPhone() {
        type(model.getPhoneTextbox(), data.getPhoneNumber());
    }

    public void enterEmail() {
        type(model.getEmailTextbox(), data.getEmail());
    }

    public void enterWeb() {
        type(model.getWebsiteURLTextbox(), data.getUrl());
    }

    public void checkIAgree() {
        check(model.getIAgreeCheckbox());
    }

    public void clickSignUpNow() {
        click(model.getSignUpNowButton());
    }

    public void enterAppName() {
        type(model.getAppNamesTextbox(), data.getAppName());
    }

    public void signUpComplete() {
        waitForTextPresent("Thanks for signing up!");
        assertTrue("Unable to complete sign up", isTextPresent("Thanks for signing up!"));
        assertTrue("Unable to complete sign up", isTextPresent("Check your inbox for an email with instructions on completing your account creation process."));
    }

    public void verifyFiledsEmtyMessge() {
        assertTrue("AdLead  Empty fields messege heading verification", isTextPresent("Whooops! There appear to be errors in the form."));
    }

    public void verifyFnameEmpty() {
        assertTrue("First Name Field empty messege  verification", isTextPresent("Please enter your First Name"));
    }

    public void verifyLnameEmpty() {
        assertTrue("Last Name Field empty messege  verification", isTextPresent("Please enter your Last Name"));
    }

    public void verifyCompanyNameEmpty() {
        assertTrue("Company Name Field empty messege  verification", isTextPresent("Please enter your Company Name"));
    }

    public void verifyPhoneNumberEmpty() {
        assertTrue("Phone Number Field empty messege  verification", isTextPresent("Please enter your Phone Number"));
    }

    public void verifyEmailEmpty() {
        assertTrue("Email Field empty messege  verification", isTextPresent("Please enter your Email Address"));
    }

    public void verifyURLEmpty() {
        assertTrue("Website URL Field empty messege  verification", isTextPresent("Website URL must start with 'http://' or 'https://' and end with a valid suffix (e.g. '.com' or '.us')"));
    }

    public void iagreeCheckboxEmpty() {
        assertTrue("I agree Checkbox Field not selected messege  verification", isTextPresent("Please accept the Terms & Conditions"));
    }

    public void verifyPhoneWrongFormat() {
        assertTrue("Us Phone number format verification", isTextPresent("Please format your Phone Number like XXX XXX XXXX"));
    }

    public void verifyWebFormat() {
        assertTrue("Website URL format verification", isTextPresent("Website URL must start with 'http://' or 'https://' and end with a valid suffix (e.g. '.com' or '.us')"));
    }

    public void enterAllrequiredFields() {
        enterFirstName();
        enterLastname();
        enterCompany();
        selectCountry();
        enterPhone();
        enterEmail();
        enterWeb();
        checkIAgree();
    }

    public void allEmptyFiled() {
        clickSignUpNow();
        verifyFiledsEmtyMessge();
        verifyFnameEmpty();
        verifyLnameEmpty();
        verifyCompanyNameEmpty();
        verifyPhoneNumberEmpty();
        verifyEmailEmpty();
        verifyURLEmpty();
        iagreeCheckboxEmpty();
    }
}
