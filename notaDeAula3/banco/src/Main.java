import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        String repetir;

        System.out.println("Para acessar a Conta Corrente digite 1, para Conta Poupança digite 2");
        int opcaoConta = num.nextInt();

        switch (opcaoConta) {
            case 1:
                repetir = "s";
                ContaCorrente c1 = new ContaCorrente();
                System.out.println("Digite seu nome completo:");
                c1.setNome(str.nextLine());
                do {
                    System.out.println("Digite o número indicado para realizar uma ação:");
                    System.out.println("Depositar (1), Sacar (2), Cheque Especial (3), Dados da conta (4)");
                    int opcaoCorrente = num.nextInt();
                    switch (opcaoCorrente) {
                        case 1:
                            //depositar
                            System.out.println("Qual valor deseja depositar? ");
                            c1.depositar(num.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 2:
                            //sacar
                            System.out.println("Qual valor deseja sacar? ");
                            c1.sacar(num.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 3:
                            //cheque especial
                            System.out.println("Quanto deseja sacar do Cheque Especial?");
                            c1.chequeEsp(num.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 4:
                            //dados
                            c1.dadosCorrente();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;

                    }
                } while (repetir.equalsIgnoreCase("s"));
                break;

            case 2:
                repetir = "s";
                ContaPoupanca p1 = new ContaPoupanca();
                System.out.println("Digite seu nome completo:");
                p1.setNome(str.nextLine());
                do {
                    System.out.println("Digite o número indicado para realizar uma ação:");
                    System.out.println("Depositar (1), Sacar (2), Informes de Rendimento (3), Dados da conta (4)");
                    int opcaoPoupanca = num.nextInt();
                    switch (opcaoPoupanca) {
                        case 1:
                            //depositar
                            System.out.println("Qual valor deseja depositar? ");
                            p1.depositar(num.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 2:
                            //sacar
                            System.out.println("Qual valor deseja sacar? ");
                            p1.sacar(num.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 3:
                            //rendimento
                            //em 08/03/24 a taxa estava em 11.25%, o ideal seria integrar com uma API para verificar diariamente
                            p1.setSelic(11.25);
                            System.out.println("Taxa Selic " + p1.getSelic() + "%");
                            p1.calcRend();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                        case 4:
                            //dados
                            p1.dadosPoupanca();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = str.nextLine();
                            break;
                    }

                } while (repetir.equalsIgnoreCase("s"));
                break;

        }
    }
}