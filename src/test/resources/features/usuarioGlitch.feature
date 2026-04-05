Feature: iniciar sesion en la pagina web https://www.saucedemo.com/ con demora en el inicio de sesion
  Background: usuario con demora de cargas en la pagina
    Given que el usuario ingresa a "https://www.saucedemo.com/"
    When ingresa el usuario "performance_glitch_user"
    And ingresa contraseña "secret_sauce"
    And hace click en login

    @usuarioGlitch
    Scenario: un usuario con demora de cargas en la pagina desea iniciar sesion
      Given que el usuario ingresa a "https://www.saucedemo.com/"
      When ingresa el usuario "performance_glitch_user"
      And ingresa contraseña "secret_sauce"
      And hace click en login
      Then podrá acceder a la pagina

     @OrdenarListaUsuarioGlitch
     Scenario: el usuario selecciona ordenar los productos según opciones del combox
       Given el usuario ordena los productos por "hilo"
       Then el primer artículo de la lista debería ser "Sauce Labs Fleece Jacket"



