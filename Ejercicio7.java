import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {
        //============
        //Ejercicio 7.
        //============

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un valor entero entre 1 y 4");
        int operacion = entrada.nextInt();

        if ((operacion > 4) || (operacion < 0))
        { //limitador valores (entre 1 y 4)
            System.out.println("El valor debe estar entre 1 y 4");
        }else
        {
            if (operacion == 1)
            { // sumar 2 numeros otorgados.
                System.out.println("Has elegido sumar");
                System.out.println("Introduce un número entero");
                int suma1 = entrada.nextInt();
                System.out.println("Introduce otro");
                int suma2 = entrada.nextInt();
                int suma_total = suma1 + suma2;
                System.out.println("El resultado es: " + suma_total);
            }

            if (operacion == 2)
            { // dividir 2 números
                System.out.println("Has elegido dividir");
                System.out.println("Introduce un número entero");
                int div1 = entrada.nextInt();







            }
        }

    }
}
