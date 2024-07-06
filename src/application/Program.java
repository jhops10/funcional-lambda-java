package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));


        //Implementação da Interface
        //list.forEach(new PriceUpdate());

        //Reference Method com método estático
        //list.forEach(Product::staticPriceUpdate);

        //Reference Method sem método estático
        //list.forEach(Product::nonStaticPriceUpdate);

         //Expressão Lambda declarada
        //double factor = 1.1;
        //Consumer<Product> cons = product -> product.setPrice(product.getPrice() * factor);

        //Expressão Lambda inline
        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));


        list.forEach(product -> System.out.println(product.toString()));

    }
}
