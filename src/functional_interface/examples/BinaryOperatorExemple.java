package functional_interface.examples;

import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
  public static void main(String[] args) {
    // Criar um BinaryOperator para somar dois números inteiros
    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    // Usar o BinaryOperator para somar dois números
    int numero1 = 5;
    int numero2 = 7;
    int resultado = somar.apply(numero1, numero2);
    System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
  }
}
