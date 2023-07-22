package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the list: ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; ++i) {
            System.out.println("What is your employee ID? ");
            Integer empID = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(name, empID, salary));
        }

        System.out.println(list.toString());
        System.out.println("Employee you want to increase salary: ");
        Integer empID = sc.nextInt();
        List<Employee> increase = list.stream().filter((x) -> x.getId().equals(empID)).toList();
        System.out.println("What is the percentage of the salary increase?");
        double percentage = sc.nextDouble();
        ((Employee)increase.get(0)).percentageIncrease(percentage);
        System.out.println(increase.toString());
        sc.close();
    }
}
