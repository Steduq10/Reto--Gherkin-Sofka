Feature: Fondo de inversion

  Scenario Outline: 01 - Adquirir cuenta en fondo de inversion de renta fija
    Given un usuario requiere una inversion de renta fija
    When  cumple los requisitos minimos del monto de inversion "<inversion>" COP
    Then la inversion es exitosa.

    Examples:
      | inversion |
      | 25.000    |
      | 20.000    |
      | 45.000    |
