//Faça um algoritmo para receber a quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. O sistema deve calcular e exibir a quantidade média
//usando a seguinte fórmula: quantidade média = (quantidade máxima + quantidade mínima)/2. Se a
//quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar
//compra', senão escrever a mensagem 'Efetuar compra'
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        Scanner sc = new Scanner(System.in);
        System.out.println("Determine a quantidade ATUAL em estoque: ");
        e.setAtual(sc.nextInt());
        System.out.println("Determine a quantidade MÁXIMA em estoque: ");
        e.setMax(sc.nextInt());
        System.out.println("Determine a quantidade MÍNIMA em estoque: ");
        e.setMin(sc.nextInt());
        e.media();
    }

}