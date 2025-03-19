import java.sql.SQLOutput;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);

        //PRUEBA COORDENADA
        Coordenada co1 = new Coordenada();
        Coordenada co2 = new Coordenada(2,3);
        Coordenada co3 = new Coordenada(co2);
        Coordenada co4 = new Coordenada(4.5,8.23);

        //Se imprime las coordenadas de prueba
        System.out.println(co1);
        System.out.println(co2);
        System.out.println(co3);
        System.out.println(co4);

        //PRUEBA RECTANGULO
        Rectangulo r1 = new Rectangulo(co1,co3);
        Rectangulo r2 = new Rectangulo(co2,co4);

        //Se imprime los rectangulos de prueba
        System.out.println(r1);
        System.out.println(r2);

        /*ACTIVIDAD DOS:
        Creación de dos objetos rectangulos (A y B)
        */

        //Creación del primer réctangulo
        System.out.println("**** Creación del rectangulo A****");
        System.out.println("Ingrese la coordenada de la primera esquina del rectangulo A: ");
        System.out.print("Coordenada 1: ");
        double ca1 = nuevo.nextDouble(); //Coordenada uno
        System.out.print("Coordenada 2: ");
        double ca2 = nuevo.nextDouble(); //Coordenada dos
        System.out.println("Ingrese la coordenada de la segunda esquina del rectangulo A: ");
        System.out.print("Coordenada 3: ");
        double ca3 = nuevo.nextDouble(); //Coordenada tres
        System.out.print("Coordenada 4: ");
        double ca4 = nuevo.nextDouble(); //Coordenada cuatro

        Coordenada esquinaA1 = new Coordenada(ca1,ca2);
        Coordenada esquinaA2 = new Coordenada(ca3,ca4);

        Rectangulo A = new Rectangulo(esquinaA1,esquinaA2);

        //Creación del segundo réctangulo
        System.out.println("**** Creación del rectangulo B****");
        System.out.println("Ingrese la coordenada de la primera esquina del rectangulo B: ");
        System.out.print("Coordenada 1: ");
        double cb1 = nuevo.nextDouble(); //Coordenada uno
        System.out.print("Coordenada 2: ");
        double cb2 = nuevo.nextDouble(); //Coordenada dos
        System.out.println("Ingrese la coordenada de la segunda esquina del rectangulo B: ");
        System.out.print("Coordenada 3: ");
        double cb3 = nuevo.nextDouble(); //Coordenada tres
        System.out.print("Coordenada 4: ");
        double cb4 = nuevo.nextDouble(); //Coordenada cuatro

        Coordenada esquinaB1 = new Coordenada(cb1,cb2);
        Coordenada esquinaB2 = new Coordenada(cb3,cb4);

        Rectangulo B = new Rectangulo(esquinaB1,esquinaB2);

        //IMPRESION DE LOS RECTANGULOS
        System.out.println("Rectangulo A: "+ A);
        System.out.println("Rectangulo B: "+ B);
    }
}
