Feature: iniciar sesion en la pagina web https://www.saucedemo.com/

  Scenario: el usuario debe poder iniciar sesion en la pagina saucedemo con credenciales correctas
    Given que el usuario ingresa a "https://www.saucedemo.com/"
    When ingresa el usuario "standard_user"
    And ingresa contraseña "secret_sauce"
    And hace click en login
    Then podrá acceder a la pagina


