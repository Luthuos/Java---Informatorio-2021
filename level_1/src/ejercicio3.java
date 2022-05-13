import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un valor:");
        int valor = scan.nextInt();

        for (int i = 1; i <= valor; i++){
            for (int x = 1; x <= i; x++){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
