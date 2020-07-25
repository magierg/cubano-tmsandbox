# Search For Concordion

As a test automation engineer
I need to visit TradeMe sandbox used cars page
So that I can complete the automation challenge

## Acceptance Criteria
* Used cars listings available and return given attributes

## [Listings Exist](-)
Given I have opened used cars page
Then I can see [at least one listing](- "c:assertTrue=atLeastOneListingExists()")

## [Make Kia exists](-)
Given I have opened used cars page
Then I can see make [Kia exists](- "c:assertTrue=makeExists()")

## [trhee](-)
Given I have opened used cars page
When I select first car listing
Then I can see following [attributes](- "c:assertTrue=allAttributesHaveValue()")

