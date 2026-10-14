import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        //============
        //Ejercicio 8 .
        //============

        Scanner entrada = new Scanner(System.in);
        //definimos el día de hoy (cuando lo leas no será hoy)
        int dia_actual = 14;
        int mes_actual = 10;
        int ano_actual = 2026;

        // nos introducen los valores del dia de nacimiento
        System.out.println("Introduce tu año de nacimiento: ");
        int ano_otorgado = entrada.nextInt();
        System.out.println("Introduce tu mes de nacimiento: ");
        int mes_otorgado = entrada.nextInt();
        System.out.println("Introduce tu día de nacimiento");
        int dia_otorgado = entrada.nextInt();

        // ahora voy a crear un condicional que no me permita meter numeros < 1 y > 31
        if (dia_otorgado < 1 || dia_otorgado > 31)
        {
            System.out.println("Día no válido");
        }else
        {
            //SECCIÓN DEDICADA A LOS CASOS ESPECIALES POR LOS QUE LOS MESES TIENEN MENOS DÍAS
            if ((mes_otorgado == 4 || mes_otorgado == 6 || mes_otorgado == 9 || mes_otorgado == 11) && (dia_otorgado == 31))
            {// aquí hago un condicional para no permitir valores iguales a 31 si cae en un mes con 30 días
                System.out.println("Día no válido");
            }
            if  ((ano_otorgado % 4 == 0 && ano_otorgado % 100 != 0 || ano_otorgado % 400 == 0) && (mes_otorgado == 2 && dia_otorgado > 29))
            {// hago una limitación para los años bisiestos porque entonces febrero puede tener 29 días
                System.out.println("Día no válido");
            }else
            {
                if (mes_otorgado == 2 && dia_otorgado > 28)
                {// lo hacemos para los feberos "normales"
                    System.out.println("Día no válido");
                }
            }
            // SECCIÓN DEDICADA AL RESTO DE MESES (ya hago la resta para sacar la edad exacta)
            if (mes_otorgado == 1 || mes_otorgado == 3 || mes_otorgado == 5 || mes_otorgado == 7 || mes_otorgado == 8 || mes_otorgado == 10 || mes_otorgado == 12 ||)
            {



            }
        }



    }
}