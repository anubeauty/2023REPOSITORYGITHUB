Feature: User access to a job portal
Scenario: verify if page is redirected properly
Given i enter the indeed.com address
When enter job type and job place
And click submit
Then I should be redirected to the jobs available in the site