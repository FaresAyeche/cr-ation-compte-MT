Feature: Cc.feature
  I want to use this template for my feature file

  Scenario Outline: Tester la creation de compte
    Given Navigateur ouvert
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte avec <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>

    Examples: 
      | prenom    | nom       | Email              | MDP         | Confirmation_MDP |
      |           | ayeche    | farest1@gmail.com  | faresfares2 | faresfares2      |
      | fares 123 | ayeche    | farest2@gmail.com  | faresfares2 | faresfares2      |
      |       123 | ayeche    | farest3@gmail.com  | faresfares2 | faresfares2      |
      | fares     |           | farest4@gmail.com  | faresfares2 | faresfares2      |
      | fares     | ayeche123 | farest5@gmail.com  | faresfares2 | faresfares2      |
      | fares     |       123 | farest6@gmail.com  | faresfares2 | faresfares2      |
      | fares     | ayeche    |                    | faresfares2 | faresfares2      |
      | fares     | ayeche    | farest7@gmail      | faresfares2 | faresfares2      |
      | fares     | ayeche    | farest9@gmail.com  | faresfares2 | faresfares2      |
      | fares     | ayeche    | farest10@gmail.com |             | faresfares2      |
      | fares     | ayeche    | farest10@gmail.com | fares       | fares            |
