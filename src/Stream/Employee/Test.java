package Stream.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<EmployeeSalary> listOfEmployee = List.of(
                new EmployeeSalary("Ram", 100),
                new EmployeeSalary("Sham", 1000),
                new EmployeeSalary("Jam", 10000),
                new EmployeeSalary("Kam", 100)
        );

        listOfEmployee.stream()
                .sorted((em1, em2) -> em1.getSalary() - em2.getSalary())
                .forEach(System.out::println);
    }
}
