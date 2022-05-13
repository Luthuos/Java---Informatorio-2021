import java.awt.print.Printable;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese nombre y apellido: \n -> ");
        String nombreApellido = scan.nextLine();
        System.out.print("Ingrese edad: \n -> ");
        String edad = scan.nextLine();
        System.out.print("Ingrese direccion: \n -> ");
        String dir = scan.nextLine();
        System.out.print("Ingrese ciudad: \n -> ");
        String ciudad = scan.nextLine();

        System.out.println( ciudad + " - " + dir + " - " + edad + " - " + nombreApellido);
    }
}
