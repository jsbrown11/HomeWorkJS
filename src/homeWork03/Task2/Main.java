package homeWork03.Task2;


public class Main {

    public static void main(String[] args) {
        int a = 11;
        int b = 7;

        Adder adder = new Adder();

        System.out.println(adder.add(a,b));
        System.out.println(adder.check(a,b));
        System.out.println(adder.check(b,a));

    }
}
