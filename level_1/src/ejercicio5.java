import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado = 0;
        System.out.print("Introduzca primer valor: \n -> ");
        int valor_1 = scan.nextInt();
        System.out.print("Introduzca segundo valor: \n -> ");
        int valor_2 = scan.nextInt();

        for(int i = 1; i <= valor_1; i++){
            resultado = resultado + valor_2;
        }
        System.out.print(valor_1 + " x " + valor_2 + " = " + resultado);
    }
}
