@controls
Feature: Validaciones de controles en API Demos

  @smoke
  Scenario: Validar checkbox y switch
    Given que Oscar abre la app
    When navega a la opcion "Views"
    And navega a la opcion "Controls"
    And navega a la opcion "1. Light Theme"
    And marca el checkbox
    And activa el switch
    Then el checkbox deberia estar marcado
    And el switch deberia estar activado
