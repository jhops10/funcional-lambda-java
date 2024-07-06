package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));


       //Implementação de Interface
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //names.forEach(product -> System.out.println(product));


        //Reference Method com metodo estatico
        //List<String> names = list.stream().map(Product::staticUpperCaseName).toList();
        //names.forEach(product -> System.out.println(product));


        //Reference Method sem metodo estatico
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();
        //names.forEach(System.out::println);



        //Expressão Lambda Declarada
        //Function<Product, String> func = product -> product.getName().toUpperCase();
        //List<String> names = list.stream().map(func).toList();


        //Expressão Lambda Inline
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();
        names.forEach(System.out::println);

        //list.forEach(product -> System.out.println(product.toString()));

    }
}
