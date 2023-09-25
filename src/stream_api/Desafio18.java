package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 18 - Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e
 * exiba o resultado no console. 
 */
public class Desafio18 {
    public static void main(String[] args) {
        System.out.println(
            "---18- NUMEROS QUE SAO IGUAIS ---");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosNaoRepetidos = numeros.stream().distinct().toList();

        if (!numerosNaoRepetidos.isEmpty()) {
            System.out.println("Todos os números da lista não são iguais, esses eram únicos: " + numerosNaoRepetidos);
        } else {
            System.out.println("Todos os números são iguais.");
        }

    }
}
