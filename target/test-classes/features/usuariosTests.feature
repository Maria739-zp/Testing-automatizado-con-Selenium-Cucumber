Feature: iniciar sesion en la pagina web https://www.saucedemo.com/

@UsuarioBloqueado
Scenario: un usuario bloqueado desea ingresar a la pagina
  Given que el usuario se dirije a "https://www.saucedemo.com/"
  When coloca el usuario "locked_out_user"
  And coloca contraseña "secret_sauce"
  And hace click en boton login
  Then el sistema lanza un mensaje de error "Epic sadface: Sorry, this user has been locked out."




