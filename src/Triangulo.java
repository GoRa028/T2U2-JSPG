public class Triangulo {
    double h, b;

    public Triangulo (double altura, double base){
        h = altura;
        b = base;
    }
    public double calcularArea(){
        double ar = (h*b)/2;
        return ar;
    }
}
