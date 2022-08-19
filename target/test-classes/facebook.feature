@features02
Feature: To validate the FaceBook Login Functionality
Background: 
Given  To launch the Chrome browser and hit the facebook url
@sanity
Scenario: To validate the Invalid userName and Invalid password
#Given To launch the Chrome browser and hit the facebook
When  To pass the invalid userName to userName field
|vijay@gmail.com|surya@gmail.com|vikram@gmail.com|kamal@gmail.com|rajini@gmail.com|
And To pass the invalid password to password field
|nayan|anushka|samantha|
|trisha|kajal|kirhtishetty|
|priya|bhavani|sankar|
And To click the login button
#Then To close the Browser

@regression @sanity
Scenario Outline:
          To validate the username and password
    
  # Given  To launch the browser and launch the facebook url
   When  To pass the username "<username>"to username field
   And   To pass the password"<password>" to password field
   And   To click the login button
   #Then browser is closed
   
   Examples:
|username|password|
|srk@gmail.com|srk123|
|saranesh@gmail.com|saranesh123|
|gagigowtham@gmail.com|gagigowtham123|
|surrender@gmail.com|surrender123|       