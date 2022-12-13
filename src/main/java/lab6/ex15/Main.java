package lab6.ex15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = map(numbers, o -> o + "+");
        System.out.println(strings);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("10", 10));
        employees.add(new Employee("20", 20));
        employees.add(new Employee("30", 30));
        List<Employee> newEmployees = map(employees, employee -> new Employee(employee.getName(), employee.getSalary()*2));
        System.out.println(newEmployees);

        List<Manager> managers = map(employees, employee -> new Manager(employee.getName(), employee.getSalary(), 0));
        System.out.println(managers);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T elem : list) {
            result.add(function.apply(elem));
        }
        return result;
    }
}
