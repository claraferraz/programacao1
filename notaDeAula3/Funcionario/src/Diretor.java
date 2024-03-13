public class Diretor extends Funcionario {
    private int acoes;
    public void setAcoes(int acoes){
        this.acoes = acoes;
    }
    public int getAcoes() {
        return acoes;
    }
    public void exibirDiretor(){
        super.exibir();
        System.out.println("Ações: " + getAcoes());
    }
}
