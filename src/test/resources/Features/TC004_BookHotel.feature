
Feature: Book Hotel Module

  Scenario Outline: Book hotel including GST-Card(debit card)-With special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Deepakumar"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    When User click credit/Debit/ATM Card and click card type as debit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request |
			| rookie.deepu07@gmail.com |Deepakumar@2003 | Kerala | Kochi | Standard | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Valet parking needed |


  Scenario Outline: Book hotel including GST-Card(credit card)-With special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    When User click credit/Debit/ATM Card and click card type as credit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Valet parking needed |
      
    
  Scenario Outline: Book hotel including GST-Card(debit credit)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Deepakumar"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User clicks on next button without adding special request
    When User click credit/Debit/ATM Card and click card type as debit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address |
      | rookie.deepu07@gmail.com |Deepakumar@2003 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam |

  Scenario Outline: Book hotel including GST-Card(credit credit)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User clicks on next button without adding special request
    When User click credit/Debit/ATM Card and click card type as credit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam |

  Scenario Outline: Book hotel without GST-Card(credit card)-with special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User continue without entering GST details
    And User add Special Request "<Request>"
    When User click credit/Debit/ATM Card and click card type as credit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Request |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | Valet parking needed |

  Scenario Outline: Book hotel without GST-Card(debit card)-with special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the last hotel name and hotel price
    And User select the last hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User continue without entering GST details
    And User add Special Request "<Request>"
    When User click credit/Debit/ATM Card and click card type as debit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Request |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | Valet parking needed |
      
  Scenario Outline: Book hotel without GST-Card(debit card)- Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User continue without entering GST details
    And User clicks on next button without adding special request
    When User click credit/Debit/ATM Card and click card type as debit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email |
      | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com |

  Scenario Outline: Book hotel without GST-Card(credit card)- Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>" and click login
    Then User should verify success message after login "Welcome Bipin"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User scrolls down, save the first hotel name and hotel price
    And User select the first hotel and click ok to proceed to next page
    Then User should verify after select success message "Book Hotel"
    When User scroll down and  add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User continue without entering GST details
    And User clicks on next button without adding special request
    When User click credit/Debit/ATM Card and click card type as credit card and enter the payment details
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Greens    | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Greens    | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Greens    | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Greens    | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email |
     | bipevstar@gmail.com | Chayowo@12 | Andhra Pradesh | Tirupati | Deluxe | 18 July 2025 | 28 July 2025 | 1-One | 1-One | 1 | Mr.| Arun | Kumar | 1236549873 | test@gmail.com | 
