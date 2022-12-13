@SmokeTest
  @FClogin

  Feature: Testing FC LOGIN
    Scenario:  Login with account

      Given Opens base url
#      And window maximize
#      And give 10 secs to load
      When click on login buttonn
      And click on username
      And click on password box
      And click on submit
      Then I stop the driver










