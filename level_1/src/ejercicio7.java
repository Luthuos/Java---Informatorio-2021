import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese palabra \n ->");
        String palabra = scan.nextLine();

        char palabraArray[] = palabra.toCharArray();

        for (int i = 0; i<palabraArray.length; i++){
            if (palabraArray[i] >= 'a' && palabraArray[i] <= 'z'){
                palabraArray[i] = (char) ((int) palabraArray[i] - 32);
            }
        }

        for (int i = 0; i < palabraArray.length; i++) {
            System.out.print(palabraArray[i]);
        }
    }
}
