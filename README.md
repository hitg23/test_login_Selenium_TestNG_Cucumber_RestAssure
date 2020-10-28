# test_login_Selenium_TestNG_Cucumber_-_RestAssure 

This code contains how to test a login page with different credentials ( +ve, and -ve ) test
The test uses three known testing frameworks (TestNG, Cucumber, RestAssure) just to show how all of them are working 
I have implemented a data driven test approach to do both + tve and =ve test, here is a sample test data i pick 

 # Transfering data with keywords 
    Examples: 
      | userName  | password             | url     |
      | tomsmith  | SuperSecretPassword! | /secure |
      |           | SuperSecretPassword! | /login  |
      | tomsmith  |                      | /login  |
      | tomsmith  | SuperSecretPassword  | /login  |
      | tomsmith1 | SuperSecretPassword! | /login  |
      | tomsmith1 | SuperSecretPassword  | /login  |
      |           |                      | /login  |
      
      
 Cucubmer helps us to use a BDD testing approach where anyone, even product owner, is able to participate to feed and write test featurs, while the equivalent code is running and doing the actual task on behind 
 
 TestNG is so popular and very flexible to do all type of testing ( sepecially integration testing) and have lots of features like creating suite masters and running test cases in parallel 
 
 RestAssur for backend testing is really essential to do all type of webservies tests ( endpoints) with varios data types ==> which will be fast enought to cover lot tests 
 
 Selenium is better to use for UI test. 
 I suggest to use 85% of test to be done in backend and 15% from UI side test for better coverage and efficiancy
 
 To run this sample test, you need to have:
 java JDK (v>=8)
 Maven 
 
 Where the bellow libraries will be installed automatically from maven repository 
 testNg
 Cucucmber
 RestAssure
 
 
 Where to find sample test class to run and see results :
 for testNG ==> /src/test/java/testCases/TestLoginPage_using_testNG.java
 for Cucumbr ==> /src/test/java/features/loginPageTest.feature
 for RestAssure ==>/src/test/java/APITest/loginLogOut_apiTest.java
 

