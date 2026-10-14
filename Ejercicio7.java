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
        }
        else
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
                double div1 = entrada.nextDouble();
                System.out.println("Introduce otro");
                double div2 = entrada.nextDouble();

                if ((div1 == 0) || (div2 == 0))
                {
                    System.out.println("No pongas 0");

                }else
                {
                    double cociente = div1 / div2;
                    System.out.println("El resultado es: " + cociente);

                }



            }
            if (operacion == 3)
            {//potencia de un único número
                System.out.println("Has elegido potencia de un número elevado a si mismo");
                System.out.println("Introduce un número entero");
                int pot_u = entrada.nextInt();
                System.out.println( pot_u +" elevado a " + pot_u + " es: "+ Math.pow(pot_u, pot_u));
            }
            if (operacion == 4)
            {//potencia de dos números diferentes
                System.out.println("Has elegido potencia de dos números diferentes");
                System.out.println("Introduce la base");
                int pot1 = entrada.nextInt();
                System.out.println("Introduce el exponente");
                int pot2 = entrada.nextInt();
                if (pot2 > 0)
                {
                    System.out.println( pot1 +" elevado a " + pot2 + " es: "+ Math.pow(pot1, pot2));
                }else
                {//si el exponente es 0
                    if (pot2 == 0)
                    {//por si el exponente vale 0
                        System.out.println("El resultado es 1");

                    }
                    if (pot2 < 0 )
                    {
                        int potencia_negativa = pot2 * -1;
                        System.out.println("El resultado es: 1/"+ Math.pow(pot1, potencia_negativa) );
                    }


                }
            }
        }

    }
}
