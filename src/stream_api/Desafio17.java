package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 17 - Filtrar os números primos da lista:
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o
 * resultado no console.
 */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "---17- FILTRE OS NUMEROS PRIMOS ---");

        List<Integer> numerosPrimos = numeros.stream().filter(n -> Desafio14.isPrimo(n)).toList();

        System.out.println("Numeros primos: " + numerosPrimos);

    }

}
