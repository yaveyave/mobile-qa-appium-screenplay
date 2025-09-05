@alerts
Feature: Validaciones de alertas en API Demos

  @smoke
  Scenario: Abrir y aceptar un Alert Dialog
    Given que Oscar abre la app
    When navega a la opcion "App"
    And navega a la opcion "Alert Dialogs"
    And navega a la opcion "OK Cancel dialog with a message"
    Then deberia ver un texto que contiene "Lorem ipsum"
    When acepta la alerta
    Then deberia ver el texto en la alerta "App/Alert Dialogs"
