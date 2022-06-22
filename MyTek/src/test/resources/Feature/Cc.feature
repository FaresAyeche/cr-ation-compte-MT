Feature: Cc.feature
  I want to use this template for my feature file

  Scenario Outline: Tester la creation de compte
    Given Navigateur ouvert
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte avec <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>

    Examples: 
      | prenom | nom | Email           | MDP   | Confirmation_MDP |
      |        | Ben | cvR869/@gmail.com  | fares | fares            |
      | ddd123 | Ben | cvF869/@gmail.com  | fares | fares            |
      |    123 | Ben | cv8F69R/@gmail.com | fares | fares            |
      |    AZER |AZER | cv8FR69/@gmail.com | fares | fares            |
