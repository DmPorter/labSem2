package smth;



import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayListWithOrderBy<Integer> arrayList = new ArrayListWithOrderBy<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(1);
        System.out.println(arrayList);
        arrayList.orderBy(Integer::compareTo);
        System.out.println(arrayList);

        ArrayListWithOrderBy<String> arrayList2 = new ArrayListWithOrderBy<>();
        arrayList2.add("aa");
        arrayList2.add("b");
        arrayList2.add("bb");
        arrayList2.add("dddd");
        arrayList2.add("aaa");
        arrayList2.add("bbb");
        arrayList2.add("bb");
        arrayList2.add("a");
        arrayList2.add("ddd");
        arrayList2.add("dd");
        arrayList2.add("d");
        System.out.println(arrayList2);
        arrayList2.orderBy(String::compareTo);
        System.out.println(arrayList2);
        arrayList2.orderBy(String::compareTo, Comparator.comparing(String::length));
        System.out.println(arrayList2);

        ArrayListWithOrderBy<Employee> employees = new ArrayListWithOrderBy<>();
        employees.add(new Employee("Vika","Ivanova",21));
        employees.add(new Employee("Mika","Ivanova",21));
        employees.add(new Employee("Boris","Dobrinin",31));
        employees.add(new Employee("Boris","Alekseev",32));
        employees.add(new Employee("Sara","Bogdanova",25));
        employees.add(new Employee("Sara","Bogdanova",36));
        employees.add(new Employee("Alesha","Mironov",38));
        employees.add(new Employee("Lada","Yagodova",54));

        System.out.println(employees);
        System.out.println();
        employees.orderBy(Comparator.comparing(Employee::getAge), Comparator.comparing(Employee::getName));
        System.out.println(employees);
        employees.orderBy(Comparator.comparing(Employee::getSurname));
        System.out.println(employees);
        employees.orderBy(Comparator.comparing(Employee::getAge));
        System.out.println(employees);

    }
}
