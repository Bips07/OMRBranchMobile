Feature: Select Hotel Module

  Scenario Outline: Select first hotel
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 |
