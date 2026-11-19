import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ravi", "IT", 50000),
            new Employee(2, "Raj", "HR", 30000),
            new Employee(3, "Kiran", "IT", 70000),
            new Employee(4, "Arjun", "Finance", 45000),
            new Employee(5, "Sai", "HR", 60000),
            new Employee(6, "Ravi", "IT", 55000)
        );

        System.out.println("FILTER:");
        employees.stream()
                 .filter(e -> e.salary > 50000)
                 .forEach(System.out::println);

        System.out.println("\nMAP:");
        employees.stream()
                 .map(e -> e.name)
                 .forEach(System.out::println);

        System.out.println("\nSORTED:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(e -> e.salary))
                 .forEach(System.out::println);

        System.out.println("\nDISTINCT:");
        employees.stream()
                 .map(e -> e.name)
                 .distinct()
                 .forEach(System.out::println);

        System.out.println("\nSKIP:");
        employees.stream()
                 .skip(2)
                 .forEach(System.out::println);

        System.out.println("\nLIMIT:");
        employees.stream()
                 .limit(3)
                 .forEach(System.out::println);

        System.out.println("\nPEEK:");
        employees.stream()
                 .peek(e -> System.out.println("Processing: " + e.name))
                 .filter(e -> e.salary > 50000)
                 .forEach(System.out::println);

        System.out.println("\nFLATMAP:");

        List<List<String>> departments = Arrays.asList(
            Arrays.asList("Ravi", "Kiran"),
            Arrays.asList("Raj", "Sai"),
            Arrays.asList("Arjun", "Ram")
        );

        departments.stream()
                   .flatMap(list -> list.stream())
                   .forEach(System.out::println);

        System.out.println("\nDROPWHILE:");
        employees.stream()
                 .dropWhile(e -> e.salary < 50000)
                 .forEach(System.out::println);
    }
}