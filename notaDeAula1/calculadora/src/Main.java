//calculadora com as 4 operações
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora soma = new Calculadora();
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        int opcao;
        int r = 0;
        while(r == 0) {
            System.out.println("Escolha uma opção e digite seu número: soma(1), subtração(2), multiplicação(3), divisão(4).");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Soma. Digite os números a serem somados: ");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    double somar = Calculadora.soma(x, y);
                    System.out.println(x + " + " + y + " = " + somar);
                    System.out.println("Para realizar outra operação, digite 0. Para encerrar, digite qualquer coisa.");
                    r = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Subtração. Digite os números a serem subtraídos: ");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    double subtrair = Calculadora.sub(x, y);
                    System.out.println(x + " - " + y + " = " + subtrair);
                    System.out.println("Para realizar outra operação, digite 0. Para encerrar, digite qualquer coisa.");
                    r = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Multiplicação. Digite os números a serem multiplicados: ");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    double multiplicar = Calculadora.mult(x, y);
                    System.out.println(x + " * " + y + " = " + multiplicar);
                    System.out.println("Para realizar outra operação, digite 0. Para encerrar, digite qualquer coisa.");
                    r = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Divisão. Digite os números a serem divididos: ");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    double dividir = Calculadora.div(x, y);
                    System.out.println(x + " / " + y + " = " + dividir);
                    System.out.println("Para realizar outra operação, digite 0. Para encerrar, digite qualquer coisa.");
                    r = sc.nextInt();
                    break;
                default:
                    System.out.println("Escolha uma opção e digite seu número: soma(1), subtração(2), multiplicação(3), divisão(4).");
                    opcao = sc.nextInt();
            }
        }
    }

}