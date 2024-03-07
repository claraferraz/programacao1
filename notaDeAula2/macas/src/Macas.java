//As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas
//pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o
//custo total da compra.

public class Macas {
    private double preco;
    private int quantidade;

    public void setQuantidade(int quantidade){this.quantidade = quantidade;}
    public int getQuantidade(){return quantidade;}
    public void setPreco() {
        if (quantidade >= 12) {
            preco = 1.00;
        }else {preco = 1.30;}
    }

    public double getPreco(){return preco;}
    public double total(){
        return preco * quantidade;
    }
}
