$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/1-AcessarLinksDoMenu.feature");
formatter.feature({
  "name": "Acessar links do Menu da Página Home",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "o usuário esta na pagina Home",
  "keyword": "Given "
});
formatter.match({
  "location": "br.com.g1.automated.test.step.AcessarLinksDoMenuStep.oUsuárioEstaNaPaginaHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o Menu Home aberto",
  "keyword": "And "
});
formatter.match({
  "location": "br.com.g1.automated.test.step.AcessarLinksDoMenuStep.oMenuHomeAberto()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Acessa blogs e colunas",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "acessa blogs e colunas",
  "keyword": "When "
});
formatter.match({
  "location": "br.com.g1.automated.test.step.AcessarLinksDoMenuStep.acessaBlogsEColunas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "e direcionado a \"Blogs e Colunas\"",
  "keyword": "Then "
});
formatter.match({
  "location": "br.com.g1.automated.test.step.AcessarLinksDoMenuStep.eDirecionadoA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});