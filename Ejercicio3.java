import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {

        //============
        //Ejercicio 3.
        //============
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tu nota: ");


        if (!entrada.hasNextDouble()) {

            System.out.println("NO PONGAS LETRAS O SÍMBOLOS");
        }else {
            double nota = entrada.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10");
            } else if (nota < 3) {
                System.out.println("Muy deficiente");
            } else if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota < 6) {
                System.out.println("Bien");
            } else if (nota < 9) {
                System.out.println("Notable");


            } else {
                System.out.println("Sobresaliente");
            }
        }



    }
}