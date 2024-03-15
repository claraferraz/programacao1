public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Joana", 40, 8000);
        Aluno a = new Aluno("Clara", 25, 51);
       //professora
        System.out.println("Professora: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Salario: " + p.getSalario());

        //aluna
        System.out.println("Aluna: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Matricula: " + a.getMatricula());

    }
}