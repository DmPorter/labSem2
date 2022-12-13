package lab5.suppressed;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        try(Exmpl exmpl = new Exmpl("2")) {
            throw new RuntimeException("try");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
