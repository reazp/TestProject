TestProject
===========

Sample Test Project

This project is about taking selef serve coustomer into AdLeads system. User will be able to comto this site 
and fill out the form and data sent out to out Salesforce account to further validation and to 
distribute across our sales team.


This project is a UI form and some java script validation to make sure user enter valid data.


I used WebDriver Java API , Junit Test framework and Junit Assert API to finish this project.


All the libary will be found under lib directory of the project.


for further reference visit:

WebDriver Jar download and wiki page: http://code.google.com/p/selenium/downloads/list
Junit assert API: http://junit.sourceforge.net/javadoc/org/junit/Assert.html

The whole project is designed based on MVC design pattern. Here all the locators of web Elements
will work as a model, wrapped Webdriver api method will work like a controller, we have to pass test values 
to controller as weel to see the view which will be our test classes.

Enhancement that can be done:

* Using any build tool like ant or maven we can easily generate a junit test report which can be viewed as a html file.
* Webdriver api has a method to take a screen shot for evry UI failed test which can be added to the project for taking
 screenshot for a failed test. This solution can be found on my blog: http://www.rpatwary.com/2012/08/25/taking-failed-test-screenshot-using-junit/

How to run the project:

* These tests are Junit tests so use any popular IDE and make sure you have Junit plugin installed. All you
 have to do is to right click on the Test Class and select run as Junit test. Junit will do the rest.

Happy Testing :)

Please feel free to contact me for further question @ "reaz@rpatwary.com"
