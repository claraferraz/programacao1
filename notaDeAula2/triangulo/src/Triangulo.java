//Crie um programa em Java que recebe três comprimentos de lados e determina se esses comprimentos
//podem formar um triângulo. Caso positivo, o programa deve indicar o tipo de triângulo formado
//(equilátero, isósceles ou escaleno).

public class Triangulo {
    private int a, b, c;
    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}
    public void setC(int c) {this.c = c;}

    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}

    public void checar(){
        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Não é um triângulo.");
        } else {
            tipoTriangulo();
        }
    }
    public void tipoTriangulo(){
        if (a == b && a == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a != b && a != c && b != c){
            System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Triângulo Isóceles");
        }
    }
}
