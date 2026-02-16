
import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHora, salarioTotal;

        System.out.print("Digite las horas semanales trabajadas: ");
        horasSemanales = entrada.nextInt();
        System.out.print("Digite el salario que gana por hora: ");
        salarioHora = entrada.nextFloat();

        salarioTotal = horasSemanales * salarioHora;

        System.out.println("\nEl salario semanal es: "+salarioTotal);
    }

}