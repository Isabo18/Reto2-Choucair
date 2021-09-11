Feature: Enter the Magneto page and then log in

  Scenario: Login to Magneto
    Given the entry to the magnet page, I select the option enter
    When I add the email and password
      | email                          | password   |
      | isaboarredondomateus@gmail.com | Samuel0207 |
    Then valid my name
    |nameUser|
    |Isabo   |


