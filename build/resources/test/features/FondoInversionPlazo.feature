Feature: Fondo de inversion

  Scenario Outline: 02 - Usuario quiere cambiar plazo renta fija
    Given un usuario requiere cambiar el plazo de renta de su inversion
    And   tiene una cuenta activa en el fondo de inversion
    When  cumple los requisitos minimos de antiguedad de "<meses>" meses
    Then  el usuario cambia el plazo de renta de su inversion

    Examples:
      |meses|
      | 1    |
      | 2    |
      | 3    |
