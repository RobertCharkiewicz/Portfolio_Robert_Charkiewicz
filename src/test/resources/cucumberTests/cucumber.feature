Feature:  Automation in practice tests - adding two products to shopping cart by new user

  Background:
    Given Page is loaded
    And Sign In button is displayed on HOME PAGE

  Scenario: Verify if two products selected by NewUser are correctly added to shopping cart
    When User clicks SignIn button on HOME PAGE
    And User fills email address box in CREATE AN ACCOUNT section on LOGIN PAGE with email@abc.com
    And User clicks Create An Account button on LOGIN PAGE
    And User fills out all mandatory fields on ACCOUNT CREATION FORM PAGE
      | Name       | Jan       |
      | Lastname   | Kowalski  |
      | Passwd     | ABC1xyz!  |
      | BirthDay   | 22        |
      | BirthMonth | 11        |
      | BirthYear  | 2005      |
      | Address    | address   |
      | City       | city      |
      | State      | Alabama   |
      | PostCode   | 12345     |
      | MobileNo   | 123456789 |

    And User clicks Register button on ACCOUNT CREATION FORM PAGE
    And User clicks Woman header on MY ACCOUNT PAGE
    And User clikcs QuickView button on WOMAN CATEGORY PRODUCTS PAGE
    And User add second product by clicking on QuantityPlus button in PRODUCT IFRAME
    And User clicks AddToCart button in PRODUCT IFRAME
    And User clicks ProceedToCheckout button in PRODUCT SUCCESSFULLY ADDED WINDOW displayed
    Then Check if product name is "Blouse", quantity is "2" and total price value is "$56.00" in SHOPPING CART SUMMARY PAGE
    And Page is closed

