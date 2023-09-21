package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 *  Desafio 2 - Imprima a soma dos números pares da lista:
 *  Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 *  
*/
public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "--------2- SOMA DOS NUMEROS PARES------------");
        int somaNumerosPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("A soma dos números pares é: " + somaNumerosPares);

    }
}
