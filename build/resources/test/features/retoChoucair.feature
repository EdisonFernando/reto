#Autor: Edison Fernando Aza Casanova
  @stories
  Feature: world of testers
    As a user, I want to join in the world of testers for learn new skills
  @scenario1
  Scenario: join to the largest community of testers in the world
    Given than Estefania wants to join and she talks about
    | fName | lName | emailA | dM | dD | dY |
    | Edison Fernando | Aza Casanova | ediferaza90@gmail.com | 7 | 13 | 1990 |
    When click on next, she need to add her address
    | city | pCode | country |
    | Medellín, Medellin, Antioquia, Colombia | 57 | Colombia |
    When click on next devices, she needs to talk about her devices
    | pc | version | language | movil | model | os |
    | Windows | 10 | Spanish  | Samsung | Galaxy A | android |
    When click on the last step, she needs to create the password and accept the code of conduct and privacy
    | password | cPassword |
    | fer_90Utest | fer_90Utest |
    Then she go to click on complete setup and finish


