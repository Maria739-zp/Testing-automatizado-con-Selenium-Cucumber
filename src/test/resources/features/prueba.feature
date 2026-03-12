Feature: Login en la página SauceDemo

Scenario ingresar a la pagina con credenciales correctas

  Given el usuario desea ingresar a "https://www.saucedemo.com/"
  When usuario coloca el nombre de usuario "standard_user"
  And introduce su contraseña "secret_sauce"
  And presionar el botón login
  Then el usuario podrá ingresar a la pagina