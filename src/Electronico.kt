class Electronico(Codigo_Producto:Int,Nombre_Producto:String
                  ,Cantidad_Producto:Int,Precio_Producto:Double, var Garantia_Producto: Int):Producto(Codigo_Producto, Nombre_Producto, Cantidad_Producto, Precio_Producto){
    override fun Mostrar_Informacion() {
        super.Mostrar_Informacion()
        println("El producto tiene una garantia de $Garantia_Producto meses.")
    }


}