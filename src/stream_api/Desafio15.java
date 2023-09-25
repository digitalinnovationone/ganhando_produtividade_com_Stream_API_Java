package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Verifique se a lista contém pelo menos um número negativo:
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número
 * negativo e exiba o resultado no console.
 */
public class Desafio15 {
    public static void main(String[] args) {
        System.out.println(
                "---15- VERIFICAR SE EXISTE NUMERO NEGATIVO ---");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();

        if (numerosNegativos.isEmpty()) {
            System.out.println("Não existem números negativos nesta lista.");
        } else {
            System.out.println("Números negativos da lista: " + numerosNegativos);
        }
    }
}
