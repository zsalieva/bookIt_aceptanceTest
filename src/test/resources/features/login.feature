Feature:login functionality


  Scenario:teacher login
   Given user is on login page
    #Teachers user login info will be used
   When user logs in using "myemail@gmail.com" and "mypassword"
   Then homepage should be displayed
   And title should "My application Title"
    And there should be 4 menu options
   @temp
    Scenario: Team leader login
     Given user is on login page
      #Team Leads login info
      When user logs in using "teacher@gmail.com" and "teachPassword"
      Then homepage should be displayed
      And title should "My application Title"