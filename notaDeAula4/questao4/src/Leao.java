public class Leao extends Animal{
    private String pelo;
    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }
    public void exibirInformacoes(){
        System.out.println("Classe: " + classe);
        System.out.println("Locomoção: " + locomocao);
        System.out.println("Pelo: " + pelo);
    }
}
