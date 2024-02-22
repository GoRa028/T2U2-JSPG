
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");
        System.out.println("Hello world");

        Triangulo triangulo1 = new Triangulo(5.78, 9.81);
        double area = triangulo1.calcularArea();
        System.out.println("El area del triángulo es: "+area);

        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
    }
}