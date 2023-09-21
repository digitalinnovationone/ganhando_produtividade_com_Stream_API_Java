package stream_api;

import java.util.Arrays;
import java.util.List;

/***
 * Agrupe os valores ímpares múltiplos de 3 ou de 5:
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e
 * exiba o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(
                "-----10- AGRUPAR NUMEROS MULTIPLOS DE 3 OU 5-------");

        List<Integer> result = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();

        System.out.println("Números múltiplos de 3 e 5: " + result);

    }

}
