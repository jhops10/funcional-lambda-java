package application;

import entities.Employee;
import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "E:\\DEVELOPMENT\\Java\\Projetos\\in.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {

          List<Employee> list = new ArrayList<>();

          String line = br.readLine();
          while (line != null) {
              String[] fields = line.split(",");
              list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
              line = br.readLine();
          }

          System.out.print("Enter Salary:");
          double salary = sc.nextDouble();

          System.out.println("Email of people whose salary is more than " + salary);

          Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
          List<String> emails = list.stream().filter(emp -> emp.getSalary() > salary).map(emp -> emp.getEmail()).sorted(comp).toList();

          emails.forEach(System.out::println);

          double sum = list.stream().filter(emp -> emp.getName().charAt(0) == 'M').map(emp -> emp.getSalary()).reduce(0.0, (x,y) -> x + y);

          System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

      } catch (IOException e) {
          System.out.println("Error: " + e.getMessage());
      }

    }
}
