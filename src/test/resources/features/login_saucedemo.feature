Feature: Buy products
  I as user of sauce demo page
  I want to add products to the shopping car
  To make the purchase

  Scenario Outline: Succesfull purchase
    Given the user "dahia" login in the Suace demo page
    When the user add the product
    And do the checkout
      | name   | lastname   | postal      |
      | <name> | <lastname> | <codpostal> |
    Then can see the succesfull purchase
    Examples:
      | name      | lastname | codpostal |
      | Dahiana   | Santiago | 050034    |
     # | Valentina | Posada   | 050055    |
      #| Fabi      | Ouuu     | 050032    |