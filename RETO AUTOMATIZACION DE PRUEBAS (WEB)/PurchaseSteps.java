@Given("que el usuario accede a la página principal")
public void accederPaginaPrincipal() {
    open("https://www.demoblaze.com/#");
}

@When("selecciona la categoría {string} y el producto {string}")
public void seleccionarCategoriaYProducto(String categoria, String producto) {
    // Código para seleccionar categoría y producto
}

@And("agrega el producto al carrito")
public void agregarProductoCarrito() {
    // Código para añadir al carrito
}

@Then("la compra debe ser registrada exitosamente")
public void verificarCompra() {
    // Código para verificar éxito
}