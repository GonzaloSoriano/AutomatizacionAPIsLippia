Feature: Como usuario de CatApi quiero ingresar un ID para obtener la imagen correspondiente

  @Smoke @CatApi @Images @Fail
    Scenario Outline: Obtiene un breed de imagen
    When realizo una peticion '<operation>' a '<entity>' al endpoint de categorias '<request>'
    Then obtengo el status code '<statusCode>'

    Examples:
      | request               | statusCode | operation | entity     |
      | request/rq_images     | 404        | GET       | BREED      |