Feature: Fondo de inversion

  @RutaCritica
  Scenario Outline: 03 - Retirar ganancias de  fondo de inversion de renta fija
    Given un usuario requiere retirar sus ganancias de inversion de renta fija
    And tiene un producto activo en el fondo de inversion
    When  cubre  el  tiempo  total  de inversion "<Plazos>" Meses
    Then el  retiro es exitoso.

    Examples:
      | Plazos |
      | 6    |
      | 12   |
      | 24   |


