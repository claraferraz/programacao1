public class Arara extends Animal{
    private int qtdDeOvos;
    public Arara(String classe, String locomocao, int qtdDeOvos) {
        super(classe, locomocao);
        this.qtdDeOvos = qtdDeOvos;
    }
    public void setQtdDeOvos(int qtdDeOvos) {
        this.qtdDeOvos = qtdDeOvos;
    }
    public int getQtdDeOvos(){
        return qtdDeOvos;
    }
}
