package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        System.out.println(numerosMaiorQueDez);
    }
}

// anyMatch(n -> n > 10) - Retorna true se pelo menos um número da lista for maior que 10

