package com.yeimmy.algoritmos

import kotlin.math.*

fun main () {
    //algoritmo1()
    //algoritmo2()
    //algoritmo3()
    //algoritmo4()
    //algoritmo5()
    //algoritmo6()
    //algoritmo7()
    //algoritmo8()
}


fun algoritmo1 (){
    print("Ingrese la base del rectangulo:")
    val base = readln().toInt()
    print("Ingrese la altura del rectangulo")
    val altura = readln().toInt()
    val area = base * altura
    val perimetro = base*2 + altura*2
    println("El area de su rectangulo es $area cm y su perimetro es de $perimetro cm")
}

fun algoritmo2 (){
    print("Ingrese la base de su triangulo:")
    val base = readln().toInt()
    print("Ingrese la altura de su triangulo:")
    val altura = readln().toInt()
    val area = base * altura / 2
    println("El area de su triangulo es de $area cm")
}

fun algoritmo3 (){
    print("Ingrese el valor de X: ")
    val x = readln().toInt()
    print("Ingrese el valor de Y: ")
    val y = readln().toInt()
    val suma = x + y
    val multiplicacion = x * y
    val division = x / y
    val potencia = x.toDouble().pow(y.toDouble())
    println("")
    println("La suma de X y Y es: $suma")
    println("La multiplicación de X y Y es: $multiplicacion")
    println("La division de X y Y es: $division")
    println("La potencia de X y Y es: ${potencia.toInt()}")

}

fun algoritmo4 (){
    print("Ingrese los pesos para realizar el cambio: ")
    val pesos:Double = readln().toDouble()
    val resultado = pesos * 0.00024
    print("El valor en dollars del valor en pesos que ingresaste es de $$resultado dolares")

}

fun algoritmo5 (){
    print("Ingresa tu salario: ")
    val salarioAnt = readln().toInt()
    val aumento = salarioAnt * 0.25
    val salarioFin = salarioAnt + aumento
    println("Tu antiguo salario era de $$salarioAnt, con el aumento del 25% tu nuevo salario queda en $${salarioFin.toInt()} pesos")
}

fun algoritmo6 (){
    print("Ingrese la cantidad de mujeres que hay en el curso: ")
    val mujeres = readln().toInt()
    print("Ingrese la cantidad de Hombres que hay en el curso: ")
    val hombres = readln().toInt()
    val totalEst = mujeres + hombres
    val porcentajeMuj = mujeres * 100 / totalEst
    val porcentajeHom = hombres * 100 / totalEst
    print("Para el total del curso que es $totalEst estudiantes, el porcentaje de mujeres es $porcentajeMuj% y el porcentaje de hombres es $porcentajeHom%")
}

fun algoritmo7 (){
    print("Ingrese el total de su compra: ")
    val compra = readln().toInt()
    val descuento = compra * 0.15
    val total = compra - descuento
    print("Su compra fue de $$compra, con el 15% de descuento el total de su compra es $${total.toInt()} pesos")
}

fun algoritmo8 (){
    print("Ingresa el valor del producto que compraste: ")
    val valorCompra = readln().toInt()
    val ganancia = valorCompra * 0.30
    val valorFinal = valorCompra + ganancia
    print("Si compraste un producto por $$valorCompra, para venderlo y obtener el 30% de la ganancia debes venderlo a $${valorFinal.toInt()} pesos")
}