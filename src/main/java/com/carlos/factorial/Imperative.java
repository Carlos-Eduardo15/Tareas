package com.carlos.factorial;

public class Imperative {
    public static void main(String[] args) {
        //declaramos variables con las cuales empezaremos
        //primero el numero de veces con las que ejecutaremos el ciclo for
        //y uno donde almacenaremos el total tomando como base "1"
        int nVeces = 7;
        int total = 1;
        //un ciclo for con el cual trabajaremos la cantidad de veces que declaramos
        for (int i = 1; i <= nVeces; i++) {
            //el valor de se ira multiplicando al valor que ya existe
            //en la variable declarada "total"
            total *= i;
        }
        //imprimimos el total de la operacion factorial
        System.out.println("El factorial de " + nVeces + " es: " + total);
    }
}
