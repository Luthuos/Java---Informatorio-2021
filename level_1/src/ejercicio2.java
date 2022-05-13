import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado;

        System.out.println("ingrese primer valor:");
        int val_1 = scan.nextInt();
        System.out.println("ingrese segundo valor:");
        int val_2 = scan.nextInt();

        resultado = val_1 + val_2;
        System.out.println(val_1 + "+" + val_2 + "=" + resultado);

        resultado = val_1 - val_2;
        System.out.println(val_1 + "-" + val_2 + "=" + resultado);

        resultado = val_1 * val_2;
        System.out.println(val_1 + "*" + val_2 + "=" + resultado);

        resultado = val_1 / val_2;
        System.out.println(val_1 + "/" + val_2 + "=" + resultado);

        resultado = val_1 % val_2;
        System.out.println(val_1 + "%" + val_2 + "=" + resultado);
    }
}
