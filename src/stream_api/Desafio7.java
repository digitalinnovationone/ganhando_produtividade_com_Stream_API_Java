package stream_api;

import java.util.Arrays;
import java.util.List;


/**
 *      Encontrar o segundo número maior da lista:
        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 *  
 */
public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "-----------------------------------------7- SEGUNDO MAIOR NUMERO DA LISTA----------------------------------");

        Integer segundoMaior = numeros.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst().orElse(null);

        System.out.println("O Segundo maior número da lista é: " + segundoMaior);
    }
}
