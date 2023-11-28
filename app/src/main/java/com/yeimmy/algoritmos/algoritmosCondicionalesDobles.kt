package com.yeimmy.algoritmos


fun main(){
    //cond1()
    //cond2()
    //cond3()
    //cond4()
}

fun cond1(){
    print("Ingrese el valor de A: ")
    var numeroA = readln().toInt()
    print("Ingrese el valor de B: ")
    var numeroB = readln().toInt()
    if (numeroA > numeroB){
        val resta = numeroA - numeroB
        print("$numeroA es mayor que $numeroB, por lo tanto se restan y su resultado es $resta")
    }else if (numeroA == numeroB){
        val suma = numeroA + numeroB
        print("$numeroA es igual a $numeroB, por lo tanto se suman y su resultado es $suma")
    }else if(numeroA < numeroB){
        val multiplicacion = numeroA * numeroB
        print("$numeroA es menor que $numeroB, por lo tanto se multiplican y su resultado es $multiplicacion")
    }
}

fun cond2(){
    print("Ingrese el peso en libras: ")
    var libras = readln().toInt()
    if (libras > 30){
        print("Son $libras libras, por lo tanto no se podra lavar ya que excede el peso limite")
    }else if (libras >= 22){
        print("la ropa es de $libras libras, por lo tanto su nivel de agua sera el maximo, 50 litros")
    }else if (libras >= 15){
        print("la ropa pesa $libras libras, por lo tanto su nivel de agua sera alto, 35 litros")
    }else if (libras >= 8){
        print("la ropa pesa $libras libras, por lo tanto su nivel de agua es medio, 20 litros")
    }else if (libras < 8){
        print("la ropa pesa $libras libras, por lo tanto su nivel de agua es bajo, 10 litros")
    }
}

fun cond3(){
    print("Ingresa tu edad: ")
    var edad = readln().toInt()
    if(edad >= 25){
        print("Tienes $edad, por lo tanto solo puedes ingresar a mi fiesta si traes un regalo xD")
    }else if (edad >= 15){
        print("Tienes $edad, felicidades por lo tanto puedes ingresar a mi fiesta gratis xD")
    }else if (edad < 15){
        print("Tienes $edad, lo siento no puedes ingresar a mi fiesta :(")
    }
}

fun cond4(){
    print("Ingresa el numero de computadoras que compraras: ")
    var cantidadPC = readln().toInt()
    val totalCompra = 1000000 * cantidadPC
    if (cantidadPC < 5){
        val descuento10 = (totalCompra * 0.10).toInt()
        val compraFinal10 = (totalCompra - descuento10)
        print("Estimado cliente usted compro $cantidadPC computadoras, por lo tanto su descuento es de 10%, se le descontaran $descuento10 pesos y el total de su compra final es $compraFinal10 pesos")
    }else if (cantidadPC >= 5){
        val descuento20 = (totalCompra * 0.20).toInt()
        val compraFinal20 = totalCompra - descuento20
        print("Estimado cliente usted compro $cantidadPC computadoras, por lo tanto su descuento es de 20%, se le descontaran $descuento20 pesos y el total de su compra final es $compraFinal20 pesos")
    }else if (cantidadPC >= 10){
        val descuento40 = (totalCompra * 0.40).toInt()
        val compraFinal40 = totalCompra -  descuento40
        print("Estimado cliente usted compro $cantidadPC computadoras, por lo tanto su descuento es de 40%, se le descontaran $descuento40 pesos y el total de su compra final es $compraFinal40 pesos")
    }
}

