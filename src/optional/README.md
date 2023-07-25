# Optional

O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo). 
Ela foi introduzida a partir do Java 8 para evitar o temido NullPointerException (NPE) que é comum quando se trabalha com referências nulas. Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso indica explicitamente que o valor pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.
<br>
- `of(value)`: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get());
```

- `ofNullable(value)`: Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.

```java
String nullableValue = null;
Optional<String> optionalValue = Optional.ofNullable(nullableValue);
System.out.println(optionalValue.isPresent());
```
- `empty()`: Retorna um Optional vazio (sem valor).

```java
Optional<String> optionalValue = Optional.empty();
System.out.println(optionalValue.isPresent());
```

- `isPresent()`: Verifica se o Optional contém um valor não nulo.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.isPresent());
```

- `isEmpty()` (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

```java
Optional<String> optionalValue = Optional.ofNullable(null);
System.out.println(optionalValue.isEmpty());
```

- `get()`: Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get());
```

- `orElse(defaultValue)`: Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElse("Default"); 
System.out.println(result);
```

- `orElseGet(supplier)`: Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseGet(() -> "Value from Supplier");
System.out.println(result);
```
- `orElseThrow(exceptionSupplier)`: Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
```

- `ifPresent(consumer)`: Executa uma ação fornecida por um Consumer se o Optional contiver um valor.

```java
Optional<String> optionalValue = Optional.of("Hello");
optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
```
---

### Referências:

[1] "Java Platform, Standard Edition 17 - Class Optional." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html.

[2] "Java Optional - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-optional.