package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado
 * no console.
 */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Predicate<Integer> somaTresEcinco = numero -> numero > 1 || numero % numero != 0;
        System.out.println(
                "------14- ENCONTRAR O MAIOR NUMERO PRIMO DA LISTA -------");

        Integer maiorNumeroPrimo = numeros.stream().filter(n -> isPrimo(n)).max(Integer::compareTo)
                .orElse(null);
        System.out.println("O maior número primo é: " + maiorNumeroPrimo);
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    };
}
