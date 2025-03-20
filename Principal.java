import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
        /*

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
        System.out.println("**** RECTANGULOS DE PRUEBA ****");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println();

         */

        /*
        ***********************************************************************************
        ACTIVIDAD DOS:
        Creación de dos objetos rectangulos (A y B)
        * *********************************************************************************
        */
/*
        //Creación del primer réctangulo
        System.out.println();
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
        System.out.println();
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
        System.out.println();
        System.out.println("Rectangulo A: "+ A);
        System.out.println("Rectangulo B: "+ B);

        //SE PRUEBA LA CLASE VERIFICADOR
        System.out.println();
        System.out.println("**** PRUEBA DE LA CLASE VERIFICADOR: ****");
        System.out.println("¿Rectangulo B se sobrepone a rectangulo A?: " + Verificador.esSobrePos(A,B));
        System.out.println();
*/

        //PRUEBAS DE LOS EJEMPLOS (todos tienen que ser true)
        //PRUEBA EJEMPLO 1
        Coordenada p1 = new Coordenada(2,4);
        Coordenada p2 = new Coordenada(4,1);
        Coordenada p3 = new Coordenada(5,6);
        Coordenada p4 = new Coordenada(3,3);
        Rectangulo p1A = new Rectangulo(p1,p2);
        Rectangulo p1B = new Rectangulo(p3,p4);
        System.out.println("PRUEBA EJEMPLO 1 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p1A,p1B)); //TRUE
        System.out.println();

        //PRUEBA EJEMPLO 2
        Coordenada p5 = new Coordenada(6,4);
        Coordenada p6 = new Coordenada(3,2);
        Coordenada p7 = new Coordenada(4,5);
        Coordenada p8 = new Coordenada(5,1);
        Rectangulo p2A = new Rectangulo(p5,p6);
        Rectangulo p2B = new Rectangulo(p7,p8);
        System.out.println("PRUEBA EJEMPLO 2 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p2A,p2B)); //TRUE
        System.out.println();

        //PRUEBA EJEMPLO 3
        Coordenada p9 = new Coordenada(5,5);
        Coordenada p10 = new Coordenada(3,3);
        Coordenada p11 = new Coordenada(2,4);
        Coordenada p12 = new Coordenada(6,2);
        Rectangulo p3A = new Rectangulo(p9,p10);
        Rectangulo p3B = new Rectangulo(p11,p12);
        System.out.println("PRUEBA EJEMPLO 3 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p3A,p3B)); //TRUE
        System.out.println();

        //PRUEBA EJEMPLO 4
        Coordenada p13 = new Coordenada(1,9);
        Coordenada p14 = new Coordenada(4,5);
        Coordenada p15 = new Coordenada(3,8);
        Coordenada p16 = new Coordenada(1,6);
        Rectangulo p4A = new Rectangulo(p13,p14);
        Rectangulo p4B = new Rectangulo(p15,p16);
        System.out.println("PRUEBA EJEMPLO 4 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p4A,p4B)); //TRUE
        System.out.println();


        //PRUEBA EJEMPLO 5
        Coordenada p17 = new Coordenada(7,4);
        Coordenada p18 = new Coordenada(8,2);
        Coordenada p19 = new Coordenada(9,6);
        Coordenada p20 = new Coordenada(5,1);
        Rectangulo p5A = new Rectangulo(p17,p18);
        Rectangulo p5B = new Rectangulo(p19,p20);
        System.out.println("PRUEBA EJEMPLO 5 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p5A,p5B)); //TRUE
        System.out.println();

        //PRUEBA EJEMPLO 6
        Coordenada p21 = new Coordenada(7,9);
        Coordenada p22 = new Coordenada(9,7);
        Coordenada p23 = new Coordenada(10,9);
        Coordenada p24 = new Coordenada(5,7);
        Rectangulo p6A = new Rectangulo(p21,p22);
        Rectangulo p6B = new Rectangulo(p23,p24);
        System.out.println("PRUEBA EJEMPLO 6 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(p6A,p6B)); //TRUE
        System.out.println();

        //PRUEBAS DE LOS EJEMPLOS (todos tienen que ser False)
        //PRUEBA EJEMPLO 1
        Coordenada pe1 = new Coordenada(2,4);
        Coordenada pe2 = new Coordenada(4,1);
        Coordenada pe3 = new Coordenada(6,6);
        Coordenada pe4 = new Coordenada(7,5);
        Rectangulo pe1A = new Rectangulo(pe1,pe2);
        Rectangulo pe1B = new Rectangulo(pe3,pe4);
        System.out.println("PRUEBA EJEMPLO ERROR 1 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(pe1A,pe1B)); //FALSE
        System.out.println();

        //PRUEBA EJEMPLO 2
        Coordenada pe5 = new Coordenada(6,4);
        Coordenada pe6 = new Coordenada(3,2);
        Coordenada pe7 = new Coordenada(1,7);
        Coordenada pe8 = new Coordenada(2,6);
        Rectangulo pe2A = new Rectangulo(pe5,pe6);
        Rectangulo pe2B = new Rectangulo(pe7,pe8);
        System.out.println("PRUEBA EJEMPLO ERROR 2 DE LA CLASE VERIFICADOR: " + Verificador.esSobrePos(pe2A,pe2B)); //FALSE
        System.out.println();

    }
}
