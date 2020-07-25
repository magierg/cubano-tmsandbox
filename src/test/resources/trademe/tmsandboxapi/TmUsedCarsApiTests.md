# REST Request

As a test automation engineer
I need to call Trademe sandbox services
So that I can complete the automation challenge

## Acceptance Criteria
* Can call service endpoint and retrieve given details

## [Check listings](-)
Given Trademe sandbox API url for used cars 
When I call that endpoint
Then I get a [a least one listing](- "c:assertTrue=getCount()")

## [Check make](-)
Given Trademe sandbox API url for car makes 
When I call that endpoint
Then I can see [Kia](- "#make") [in the results](- "c:assertTrue=checkMake(#make)")

## [Check details](-)
Given Trademe sandbox API url for used cars 
When I call that endpoint
Then I can see following attributes: [NumberPlate, Odometer, BodyStyle, Seats, Fuel, EngineSize, Transmission, Owners, RegistrationExpires, WofExpires, ModelDetail](- "#attributes") [for an existing car](- "c:assertTrue=checkDetails(#attributes)")

