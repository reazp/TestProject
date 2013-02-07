package com.pontiflex.data;

/**
 * User: reaz
 * Date: Mar 2, 2012
 */
public class AdLeadSignUpData {

    private String firstName;
    private String lastName;
    private String company;
    private String country;
    private String phoneNumber;
    private String email;
    private String url;

    private String appName;

   public AdLeadSignUpData(){
        setFirstName("Test User First Name")
                .setLastName("Test User Last name")
                .setCompany("Test Company")
                .setCountry("UNITED STATES")
                .setPhoneNumber("212-212-2121")
                .setEmail("testemail@test.com")
                .setUrl("http://testurl.com")
                .setAppName("Temple Runner");
   }

    public String getFirstName() {
        return firstName;
    }

    public AdLeadSignUpData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AdLeadSignUpData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public AdLeadSignUpData setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AdLeadSignUpData setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AdLeadSignUpData setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AdLeadSignUpData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AdLeadSignUpData setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAppName() {
        return appName;
    }

    public AdLeadSignUpData setAppName(String appName) {
        this.appName = appName;
        return this;
    }
}
