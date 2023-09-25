package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Agrupe os números em pares e ímpares:
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma
 * contendo os números pares e outra contendo os números ímpares da lista
 * original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "---16- AGRUPE OS NUMEROS EM PARES E IMPARES ---");

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0).toList();

        List<Integer> impares = numeros.stream()
                .filter(numero -> numero % 2 != 0).toList();

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

    }

}
