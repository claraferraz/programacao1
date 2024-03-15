public class Produto {
    private String tipo, nomeProduto;
    private double preco;

    public Produto(String tipo, double preco, String nomeProduto) {
        this.tipo = tipo;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
    }
    public void dados(){
        System.out.println("Tipo de produto: " + tipo);
        System.out.println("Preço: " + preco);
        System.out.println("Nome do produto: " + nomeProduto);
    }
}
