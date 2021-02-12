@stories
  Feature: Academy Choucair
    as a user,I want to learn how to automate in screamplay at the choucair Academy with the automation course
  @scenario1
  Scenario: Search for automation course
    Given than Danna wants to learn automation at the academy choucair
      |strUser|strPassword|
      |1085331400|Choucair2021*|
    When she search for the course on the choucair academy platform
      |strCourse         |
      |Patrones de Automatizacion|
    Then she finds the course called resources
      |strCourse         |
      |Patrones de Automatizacion|
