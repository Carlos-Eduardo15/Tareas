package com.carlos.cadena;

import java.util.stream.Collectors;

public class Declarative {
    public static void main(String[] args) {
        String cadena = "Hola, mundo! v 1.0";

        String cadenaInvertida = new StringBuilder(cadena)
                .reverse()//invierte la cadena
                .chars()//leemos los caracteres uno por uno como un tipo entero
                //la explicacion de este ira en dos partes
                //maptoobj leera el caracter como tipo entero existente que se dividio en el punto anterior
                //c -> String.valueOf((char) c) esto se engargara de transformar
                //los caracteres tipo entero a tipo String para imprimirlos asi
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());//guardamostodo lo que salio de maptoobj

        System.out.println(cadenaInvertida);//imprimios el resultado de l cadena invertida.
    }
}
