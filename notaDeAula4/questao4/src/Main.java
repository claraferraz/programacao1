public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("Ave", "Asas", 4);
        arara.setClasse("Ave");
        arara.setLocomocao("Asas");
        arara.setQtdDeOvos(4);

        System.out.println("Informações do Leao:");
        leao.exibirInformacoes();

        System.out.println("Informações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdDeOvos());

    }
}
