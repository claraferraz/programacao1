//As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas
//pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o
//custo total da compra.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Macas m = new Macas();
        System.out.println("Digite a quantidade de maçãs: ");
        m.setQuantidade(sc.nextInt());
        m.setPreco();
        System.out.println(m.getQuantidade() + " maçãs saem a R$" + m.getPreco() + ". Total: R$" + m.total());

    }
}