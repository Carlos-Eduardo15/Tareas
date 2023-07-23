package com.carlos.fizzBuzz;

public class Imperative {
    public static void main(String[] args) {
        //Intrucciones:
        //decimos un numero y luego el que le sigue y asi consecutivamente
        //-si el numero es multiplo de 5 decimos fizz
        //-si es multiplo de 7 decimos buzz
        //-si es multiplo de ambos decimos fizzbuzz

        //ejemplo con for, if e if else
        System.out.println("Para empezar le pusimos un limite de 45 numeros para que trabaje del 1 al 45");
        for(int num = 1; num < 46; num++){
            //si es multplo de 5
            if((num % 5 == 0)&&(num % 7 != 0)){
                System.out.println(num+" fizz");
            } else if ((num % 5 != 0)&&(num % 7 == 0)) {//si es multiplo de 7
                System.out.println(num+" buzz");
            } else if ((num % 5 == 0)&&(num % 7 == 0)) {//si es multiplo de 5 y 7
                System.out.println(num+" fizzbuzz");
            }else {//no cumple las condiciones
                System.out.println(num);
            }
        }



    }
}
