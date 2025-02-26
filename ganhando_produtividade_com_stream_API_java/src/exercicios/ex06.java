package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ex06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue)
                .average();

        System.out.println("Média dos números maiores que 5 : " + media.getAsDouble());
    }
}

// filter() - Filtra apenas os números maiores que 5.
//mapToInt(Integer::intValue) - Converte a lista para um IntStream para permitir operações matemáticas.
// average() - Calcula a média dos valores filtrados.
// OptionalDouble - Lida com o caso de a lista não ter números maiores que 5.
