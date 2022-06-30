@ins
Feature: Cc.feature
  I want to use this template for my feature file

  Scenario Outline: Tester la creation de compte
    Given Navigateur ouvert
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte avec <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>

    Examples: 
      | prenom    | nom       | Email               | MDP         | Confirmation_MDP |
      |     azer     | aez    | farest11@gmail.com  | faresfares2 | faresfares2      |
 
