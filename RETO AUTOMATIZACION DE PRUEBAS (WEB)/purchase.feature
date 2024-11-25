Feature: Comprar productos en la tienda DemoBlaze

Scenario Outline: Comprar producto de una categoría específica
    Given que el usuario accede a la página principal
    When selecciona la categoría "<categoría>" y el producto "<producto>"
    And agrega el producto al carrito
    Then la compra debe ser registrada exitosamente

Examples:
    | categoría  | producto    |
    | Phones     | Samsung S6  |
    | Laptops    | Sony vaio i5 |