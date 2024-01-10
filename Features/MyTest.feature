Feature: Realizacion de casos ingresando nombre de usuario y contraseña

Scenario: Verificacion de ingreso de sesion
Given abrir navegador
When ingresar nombre de usuario "user" y contrasenha "user"
Then iniciar sesion

Scenario: Verificacion de ingreso de sesion
Given abrir navegador
When ingresar nombre de usuario "user" y contrasenha "qwerty"
Then iniciar sesion

Scenario: Verificacion de ingreso de sesion
Given abrir navegador
When ingresar nombre de usuario "" y contrasenha ""
Then iniciar sesion