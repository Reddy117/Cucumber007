
@tag
Feature: Kart
  I want to use this template for my feature file

 @tag2
  Scenario Outline: Add product to kart
    Given User should open bro
    And user should login
    And AddProduct to kart using "<Qty>" and "<Size>"
    Then Product should be displayed in the kart

    Examples: 
      | Qty | Size |
      |   2 | S    |
      |   3 | L    |
