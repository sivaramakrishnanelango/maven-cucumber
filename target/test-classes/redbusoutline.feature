@features05  @features06
@sanity
Feature: To validate the Redbus webpage Functionality
Background: 
Given  To launch the Chrome browser and hit the redbus url

Scenario: To validate the starting place   and  reaching place
#Given To launch the Chrome browser and hit the facebook
When  To enter the starting place in from tab
    |from| Nagercoil|
    |from1|Madurai|
    |from2|Coimbatore|
    |from3|Trichy|
And  To enter the destination place in To tab 
 		|To|To1|To2|
 		|kumbakonam|chidambaram|cuddalore|
 		|pondy|nagercoil|salem|
 		|chennai|vellore|madurai|
And  To enter the date in this tab
Then To close thr browser