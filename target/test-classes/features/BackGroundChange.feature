@BackgroundChangeFeature

Feature: Background color change validation in Techfios Page

Background:
 Given User should be on Techfios Login Page

Scenario: User should be able to change SkyBlue BackGround
Given Set SkyBlue Background button exists
When I click on the button
Then the background color will change to sky blue



Given Set SkyWhite Background button exists
When I click in the SkyWhite button
Then the background color will change to white



