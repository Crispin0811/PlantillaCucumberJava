Feature: Login to Contopsa Web Site
  @primerTag
  Scenario: Login con datos correctos
    Given El usuario esta en login
    #Then El usuario pone la crecial para usurio
    #And El usuario pone la crecial para su contrasenia
    #And click en el boton Ingresar
    Then Se muestra la pagina principal y se verifica el nombre de usuario

  #Scenario Outline: Probando la parametrizacion
   # Given El usuario esta en login
    #Then El usuario pone la crecial para <usurio>
    #And El usuario pone la crecial para su <contrasenia>
    #And click en el boton Ingresar
    #Then Se muestra la pagina principal y se verifica el nombre de usuario

    #Examples:
     # | usuario | contrasenia |
      #| user1   | pass1       |
      #| user2   | pass3     |

