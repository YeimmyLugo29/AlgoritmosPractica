package com.yeimmy.algoritmos


fun main(){
    //cond1()
    //cond2()
    //cond3()
    //cond4()
    //cond5()
    //cond6()
    //super cond7()
    cond8()
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
    }else if (cantidadPC >= 5 && cantidadPC <10){
        val descuento20 = (totalCompra * 0.20).toInt()
        val compraFinal20 = totalCompra - descuento20
        print("Estimado cliente usted compro $cantidadPC computadoras, por lo tanto su descuento es de 20%, se le descontaran $descuento20 pesos y el total de su compra final es $compraFinal20 pesos")
    }else if (cantidadPC >= 10){
        val descuento40 = (totalCompra * 0.40).toInt()
        val compraFinal40 = totalCompra -  descuento40
        print("Estimado cliente usted compro $cantidadPC computadoras, por lo tanto su descuento es de 40%, se le descontaran $descuento40 pesos y el total de su compra final es $compraFinal40 pesos")
    }
}

fun cond5(){
    print("Ingresa tu edad: ")
    var edad = readln().toInt()
    print("Ingresa el nivel de tu SISBEN: ")
    var sisben = readln().toInt()
    if(edad > 18 && sisben == 1 ){
        val descuento40 = (350000 * 0.40).toInt()
        val total40 = 350000 - descuento40
        print("Su libreta cuesta $350000, al ser mayor de 18 años se hara descuento de 40%, se descontaran $$descuento40, y su valor total a pagar sera de $$total40 pesos")
    }else if (edad > 18 && sisben == 2 ){
        val descuento30 = (350000 * 0.30).toInt()
        val total30 = 350000 - descuento30
        print("Su libreta cuesta $350000, al ser mayor de 18 años se hara descuento de 30%, se descontaran $$descuento30, y su valor total a pagar sera de $$total30 pesos")
    }else if (edad > 18 && sisben == 3 ){
        val descuento15 = (350000 * 0.15).toInt()
        val total15 = 350000 - descuento15
        print("Su libreta cuesta 350000, al ser mayor de 18 años se hara descuento de 15%, se descontaran $$descuento15, y su valor a pagar sera de $$total15 pesos")
    }else if (edad == 18 && sisben == 1){
        val descuento60 = (200000 * 0.60).toInt()
        val total60 = 200000 - descuento60
        print("Su libreta cuesta 200000, al tener 18 años se hara descuento de 60%, se descontaran $$descuento60, y su valor a pagar sera de $$total60 pesos")
    }else if (edad == 18 && sisben == 2){
        val descuentoMedio = (200000 * 0.30).toInt()
        val totalMedio = 200000 - descuentoMedio
        print("Su libreta cuesta 200000, al tener 18 años se hara descuento de 30%, se descontaran $$descuentoMedio, y su valor a pagar sera de $$totalMedio pesos")
    }else if (edad == 18 && sisben == 3){
        val descuento20 = (200000 * 0.20).toInt()
        val total20 = 200000 - descuento20
        print("Su libreta cuesta 200000, al tener 18 años se hara descuento de 20%, se descontaran $$descuento20, y su valor a pagar sera de $$total20 pesos")
    }else if(sisben > 3){
        print("No tendras descuento en tu libreta")
    }
}

fun cond6(){
    print("Ingrese primer numero: ")
    var numero1 = readln().toInt()
    print("Ingrese el segundo numero: ")
    var numero2 = readln().toInt()
    print("Ingrese el tercer numero: ")
    var numero3 = readln().toInt()
    if (numero1 > numero2 && numero1 > numero3){
        print("El numero mayor es $numero1")
    }else if (numero2 > numero1 && numero2 > numero3){
        print("El numero mayor es $numero2")
    }else if(numero3 > numero1 && numero3 > numero2){
        print("El numero mayor es $numero3")
    }
}

fun cond7(){
    print("Ingrese el primer numero: ")
    var numero1 = readln().toInt()
    print("Ingrese el segundo numero: ")
    var numero2 = readln().toInt()
    print("Ingrese el tercer numero: ")
    var numero3 = readln().toInt()
    if(numero1 < numero2 && numero1 < numero3){
        print("El numero menor es $numero1")
    }else if (numero2 < numero1 && numero2 < numero3){
        print("El numero menor es $numero2")
    }else {
        print("El numero menor es $numero3")
    }
}

fun cond8(){
    print("Ingresa el primer numero: ")
    var num1 = readln().toInt()
    print("Ingresa el segundo numero: ")
    var num2 = readln().toInt()
    print("Ingresa el tercer numero: ")
    var num3 = readln().toInt()
    if(num1 > num2 && num2 > num3){
        print("El numero mayor es $num1 \n" +
                "El numero medio es $num2 \n" +
                "El numero menor es $num3")
    }else if(num2 > num1 && num1 > num3){
        print("El numero mayor es $num2 \n" +
                "El numero medio es $num1 \n" +
                "El numero menor es $num3")
    }else if (num3 > num1 && num1 > num2 ){
        print("El numero mayor es $num3 \n" +
                "El numero medio es $num1 \n" +
                "El numero menor es $num2")
    }else if (num1 > num3 && num3 > num2){
        print("El  numero mayor es $num1 \n" +
                "El numero medio es $num3 \n" +
                "El numero menor es $num2")
    }else if(num3 > num2 && num2 > num1){
        print("El numero mayor es $num3 \n" +
                "El numero medio es $num2 \n" +
                "El numero menor es $num1")
    }else{
        print("El numero mayor es $num2 \n" +
                "El numero medio es $num3 \n" +
                "El numero menor es $num1")
    }
}


