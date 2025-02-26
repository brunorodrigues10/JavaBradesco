package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ex08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream().map(n -> String.valueOf(n).chars()
                .map(Character::getNumericValue).sum()).mapToInt(Integer::intValue).sum();

        System.out.println("Soma de todos os dígitos: " + somaDosDigitos);
    }
}
