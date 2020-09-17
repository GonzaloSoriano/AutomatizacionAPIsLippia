Feature: Como usuario de CatApi quiero obtener una lista de categorias para mostrarlas por pantalla

  @Smoke @Success @Categories @CatApi
    Scenario Outline: Obtengo una lista de categorias
    When realizo una peticion '<operation>' a '<entity>' al endpoint de categorias '<request>'
    Then obtengo el status code '<statusCode>'
    And los datos son correctos

    Examples:
      | request                   | statusCode | operation | entity     |
      | request/rq_categories     | 200        | GET       | CATEGORY   |