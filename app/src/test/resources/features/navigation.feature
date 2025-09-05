@navigation
Feature: Navegación en API Demos

  Scenario: Navegar al menu Views
    Given que Oscar abre la app
    When navega a la opcion "Views"
    Then deberia ver un texto parcial "Controls"
