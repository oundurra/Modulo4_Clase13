fun main(parametro: Array<String>) {
    //Clase 13

    /*
    print("Ingrese un numero: ")
    when(readLine()!!.toInt()) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        else -> println("Ninguno")
    }
    */
    /*
    // When con rango de numeros
    print("Ingrese un numero: ")
    when(readLine()!!.length) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        else -> println("Mas de 5")
    }
    */
    /*
    // When con rango de letras
    print("Ingrese una letra: ")
    when(readLine()!!.toUpperCase().single()) {
        in 'A'..'F' -> println("Uno")
        in 'G'..'O' -> println("Dos")
        else -> println("Otro")
    }*/

    //Clase 14: Programacion funcional
    /*
    sumaNumeros()
    despedida()
    */

    repiteSuma(5);

}

fun sumaNumeros() {
    print("Ingrese un numero: ")
    var numa = readLine()!!.toInt()
    print("Ingrese otro numero: ")
    var numb = readLine()!!.toInt()
    muestraSuma(numa, numb)
}

fun muestraSuma(pnuma:Int, pnumb: Int) {
    println("La suma de los numeros es: ${pnuma+pnumb}")
}

fun despedida() {
    println("El programa ha terminado")
}

fun muestraLinea() {
    println("--------------------------")
}

fun repiteSuma(cantidad:Int) {
    for(i in 1..cantidad) {
        sumaNumeros()
        muestraLinea()
    }
}