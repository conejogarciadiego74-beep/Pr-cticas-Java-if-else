import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //============
        //Ejercicio 1.
        //============
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer valor: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo valor: ");
        int num2 = entrada.nextInt();

        System.out.print("Introduce el tercer valor: ");
        int num3 = entrada.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;

        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;

        } else {
            mayor = num3;

        }
        System.out.println("El mayor de los tres valores es: " + mayor);

    }
}