package functional_interface.examples;

import java.util.function.Supplier;

public class SupplierExample {
  public static void main(String[] args) {
    // Criar um Supplier para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter a saudação
    String mensagemSaudacao = saudacao.get();
    System.out.println(mensagemSaudacao);
  }
}
