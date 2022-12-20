Feature: Fondo de inversion

  Scenario Outline: 04 - Usuario quiere esar una divisa para el  plazo renta fija
    Given un usuario requiere seleccionar la divisa para  su inversion
    When  abrir una cuenta de fondo de inversion  en "<divisa>" divisa
    Then  divisa seleccionada con  exito

    Examples:
      | divisa     |
      | Pesos      |
      | Dollares    |
      | Libras     |
