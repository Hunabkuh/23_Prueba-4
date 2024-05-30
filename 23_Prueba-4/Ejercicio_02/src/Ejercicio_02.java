import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige el tipo de Dios a crear:");
        System.out.println("1. Dios del Olimpo (Recomendado)");
        System.out.println("2. Dios Moderno.");
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();
        teclado.nextLine();

    }
}
