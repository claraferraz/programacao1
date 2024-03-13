public class Gerente extends Funcionario {
    private String departamento;
    public void setDepartamento(String departamento){this.departamento = departamento;}
    public String getDepartamento(){return departamento;}

    public double calcBonus(){
        return salario * 0.1;
    }
    public void exibirGerente(){
        super.exibir();
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Bônus: " + calcBonus());
    }
}
