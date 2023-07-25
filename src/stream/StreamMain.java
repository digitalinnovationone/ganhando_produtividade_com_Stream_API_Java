package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
  List<Integer> numerosAleatorios =
      Arrays.asList(1, 0, 4, 1, 2, 3, 9, 9, 6, 5);

  //Mostre a lista na ordem natural
  public List<Integer> ordemNumerica() {
    return numerosAleatorios.stream()
        .sorted(Comparator.naturalOrder())
        .toList();
  }
}
