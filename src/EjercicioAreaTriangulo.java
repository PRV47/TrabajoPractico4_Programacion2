import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioAreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        while (true) {
            try {
                System.out.println("Introduzca el tamaño de la base: ");
                base = sc.nextDouble();
                System.out.println("Introduzca la altura: ");
                altura = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero valido.");
                sc.next();
            }
        }
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
