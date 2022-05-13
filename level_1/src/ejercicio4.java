import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resiltado = 1;
        System.out.print("Introduzca un valor: \n -> ");
        int valor = scan.nextInt();

        for(int x = 1; x <= valor; x++){
            resiltado = resiltado * x;
        }
        System.out.println("El factorial de " + valor + "es: " + resiltado);
    }
}
