# language:en

  Feature: Acessar links do Menu da Página Home

  Background:
    Given o usuário esta na pagina Home
    And o Menu Home aberto

  Scenario: Acessa blogs e colunas
    When acessa blogs e colunas
    Then e direcionado a "Blogs e Colunas"



