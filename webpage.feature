Feature: View Aspiration and Aspiration Plus Products

@spend&save
Scenario: Aspiration and Aspiration Plus Validation in Web Page
    Given User Enters the Aspiration Home Page URL
    And User clicks on Spend & Save tab
    Then User validates the Aspiration and Aspiration Plust Product is Visible
    
@spend&save
Scenario: Aspiration pack validation
    Given User Enters the Aspiration Home Page URL
    And User clicks on Spend & Save tab
    Then User clicks on Get Aspiration Link and validate email signUp popup
    
@spend&save
Scenario: Aspiration Plus pack validation
    Given User Enters the Aspiration Home Page URL
    And User clicks on Spend & Save tab
    Then User clicks on Get Aspiration Plus Link and validate email signUp popup with yearly and Monthly Plan
 