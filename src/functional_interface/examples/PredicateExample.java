package functional_interface.examples;

import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    // Criar um predicado para verificar se um número é par
    Predicate<Integer> isPar = numero -> numero % 2 == 0;

    // Usar o predicado para verificar se um número é par
    int numero = 6;
    if (isPar.test(numero)) {
      System.out.println(numero + " é um número par.");
    } else {
      System.out.println(numero + " não é um número par.");
    }
  }
}

