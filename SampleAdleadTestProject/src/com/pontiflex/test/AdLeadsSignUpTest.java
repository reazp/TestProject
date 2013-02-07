package com.pontiflex.test;

import com.pontiflex.controller.AdLeadsSignUpController;
import com.pontiflex.base.AdLeadBase;
import org.junit.Test;

/**
 * User: reaz
 * Date: Mar 8, 2012
 */
public class AdLeadsSignUpTest extends AdLeadBase {

    AdLeadsSignUpController adLeadSignupPage = new AdLeadsSignUpController();

    @Test
    public void adLeadRegistration() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
        adLeadSignupPage.signUpComplete();
    }

    @Test
    public void allFieldsEmpty() {
        adLeadSignupPage.allEmptyFiled();
    }

    @Test
    public void PhoneNumberFormatCheck() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
        adLeadSignupPage.verifyPhoneWrongFormat();
    }

    @Test
    public void WebSiteURLCheck() {
        adLeadSignupPage.enterAllrequiredFields();
        adLeadSignupPage.clickSignUpNow();
        adLeadSignupPage.verifyWebFormat();
    }
}
