import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String[] lamparaDeLosDeseos = new String[7];
        System.out.println(
                "¡WOW! ¡Te has encontrado una lámpara mágica como la de Aladino! Puedes pedirle 7 deseos que entrarán dentro de la lámpara, pero el genio sólo puede cumplirte uno al azar. Suerte! ");

        for (int i = 0; i < lamparaDeLosDeseos.length; i++) {

            System.out.println("Ahora escribe un deseo: ");
            lamparaDeLosDeseos[i] = teclado.nextLine();
        }

        int deseoAleatorio = (int) (Math.random() * 8);

        for (int i = 0; i < lamparaDeLosDeseos.length; i++) {
            if (deseoAleatorio == i) {
                System.out.println("El genio mueve la lámpara y aparece escrito esto en una nube mágica:\n"
                        + lamparaDeLosDeseos[i]);
            }
        }

        // Mostrar todos los deseos
        for (String i : lamparaDeLosDeseos) {
            System.out.println("Uno de los deseos fue: " + i);
        }

        teclado.close();
    }
}
