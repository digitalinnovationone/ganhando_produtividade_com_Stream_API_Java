# Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada
como
expressões lambda.

- `Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada
  principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

```java
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Criar um Consumer para imprimir cada número
    Consumer<Integer> imprimirNumero = numero -> System.out.println(numero);

    // Usar o Consumer para imprimir cada número no Stream
    numeros.stream().forEach(imprimirNumero);
  }
}
```

```java
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Criar um Consumer usando uma classe anônima para imprimir cada número
    Consumer<Integer> imprimirNumero = new Consumer<Integer>() {
      @Override
      public void accept(Integer numero) {
        System.out.println(numero);
      }
    };

    // Usar o Consumer para imprimir cada número no Stream
    numeros.stream().forEach(imprimirNumero);
  }
}
```

- `Supplier<T>`: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente
  usada para criar ou fornecer novos objetos de um determinado tipo.

```java
public class SupplierExample {
  public static void main(String[] args) {
    // Criar um Supplier para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter a saudação
    String mensagemSaudacao = saudacao.get();
    System.out.println(mensagemSaudacao);
  }
}
```

```java
public class SupplierExample {
  public static void main(String[] args) {
    // Criar um Supplier usando uma classe anônima para fornecer uma saudação personalizada
    Supplier<String> saudacao = new Supplier<String>() {
      @Override
      public String get() {
        return "Olá, seja bem-vindo(a)!";
      }
    };

    // Usar o Supplier para obter a saudação
    String mensagemSaudacao = saudacao.get();
    System.out.println(mensagemSaudacao);
  }
}
```

- `Function<T, R>`: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É
  utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

```java
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
```

```java
public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma função que dobra um número inteiro usando uma classe anônima
    Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer numero) {
        return numero * 2;
      }
    };

    // Usar a função para dobrar um número
    int numero = 5;
    int resultado = dobrar.apply(numero);
    System.out.println("O dobro de " + numero + " é: " + resultado);
  }
}
```

- `Predicate<T>`: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou
  falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

```java
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
```

```java
public class PredicateExample {
  public static void main(String[] args) {
    // Criar um predicado para verificar se um número é par usando uma classe anônima
    Predicate<Integer> isPar = new Predicate<Integer>() {
      @Override
      public boolean test(Integer numero) {
        return numero % 2 == 0;
      }
    };

    // Usar o predicado para verificar se um número é par
    int numero = 6;
    if (isPar.test(numero)) {
      System.out.println(numero + " é um número par.");
    } else {
      System.out.println(numero + " não é um número par.");
    }
  }
}
```

- `BinaryOperator<T>`: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo
  tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

```java
public class BinaryOperatorExample {
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
```

```java
public class BinaryOperatorExample {
  public static void main(String[] args) {
    // Criar um BinaryOperator para somar dois números inteiros usando uma classe anônima
    BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer num1, Integer num2) {
        return num1 + num2;
      }
    };

    // Usar o BinaryOperator para somar dois números
    int numero1 = 5;
    int numero2 = 7;
    int resultado = somar.apply(numero1, numero2);
    System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
  }
}
```

> _Classe Anônima_:
A classe anônima em Java é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução.
Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado
apenas uma vez.

---

### Referências:

[1] "Java 8 Functional Interfaces." Baeldung. Disponível em: https://www.baeldung.com/java-8-functional-interfaces.

[2] "Como utilizar uma classe anônima em Java." FAQ CartX. Disponível em: https://faqcartx.info/programa%C3%A7%C3%A3o/40977-como-utilizar-uma-classe-an%C3%B4nima-em-java.html.

