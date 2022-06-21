Feature: Cc.feature
  I want to use this template for my feature file

  Scenario Outline: Tester la creation de compte
    Given Navigateur ouvert
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte

    Examples: 
      | prenom   | nom       | Email           | MDP        | Confirmation_MDP |
      | fares  | Ben dhaya | AAAA@yahoo.com     |dedde555| 22080023Ah       |
   