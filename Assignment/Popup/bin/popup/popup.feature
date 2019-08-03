Feature: Popup
Scenario: O clicking on Popup button we have to navigate to another link
Given I should see a button named "open window"
When I clicked on the Popup button
Then I should navigate to other tab named "www.google.com"