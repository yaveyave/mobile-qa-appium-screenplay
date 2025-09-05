@lists
Feature: Validaciones de listas en API Demos

  Scenario: Hacer scroll y validar item en la lista
    Given que Oscar abre la app
    When navega a la opcion "Views"
    And navega a la opcion "Lists"
    And navega a la opcion "05. Separators"
    And hace scroll hasta el item "Alverca"
    Then deberia ver el item exacto "Alverca"

  Scenario: Hacer scroll y validar item en la lista exacto
    Given que Oscar abre la app
    When navega a la opcion "Views"
    And navega a la opcion "Lists"
    And navega a la opcion "07. Cursor (Phones)"
    And hace scroll hasta el item "Spinner"
    Then deberia ver el item exacto "Spinner"
