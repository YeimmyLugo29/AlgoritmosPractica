package com.yeimmy.algoritmos

fun main(){
    //ejercicio1()
    ejercicio2()
}

fun ejercicio1(){
    print("Ingrese el estrato: ")
    val estrato = readln().toInt()
    print("Ingrese el sisben: ")
    val sisben = readln().toInt()
    when (estrato){
        1, 2 -> {
            if (estrato == 1 && sisben == 1){
                var oper1 = 30000 + 10000
                print("El valor del subsidio es de $30000, y del sisben es del 10000, el total a pagar es $oper1")
            }else if (estrato == 2 && sisben == 1){
                var oper2 = 20000 + 10000
                print("El valor del subsidio es de $20000, y del sisben es de $10000, el total a pagar es $oper2")
            }else if(estrato == 1 && sisben == 2){
                var oper3 = 30000 + 20000
                print("El valor del subsidio es de $30000, y del sisben es de $20000, el total a pagar es $oper3")
            }else if (estrato == 2 && sisben == 2){
                var oper4 = 20000 + 20000
                print("El valor del subsidio es de $30000, y del sisben es de $20000, el total a pagar es $oper4")
            }else{
                print("Nivel de sisben no valido")
            }
        }
        3 -> print("No aplica sisben, si aplica a subsidio y su valor es de $10000 pesos")
        4 -> print("No aplica sisben, si aplica a subsidio y su valor es de $5000 pesos")
        else -> print("No aplica sisben, ni aplica subsidio")
    }
}

fun ejercicio2(){
    print("Ingrese su categoria: ")
    var categoria = readln().toInt()
    print("Ingrese el sueldo que gana: ")
    var sueldo =  readln().toInt()
    when(categoria){
        1 -> {
            val aumento1 = (sueldo * 0.15).toInt()
            val total1 = sueldo + aumento1
            print("Su categoria es $categoria por lo tanto tendra un aumento del 15% que se aplicara a su sueldo actual $sueldo \n" +
                    "Su sueldo actual es $total1")
        }
        2 -> {
            val aumento2 = (sueldo * 0.10).toInt()
            val total2 = sueldo + aumento2
            print("Su categoria es $categoria por lo tanto tendra un aumento del 10% que se aplicara a su sueldo actual $sueldo \n" +
                    "Su sueldo actual es $total2")
        }
        3 -> {
            val aumento3 = (sueldo * 0.08).toInt()
            val total3 =  sueldo + aumento3
            print("Su categoria es $categoria por lo tanto tendra un aumento del 8% que se aplicara a su sueldo actual $sueldo \n" +
                    "Su sueldo actual es $total3")
        }
        4 -> {
            val aumento4 = (sueldo * 0.07).toInt()
            val total4 = sueldo + aumento4
            print("Su categoria es $categoria por lo tanto tendra un aumento del 7% que se aplicara a su sueldo actual $sueldo \n" +
                    "Su sueldo actual es $total4")
        }
        else -> print("Categoria no valida, ingrese de nuevo")
    }
}

fun ejercicio3(){
    
}