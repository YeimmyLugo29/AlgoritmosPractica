package com.yeimmy.algoritmos



fun main(){
    //condicional1()
    //condicional2()
    //condicional3()
    //condicional4()
    //condicional5()l
    //condicional6()

}

fun condicional1(){
    print("Ingrese la cantidad de llantas a comprar: ")
    var cantidad = readln().toInt()
    if (cantidad < 5){
        val cantMenor = cantidad * 200000
        println("El total de su compra es de $$cantMenor")
    } else{
        val cantMayor = cantidad * 180000
        println("El total de su compra es de $$cantMayor")
    }
}

fun condicional2(){
    print("Mi pequeño trululu ingrese el valor de las camisas: ")
    var camisas = readln().toInt()
    print("Ingrese la cantidad de camisas a comprar: ")
    var cantidad = readln().toInt()
    val valorCompra = camisas * cantidad
    if (cantidad >= 3){
        val descuento = valorCompra * 0.20
        val total: Int = valorCompra - descuento.toInt()
        print("Respecto a la cantidad de camisas que compro $cantidad, se aplicara el 20% de descuento, por lo tanto el total de su compra es $$total")
    }else{
        val descuentoMin = valorCompra * 0.10
        val totalMin: Int = valorCompra - descuentoMin.toInt()
        print("Respecto a la cantidad de camisas que compro $cantidad, se aplicara el 10% de descuento, por lo tanto el total de su compra es $$totalMin")
    }

}

fun condicional3(){
    print("Ingresa el valor de tu compra: ")
    var compra = readln().toInt()
    print("Ingresa el numero de la balota que sacaste: ")
    var balota = readln().toInt()
    if (balota <= 50){
        val descuentoMin = compra * 0.15
        val totalMin = compra - descuentoMin.toInt()
        print("la balota que escogiste es $balota por lo tanto tienes un descuento del 15%, se descontaran ${descuentoMin.toInt()} y tu compra queda con un total de $$totalMin pesos")
    }else{
        val descuentoMax = compra * 0.20
        val totalMax = compra - descuentoMax.toInt()
        print("la balota que escogiste es $balota por lo tanto tienes un descuento del 20%, se descontaran ${descuentoMax.toInt()} y tu compra queda con un total de $$totalMax pesos")
    }
}

fun condicional4(){
    print("Ingrese el monto de su poliza de seguro: ")
    var poliza = readln().toInt()
    if (poliza < 50000){
        val cuotaMax = poliza * 0.03
        print("El valor de su cuota de seguro es de $${cuotaMax.toInt()} pesos")
    }else{
        val cuotaMin = poliza * 0.02
        print("El valor de su cuota de seguro es de $${cuotaMin.toInt()} pesos")
    }
}

fun condicional5(){
     print("Ingrese el numero de materias que cursara: ")
    var cantidadMaterias = readln().toInt()
    print("Ingrese el valor de las materias: ")
    var valorMateria = readln().toInt()
    print("Ingrese el promedio obtenido: ")
    var promedio = readln().toDouble()
    var matricula = valorMateria * cantidadMaterias
    if (promedio >= 4.5){
        var descuentoMatricula = matricula * 0.3
        var totalMatrMax = matricula - descuentoMatricula
        print("Su promedio es $promedio, po lo tanto tiene 30% de descuento y su total es de $${totalMatrMax.toInt()} pesos")
    }else{
        var MatriculaIva = matricula * 0.1
        var totalMatricula = matricula + MatriculaIva
        print("Su promedio es $promedio, por lo tanto pagara la matricula completa y se le adicionara el 10% de IVA, el total de su matricula es de $${totalMatricula.toInt()} pesos")
    }
}

fun condicional6(){
    print("Ingrese el monto de su salario: ")
    var salario = readln().toInt()
    print("Ingrese el costo de la casa que quiere comprar: ")
    var costoCasa = readln().toInt()
    if (salario <= 690000){
        val cuotaInicial =  costoCasa * 0.15
        val cuotaMensual = costoCasa / 120
        print("Su cuota inicial es del 15% de costo de la vivienda \n" +
                "Cuota inicial: $${cuotaInicial.toInt()} pesos \n" +
                "y el resto del pago se difiere a 10 años (120 Cuotas) por lo tanto mensualmente tendra que pagar un valor de $$cuotaMensual pesos")
    }else{
        val cuotaInicial30 = costoCasa * 0.30
        val cuotaMensual30 = costoCasa / 84
        print("Su cuota inicial es del 30% de costo de la vivienda \n" +
                "Cuota inicial: $${cuotaInicial30.toInt()} \n" +
                "y el resto de pago se difiere a 7 años (84 Cuotas) por lo tanto menusalmente tendra que pagar un valor de $$cuotaMensual30 pesos")
    }
}