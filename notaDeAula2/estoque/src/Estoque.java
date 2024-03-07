//Faça um algoritmo para receber a quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. O sistema deve calcular e exibir a quantidade média
//usando a seguinte fórmula: quantidade média = (quantidade máxima + quantidade mínima)/2. Se a
//quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar
//compra', senão escrever a mensagem 'Efetuar compra'

public class Estoque {
    private int atual, max, min;
    public void setAtual(int atual){this.atual = atual;}
    public void setMax(int max){this.max = max;}
    public void setMin(int min){this.min = min;}
    public int getAtual(){return atual;}
    public int getMax(){return max;}
    public int getMin(){return min;}

    public void media(){
        int m = (max + min)/2;
        if (atual >= m){
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }

}
