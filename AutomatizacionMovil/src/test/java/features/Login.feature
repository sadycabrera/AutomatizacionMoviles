Feature: Navegacion
  
  Scenario: Navegacion
  Given Abrir el app
  When Se accede con el usuario "admin" y con la clave "admin"
  And Se hace Scroll hacia abajo hasta encontrar la opcion "Carousel"
  And Hace tap en "Caroucel"
  Then Valida que el primer elemento mostrado es "1"
 
