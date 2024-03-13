import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int opcao;
        String loop;
        System.out.println("Cadastro de funcionário ");
        do {
            loop = "s";
            System.out.println("Para cadastrar um Gerente digite 1, para um Diretor digite 2: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    //cadastro do gerente
                    Gerente g1 = new Gerente();
                    System.out.println("Gerente");

                    System.out.println("Nome: ");
                    g1.setNome(str.nextLine());

                    System.out.println("Salário: ");
                    g1.setSalario(sc.nextDouble());

                    System.out.println("Departamento: ");
                    g1.setDepartamento(str.nextLine());

                    g1.exibirGerente();
                    System.out.println("Cadastrar outro funcionário? s/n");
                    loop = str.nextLine();
                    break;
                case 2:
                    //cadastro do diretor
                    Diretor d1 = new Diretor();
                    System.out.println("Diretor");

                    System.out.println("Nome: ");
                    d1.setNome(str.nextLine());

                    System.out.println("Salário: ");
                    d1.setSalario(sc.nextDouble());

                    System.out.println("Quantidade de ações: ");
                    d1.setAcoes(sc.nextInt());

                    d1.exibirDiretor();

                    System.out.println("Cadastrar outro funcionário? s/n");
                    loop = str.nextLine();
                    break;
            }

        } while (loop.equalsIgnoreCase("s"));

    }
}