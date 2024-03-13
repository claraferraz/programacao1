import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String loop, loopC, loopV;
        int acao;
        Televisao t1 = new Televisao();
        Smartphone s1 = new Smartphone();
        do {
            loop = "s";
            System.out.println("Para Cadastro de produto digite 1, para Venda digite 2: ");
            acao = num.nextInt();

            switch (acao) {
                case 1: //cadastro
                    do {
                        loopC = "s";
                        System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                        String p = str.nextLine();

                        switch (p.toLowerCase()) {
                            case "t":

                                System.out.println("Nome do produto: ");
                                t1.setNome(str.nextLine());
                                System.out.println("Quantidade em estoque: ");
                                t1.setEstoque(num.nextInt());
                                System.out.println("Preço: ");
                                t1.setPreco(num.nextDouble());
                                t1.exibir();

                                System.out.println("Cadastrar outro produto? s/n");
                                loopC = str.nextLine();
                                break;

                            case "s":

                                System.out.println("Nome do produto: ");
                                s1.setNome(str.nextLine());
                                System.out.println("Quantidade em estoque: ");
                                s1.setEstoque(num.nextInt());
                                System.out.println("Preço: ");
                                s1.setPreco(num.nextDouble());
                                s1.exibir();
                                System.out.println("Cadastrar outro produto? s/n");
                                loopC = str.nextLine();
                                break;
                            default:
                                System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                                p = str.nextLine();
                                break;
                        }
                    } while (loopC.equalsIgnoreCase("s"));
                    System.out.println("Realizar outra ação? s/n");
                    loop = str.nextLine();
                    break;
                case 2:
                    do {
                        loopV = "s";
                        //venda
                        System.out.println("Venda");
                        System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                        String v = str.nextLine();
                        switch (v.toLowerCase()) {
                            case "t":
                                System.out.println("Quantidade vendida: ");
                                t1.venda(num.nextInt());
                                System.out.println("Vender outro produto? s/n");
                                loopV = str.nextLine();
                                break;
                            case "s":
                                System.out.println("Quantidade vendida: ");
                                s1.venda(num.nextInt());
                                System.out.println("Vender outro produto? s/n");
                                loopV = str.nextLine();
                                break;
                            default:
                                System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                                v = str.nextLine();
                                break;
                        }
                    } while (loopV.equalsIgnoreCase("s"));
                    System.out.println("Realizar outra ação? s/n");
                    loop = str.nextLine();
                    break;
                default:
                    System.out.println("Para Cadastro de produto digite 1, para Venda digite 2: ");
                    acao = num.nextInt();
                    break;
            }
        } while (loop.equalsIgnoreCase("s"));
    }
}