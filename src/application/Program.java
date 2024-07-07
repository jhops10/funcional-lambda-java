package application;

import entities.Product;
import model.services.ProductService;


import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, product -> product.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
        //list.forEach(product -> System.out.println(product.toString()));

    }
}
