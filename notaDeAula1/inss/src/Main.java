import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        INSS pessoa = new INSS();
        String r = "s";

        while (r.equalsIgnoreCase("s")){
            //coleta de dados
            System.out.println("Digite as informações a seguir: ");
            System.out.println("Matrícula:");
            pessoa.matricula = num.nextInt();
            System.out.println("Nome completo:");
            pessoa.nome = str.nextLine();
            System.out.println("Salário Bruto:");
            pessoa.bruto = num.nextDouble();

            //retorno dos dados
            pessoa.funcionario();

            System.out.println("Cadastrar outro funcionário? (s/n)");
            r = str.nextLine();
        }
    }
}