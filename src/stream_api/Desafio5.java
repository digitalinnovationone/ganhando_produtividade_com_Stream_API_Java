package stream_api;

import java.util.Arrays;
import java.util.List;

/***
 * Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o
 * resultado no console.
 * 
 */
public class Desafio5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(
                "-----5-MEDIA DOS NUMEROS MAIORES QUE CINCO-----");
        double media = numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
