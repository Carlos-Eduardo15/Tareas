package com.carlos.factorial;

import java.util.stream.IntStream;

public class Declarative {
    public static void main(String[] args) {
        int nVeces = 7; // El número del cual queremos calcular el factorial

        int factorial = IntStream.rangeClosed(1, nVeces)
                //enlistamos numeros desde el 1 a la cantidad de veces, en este caso 7
                .reduce(1, (a, b) -> a * b);
                //con el reduce combinamos los elementos de la lista en un resultado
                //iniciamos con 1 y siguiendole una funcion lambda
                //la cual multiplicara el valor de a * b
                //a siendo el numero que esta guardado y el segundo siendo
                //el que sigue en la multiplicacion
                //imprimimos el resultado  del factorial
        System.out.println("El factorial de " + nVeces + " es: " + factorial);
    }
}
