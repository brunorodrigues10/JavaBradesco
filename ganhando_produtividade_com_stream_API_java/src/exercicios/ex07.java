package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ex07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct().sorted((a,b) -> b - a)
                .skip(1).findFirst();

        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}

//distinct() - Remove valores duplicados para garantir que o maior e o segundo maior sejam diferentes.
// sorted((a, b) -> b - a) - Ordena a lista em ordem decrescente (do maior para o menor).
// skip(1) - Pula o primeiro elemento (o maior número).
// findFirst() - Obtém o primeiro número restante (ou seja, o segundo maior número).
// Optional<Integer> - Lida com a possibilidade de a lista não ter um segundo número maior.