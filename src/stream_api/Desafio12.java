package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Desafio 12 - Encontre o produto de todos os números da lista:
* Com a ajuda da Stream API, encontre o produto de todos os números 
* da lista e exiba o resultado no console.
 */
public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                "-----12- ENCONTRAR O PRODUTO DE TODOS OS NUMEROS-----");
        Optional<Integer> produto = numeros.stream()
                .reduce((a, b) -> a * b);

        System.out.println("O produto de todos os números é: " + produto.get());
    }
}
