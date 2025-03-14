

fun main() {
    val Productos = mutableListOf<Producto>()
    var Opcion = 0

    while (Opcion != 9) {
        println("Menu De la tienda")
        println("1) Crear Producto")
        println("2) Crear Producto electronica")
        println("3) Vender producto")
        println("4) Reponer Stock")
        println("5) Aplicar descuento")
        println("6) Aumentar precio")
        println("7) Calcular valor total")
        println("8) Mostrar informacion de los productos")
        println("9) Eliminar productos por codigo")
        println("0) Salir del programa")
        println("Por favor seleccione una opcion")

        Opcion = readLine()?.toIntOrNull() ?: 0

        if (Opcion == 1) {
            println("Ingrese el codigo del producto: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            println("Ingrese el nombre del producto: ")
            val Nombre_Producto = readLine().orEmpty()
            println("Ingrese la cantidad del producto: ")
            val Cantidad_Producto = readLine()?.toIntOrNull() ?: 0
            println("Ingrese el precio del producto: $")
            val Precio_Producto = readLine()?.toDoubleOrNull() ?: 0.0
            Productos.add(Producto(Codigo_Producto, Nombre_Producto, Cantidad_Producto, Precio_Producto))
            println("El producto se ha creado correctamente :D.")
        } else if (Opcion == 2) {
            println("Ingrese el codigo del producto: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            println("Ingrese el nombre del producto: ")
            val Nombre_Producto = readLine().orEmpty()
            println("Ingrese la cantidad del producto: ")
            val Cantidad_Producto = readLine()?.toIntOrNull() ?: 0
            println("Ingrese el precio del producto: $")
            val Precio_Producto = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese la garantia del producto")
            val Garantia_Producto = readLine()?.toIntOrNull() ?: 0
            Productos.add(
                Electronico(
                    Codigo_Producto,
                    Nombre_Producto,
                    Cantidad_Producto,
                    Precio_Producto,
                    Garantia_Producto
                )
            )
            println("El producto se ha creado correctamente :D.")
        } else if (Opcion == 3) {
            print("Ingrese código del producto a vender: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            val Producto = Productos.find { it.Codigo_Producto == Codigo_Producto }
            if (Producto != null) {
                print("Ingrese cantidad a vender: ")
                val cantidad = readLine()?.toIntOrNull() ?: 0
                Producto.Vender_Producto(cantidad)
            } else {
                println("Producto no encontrado.")
            }
        } else if (Opcion == 4) {
            print("Ingrese código del producto a reponer: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            val Producto = Productos.find { it.Codigo_Producto == Codigo_Producto }
            if (Producto != null) {
                print("Ingrese cantidad a reponer: ")
                val cantidad = readLine()?.toIntOrNull() ?: 0
                Producto.Reponer_Stock(cantidad)
            } else {
                println("Producto no encontrado.")
            }
        } else if (Opcion == 5) {
            print("Ingrese código del producto para aplicar descuento: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            Productos.find { it.Codigo_Producto == Codigo_Producto }?.Realizar_Descuento()
                ?: println("Producto no encontrado.")
        } else if (Opcion == 6) {
            print("Ingrese código del producto para aumentar el precio: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            Productos.find { it.Codigo_Producto == Codigo_Producto }?.Aumentar_Precio()
                ?: println("Producto no encontrado.")
        } else if (Opcion == 7) {
            val totalInventario = Productos.sumOf { it.Calcular_Valor_Total_Inventario() }
            println("El valor total del inventario es: $$totalInventario")
        } else if (Opcion == 8) {
            Productos.forEach { it.Mostrar_Informacion() }
        } else if (Opcion == 9) {
            print("Ingrese código del producto a eliminar: ")
            val Codigo_Producto = readLine()?.toIntOrNull() ?: 0
            if (Productos.removeIf { it.Codigo_Producto == Codigo_Producto }) {
                println("Producto eliminado correctamente.")
            } else {
                println("Producto no encontrado.")
            }
        }else if (Opcion == 0) {
                println("Saliendo del programa...")
            } else {
                println("Opción inválida. Intente nuevamente.")
            }
    }
}



