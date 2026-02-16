/*Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres */

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.print("Digite la cantidad de dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo+luis)/2;

        total = guillermo+luis+juan;

        System.out.println("\nLa cantidad de dinero entre los 3 es: "+total);
    }

}