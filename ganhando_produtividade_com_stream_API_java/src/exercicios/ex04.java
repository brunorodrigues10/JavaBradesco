package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().sorted().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(numerosPares);
    }
}


    // filter() - Filtra apenas os números pares
    // collect(Collectors.toList()) - Converte o resultado novamente para uma lista.
