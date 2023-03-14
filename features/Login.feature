Feature: User access to social networking site
Scenario: Verify authentication functionality
Given I am a social networking site user
When I enter user name as username1
And I enter password as password1
Then I should be redirected to the home page of the site