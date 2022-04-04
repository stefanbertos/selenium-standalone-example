# issue with not displaying screenshots for not first tests in Scenario outline: https://github.com/cucumber/common/issues/1195
Feature: Navigation

  @navigation
  Scenario: Navigation on Angular app
    Given I am on the Angular app Page
    When I click on the Blog link
    Then I should be redirected to Blog page