import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        //============
        //Ejercicio 5.
        //============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        System.out.println("Introduce el segundo número");

        System.out.println("Introduce el tercer número");

        if (!entrada.hasNextInt()) {

            System.out.println("NO PONGAS LETRAS O SÍMBOLOS");
        } else {
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            int c = entrada.nextInt();
            if (a <= b) {
                if (b <= c) {
                    System.out.println(a + "," + b + "," + c);
                } else {
                    if (a <= c) {
                        System.out.println(a + "," + c + "," + b);
                    } else {
                        System.out.println(c + "," + a + "," + b);
                    }


                }


            } else {
                if (a <= c) {
                    System.out.println(b + "," + a + "," + c);
                } else {
                    if (b <= c) {
                        System.out.println(b + "," + c + "," + a);

                    } else {
                        System.out.println(c + "," + b + "," + a);
                    }


                }
            }


        }
    }
}