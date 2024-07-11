package application;


import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<Integer> numbers = new Random().ints(20, 1, 101).boxed().toList();


        //Números Pares da Lista:
        List<Integer> pairNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();

        //Multiplicar Números por 2:
        List<Integer> x2 = numbers.stream().map(num -> num * 2).toList();

        //Ordenar Números:
        List<Integer> orderedList = numbers.stream().sorted().toList();

        //Ordem Reversa:
        List<Integer> reverseOrdered = numbers.stream().sorted(Comparator.reverseOrder()).toList();

        //Calcular Soma:
        int summedList = numbers.stream().reduce(0, (x,y) -> (x + y));

        //Imprimir Resultados:
        System.out.println("Números Pares: ");
        pairNumbers.forEach(System.out::println);
        System.out.println("=========================");
        System.out.println("Multiplicados por 2: ");
        x2.forEach(System.out::println);
        System.out.println("=========================");
        System.out.println("Lista Ordenada: ");
        orderedList.forEach(System.out::println);
        System.out.println("=========================");
        System.out.println("Ordem Reversa: ");
        reverseOrdered.forEach(System.out::println);
        System.out.println("=========================");
        System.out.println("Soma Total: ");
        System.out.println("Soma da Lista: " + summedList);

    }
}
