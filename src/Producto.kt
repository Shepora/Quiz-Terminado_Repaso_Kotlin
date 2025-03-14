open class Producto (var Codigo_Producto: Int,val Nombre_Producto: String, var Cantidad_Producto: Int,
                     var Precio_Producto: Double)
{

    fun Vender_Producto(Cantidad_Vendida :Int){
        if (Cantidad_Vendida > Cantidad_Producto){
            println("La cantidad no esta disponible")
        }else {
            Cantidad_Producto -= Cantidad_Vendida
            println("La venta se a realizado de manera exitosa")
            }
        }
    fun Reponer_Stock(Cantidad_Nueva :Int){
        Codigo_Producto += Cantidad_Nueva
        println("El stock ha sido actualizado exitosamente")
    }
    fun Realizar_Descuento(){
        Precio_Producto *= 0.98
        println("Se ha aplicado el descuento")
    }
    fun Aumentar_Precio(){
        Precio_Producto *= 1.06
        println("El precio a aumentado")
    }
    open fun Mostrar_Informacion (){
        println("Codigo producto: $Codigo_Producto, Nombre del producto: $Nombre_Producto, Precio del producto: $Precio_Producto, Stocks: $Cantidad_Producto")
    }
    fun Calcular_Valor_Total_Inventario(): Double{
        return Precio_Producto * Cantidad_Producto
    }
}

