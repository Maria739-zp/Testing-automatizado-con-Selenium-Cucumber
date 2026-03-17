Feature: iniciar sesion en la pagina web https://www.saucedemo.com/
  Background: Usuario logueado en la página
    Given que el usuario ingresa a "https://www.saucedemo.com/"
    And ingresa el usuario "standard_user"
    And ingresa contraseña "secret_sauce"

  @login
  Scenario: el usuario debe poder iniciar sesion en la pagina saucedemo con credenciales correctas
    Given que el usuario ingresa a "https://www.saucedemo.com/"
    When ingresa el usuario "standard_user"
    And ingresa contraseña "secret_sauce"
    And hace click en login
    Then podrá acceder a la pagina


@Carrito
Scenario: Agregar un producto específico al carrito desde el home
  Given que el usuario ya ha iniciado sesión y se encuentra en la pagina home
  When el usuario hace clic en el producto "Sauce Labs Backpack"
  And selecciona la opción "Add to cart" para ese producto
  Then el icono del carrito debe mostrar "1" unidad