package com.carlos.fizzBuzz;
import java.util.stream.IntStream;

public class Declarative {
    public static void main(String[] args) {
        //creamos un conjunto de enteros desde el 1 al 45
        IntStream.rangeClosed(1, 45)
                .mapToObj(n -> {//con el maptoobj vemos todos los objetos
                    //y con la funcion lambda usamos ese numero para trabajar
                    //en una variable guardamos el numero teniendo condiciones
                    //si es cinco, escribira fizz y si es 7 sera buzz
                    String str = (n % 5 == 0 ? n+" fizz" : "") + (n % 7 == 0 ? n+" buzz" : "");
                    //regresamos con la condicion de si esta vacia, regresara el objeto como entero
                    //y si no, regresara el valor de str
                    return str.isEmpty() ? Integer.toString(n) : str;
                })
                //con esto imprimimos cada linea
                .forEach(System.out::println);
    }
}



