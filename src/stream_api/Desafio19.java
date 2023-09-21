package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "---19- SOMA DOS NUMEROS DIVISÍVEIS POR 3 E 5 ---");

        Predicate<Integer> somaTresEcinco = numero -> numero % 3 == 0 || numero % 5 == 0;

        Integer teste = numeros.stream().filter(somaTresEcinco).reduce(0, Integer::sum);

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + teste);

    }
}
