import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Vamos a pedir el nombre al usuario
        System.out.println("Introduzca su nombre de usuario:");
        String nombre = input.nextLine();

        //Preguntamos cuantas preguntas tiene
        System.out.println("Introduzca la cantidad de preguntas:");
        int preguntas = input.nextInt();

    }
}