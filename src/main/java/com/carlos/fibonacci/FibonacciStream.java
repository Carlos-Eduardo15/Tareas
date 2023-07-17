package com.carlos.fibonacci;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        System.out.println("Fibonacci serires");

        int num1 = 0, num2 = 1, limit = 15;
        for (int i = 0; i < limit; i++) {
            System.out.println(num1 + "");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        System.out.println(" ");
        System.out.println("Fibonacci Stream");

        //convertir esto de formadeclarativas
        //convertirlo a stream

        //veces con las que trabjaremos
        int n = 15;

        List<Integer> fibonacci = streamFibonacci(n);

        // Imprimir la secuencia de Fibonacci
        fibonacci.forEach(System.out::println);
    }

    private static List<Integer> streamFibonacci(int n) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(n)//limitamos  a la cantidad de n's el proceso
                .map(i -> i[0])//guarda el proceso del [0]
                .collect(Collectors.toList());//guardamos a la lista los resultados que obtengamos
    }
}

