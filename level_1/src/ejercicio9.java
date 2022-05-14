import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el texto: \n -> ");
        String texto = scan.nextLine();
        System.out.print("Ingrese la letra a buscar: \n -> ");
        String letra = scan.next();
        int contador = 0;
        int posicion = 0;

        posicion = texto.indexOf(letra, posicion);

        while (posicion != -1){
            posicion = texto.indexOf(letra, posicion + 1);
            contador = contador + 1;
        }
        if (contador > 0) {
            System.out.println("Se encontró " + letra + "-> " + contador + " veces.");
        } else {
            System.out.println("No se encontró " + letra + " en el texto.");
        }
    }
}
