import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        //============
        //Ejercicio 6.
        //============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce las horas");

        System.out.println("Introduce los minutos");

        System.out.println("Introduce los segundos");

        if (!entrada.hasNextInt()) {

            System.out.println("NO PONGAS LETRAS O SÍMBOLOS");
        } else {
            int hora = entrada.nextInt();
            int minutos = entrada.nextInt();
            int segs = entrada.nextInt();
            if ((hora > 23) || (hora < 0) || (minutos < 0) || (minutos > 59) || (segs < 0) || (segs > 59)) {
                System.out.println("formato de hora inválido");
            } else {
                segs++;
                if (segs == 60) {
                    segs = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        hora++;
                        if (hora == 24) {
                            hora = 0;
                        }

                    }

                }
                System.out.println("Tras un segundo:" + hora + ":" + minutos + ":" + segs);




            }
        }


    }
}