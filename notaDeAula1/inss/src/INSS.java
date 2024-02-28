public class INSS {
    int matricula;
    String nome;
    double bruto;
    public double deducao(){
        return bruto * 0.15;
    }
    public double liquido(){
        double imposto = deducao();
        return bruto - imposto;
    }
    public void funcionario(){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário Bruto: " + bruto);
        System.out.println("Dedução INSS: " + deducao());
        System.out.println("Salário líquido: " + liquido());
    }
}
