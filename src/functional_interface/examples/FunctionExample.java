package functional_interface.examples;

import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma função que dobra um número inteiro
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    // Usar a função para dobrar um número
    int numero = 5;
    int resultado = dobrar.apply(numero);
    System.out.println("O dobro de " + numero + " é: " + resultado);
  }
}
