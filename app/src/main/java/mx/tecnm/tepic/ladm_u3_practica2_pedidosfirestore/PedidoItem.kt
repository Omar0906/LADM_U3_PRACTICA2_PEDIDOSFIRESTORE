package mx.tecnm.tepic.ladm_u3_practica2_pedidosfirestore

class PedidoItem{
    var descripcion:String
    var precio:Float
    var cantidad:Int
    var total:Float
    constructor(descripcion:String,precio:Float,cantidad:Int){
        this.descripcion = descripcion
        this.precio = precio
        this.cantidad = cantidad
        this.total = precio*cantidad
    }
}