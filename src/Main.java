import structural.BinOps;

public class Main {
    public static void main(String[] args) {
        String a = "11001000"; //200
        String b = "100101100"; //300
        System.out.printf("Аргумент a = %s\n", a);
        System.out.printf("Аргумент b = %s\n", b);
        BinOps bins = new BinOps();
        System.out.println("Демонстрация операции сложения:");
        System.out.println(bins.sum(a, b));
        System.out.println("Демонстрация операции умножения:");
        System.out.println(bins.mult(a, b));
    }
}
