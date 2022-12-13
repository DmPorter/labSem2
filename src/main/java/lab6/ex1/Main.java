package lab6.ex1;

public class Main {
    public static void main(String[] args) {
        Stack<String> arr = new Stack<>();
        arr.push("1");
        arr.push("2");
        arr.push("3");
        System.out.println(arr);

        System.out.println(arr.pop());
        System.out.println(arr);
        System.out.println(arr.pop());
        System.out.println(arr);
        System.out.println(arr.pop());
        System.out.println(arr);


    }
}
