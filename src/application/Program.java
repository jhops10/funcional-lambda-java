package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        //Reference Method com método estático.
        //list.removeIf(Product::staticProductPredicate);

        //Reference Method com método não estático.
        //list.removeIf(Product::nonStaticProductPredicate);

        //Expressão Lambda declarada.
        //Predicate<Product> pred = product -> product.getPrice() >= 100.0;
        //list.removeIf(pred);

        //Expressão Lambda inline.
        list.removeIf(product -> product.getPrice() >= 100.0);



        list.forEach(product -> System.out.println(product.toString()));

    }
}
