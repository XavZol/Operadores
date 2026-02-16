/* Una Compañia de venta de carros usados, paga a su personal de ventas un salario de $1000
mensuales, más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta 
por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. 
Hacer un programa que calcule e imprima el salario mensual del vendedor. */

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            final int salario = 1000;
            int nCarrosVendidos;
            float costeCarro, salarioTotal;

            System.out.print("Digite el total de carros vendidos: ");
            nCarrosVendidos = entrada.nextInt();
            System.out.print("Digite el coste del carro: ");
            costeCarro = entrada.nextFloat();

            salarioTotal = salario + (nCarrosVendidos * 150) + (0.05f*costeCarro*nCarrosVendidos);

            System.out.println("\nEl salario del empleado es: "+salarioTotal);
    }

}