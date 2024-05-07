import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinanza {
    public static void main(String[] args) {
        Random rand = new Random();
        int resp = rand.nextInt(100);
        int intentos = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Introduzca el intento: ");
                int intentoUsuario = sc.nextInt();
                if (intentoUsuario == resp) {
                    intentos++;
                    System.out.println("Ha adivinado el numero! Le ha tomado " + intentos + " intentos.");
                    break;
                } else if (intentoUsuario < resp) {
                    intentos++;
                    System.out.println("El numero es mayor que el ingresado.");
                } else if (intentoUsuario > resp) {
                    intentos++;
                    System.out.println("El numero es menor que el ingresado.");
                }
            } catch (Exception e) {
                intentos++;
                System.out.println("Introduzca un numero valido.");
                sc.next();
            }
        }
    }
}
