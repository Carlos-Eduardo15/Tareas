package com.carlos.cadena;

public class Imperative {
    public static void main(String[] args) {
        //este problema lo resolvere con el Stringbuilder el cual segun investigue
        //tiene la capacidad de ser un string mutable asi como metodos propios
        //append(), insert(), delete(), replace() y reverse()
        //permitiendo agregar, insertar, eliminar, reemplazar o invertir
        String cadena = "Hola mundo! v 1.0";
        //guardamos en la variable cadenainvertida el valor de cadena convirtiendolo en stringbuilder
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        //usamos el metodo para invertir la cadena
        cadenaInvertida.reverse();
        //imprimimos la cadenaInvertida
        System.out.println(cadenaInvertida);

        //Ahora lo haremos con otra tecnica, usando el .charAt
        //guardamos las variable que necesitaremos
        String cadena2 = "Hola mundo! v 2.0";
        String cadenaInvertida2 = "";

        //en terminos de optimizacion no sera la mejor opcion
        for(int i = cadena2.length()-1; i >= 0; i--){
            cadenaInvertida2 += cadena2.charAt(i);
        }
        //lo que hicimos fue guardar caracter por caracter leyendo este con unas posicion
        //decremental el cual es definido y modificado por la misma instruccion del cliclo for
        //ahora solo queda imprimir el resultado
        System.out.println(cadenaInvertida2);
    }
}
