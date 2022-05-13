import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca la base: \n -> ");
        int base = scan.nextInt();
        System.out.print("Introduzca el exponente: \n -> ");
        int exponente = scan.nextInt();
        int resultado = base;

        if (exponente != 0) {
            for (int i = 2; i <= exponente; i++) {
                resultado = resultado * base;
            }
        } else {
            resultado = 1;
        }
        System.out.print(base + " elevado a " + exponente + " = " + resultado);
    }
}
