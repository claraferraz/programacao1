import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();
        System.out.println("Lado a: ");
        t.setA(sc.nextInt());
        System.out.println("Lado b: ");
        t.setB(sc.nextInt());
        System.out.println("Lado c: ");
        t.setC(sc.nextInt());
        t.checar();
    }
}