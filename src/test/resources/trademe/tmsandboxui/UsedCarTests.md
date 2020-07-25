# Search For Concordion

As a test automation engineer
I need to visit TradeMe sandbox used cars page
So that I can complete the automation challenge

## Acceptance Criteria
* Used cars listings available and return given attributes

## [At least one listing exist](-)
Given I have opened used cars page
Then I can see [at least one listing](- "c:assertTrue=isAtLeastOneListingDisplayed()")

## [Make Kia exists](-)
Given I have opened used cars page
Then I can see make [Kia](- "#make") [displayed](- "c:assertTrue=isMakeDisplayed(#make)")

## [Attributes being displayed](-)
Given I have opened used cars page
When I select first car listing
Then I can see following [attributes](- "c:assertTrue=doAllAttributesHaveValue()")

