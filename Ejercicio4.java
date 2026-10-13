import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {

        //============
        //Ejercicio 4.
        //============
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un año");
        if (!entrada.hasNextDouble()) {

            System.out.println("NO PONGAS LETRAS O SÍMBOLOS");
        }else {
            int ano = entrada.nextInt();

            if (ano < 0) {
                System.out.println("Introduce un año positivo");
            } else {

                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    System.out.println("Es año bisiesto");
                } else {
                    System.out.println("No es año bisiesto");
                }

            }


        }
    }
}
