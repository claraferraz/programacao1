import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Cadastre as notas:");
        System.out.println("nota 1:");
        aluno.n1 = sc.nextDouble();
        System.out.println("nota 2:");
        aluno.n2 = sc.nextDouble();
        System.out.println("nota 3:");
        aluno.n3 = sc.nextDouble();

        aluno.situacao();


    }
}