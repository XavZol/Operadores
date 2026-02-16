
import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        // Guardamos las tres notas
        System.out.println("Digite las tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3;

        System.out.print("\nEl resultado de la suma es: "+suma);
    }

}