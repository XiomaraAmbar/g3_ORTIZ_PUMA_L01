import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
            /*
        ***********************************************************************************
        ACTIVIDAD DOS:
        Creación de dos objetos rectangulos (A y B)
        * *********************************************************************************
        */
        //CREACION DEL CONTENEDOR
        ContainerRect contenedor = new ContainerRect(10); //Capacidad para 10

        //Creación del primer réctangulo
        System.out.println();
        System.out.println("**** Creación del rectangulo A****");
        System.out.print("Ingrese una esquina del 1er rectángulo: " );
        double ca1 = nuevo.nextDouble(); //Coordenada uno
        double ca2 = nuevo.nextDouble(); //Coordenada dos
        System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
        double ca3 = nuevo.nextDouble(); //Coordenada tres
        double ca4 = nuevo.nextDouble(); //Coordenada cuatro

        Coordenada esquinaA1 = new Coordenada(ca1,ca2);
        Coordenada esquinaA2 = new Coordenada(ca3,ca4);

        Rectangulo A = new Rectangulo(esquinaA1,esquinaA2);
        contenedor.addRectangulo(A); //Se agrega al contenedor el rectangulo A creado

        //Creación del segundo réctangulo
        System.out.println();
        System.out.println("**** Creación del rectangulo B****");
        System.out.print("Ingrese una esquina del 2do rectángulo: ");
        double cb1 = nuevo.nextDouble(); //Coordenada uno
        double cb2 = nuevo.nextDouble(); //Coordenada dos
        System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
        double cb3 = nuevo.nextDouble(); //Coordenada tres
        double cb4 = nuevo.nextDouble(); //Coordenada cuatro

        Coordenada esquinaB1 = new Coordenada(cb1,cb2);
        Coordenada esquinaB2 = new Coordenada(cb3,cb4);

        Rectangulo B = new Rectangulo(esquinaB1,esquinaB2);
        contenedor.addRectangulo(B); //Se agrega al contenedor el rectangulo B creado

        //IMPRESION DE LOS RECTANGULOS
        System.out.println();
        mostrarRectangulo(A);
        mostrarRectangulo(B);

        //SE PRUEBA LA CLASE VERIFICADOR
        mostrarInformacionRectangulos(A,B);

        //Se muestran el contenido del contenedor
        System.out.println("*** Contenido del Contenedor ***");
        System.out.println(contenedor);

    }

    //PUNTO 2 PARTE C.1
    //CREAR METODO DE CLASE QUE MUESTRE LA INFORMACIÓN DE CADA RECTÁNGULO
    public static void mostrarRectangulo(Rectangulo r) {
        if (r != null) {
            System.out.println(r.toString());
        } else {
            System.out.println("El rectángulo es nulo.");
        }
    }

    public static void mostrarInformacionRectangulos(Rectangulo r1, Rectangulo r2) {
        System.out.println("\n**** INFORMACIÓN DE LOS RECTÁNGULOS ****");
        System.out.println("Rectángulo A = " + r1);
        System.out.println("Rectángulo B = " + r2);

        System.out.println("\n**** PRUEBA DE LA CLASE VERIFICADOR: ****");
        if (Verificador.esSobrePos(r1, r2)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            System.out.println("Área de sobreposición = " + rectanguloSobre(r1, r2).calculoArea());
        } else if (Verificador.esJunto(r1, r2)) {
            System.out.println("Rectángulos A y B se juntan.");
        } else if (Verificador.esDisjunto(r1, r2)) {
            System.out.println("Rectángulos A y B son disjuntos.");
        }
        System.out.println();
    }

    //PUNTO 2 PARTE C.3.A
    //CREAR METODO DE CLASE rectanguloSobre
    public static Rectangulo rectanguloSobre(Rectangulo A, Rectangulo B) {
        double[] x1 = A.rangoX();
        double[] y1 = A.rangoY();
        double[] x2 = B.rangoX();
        double[] y2 = B.rangoY();

        if (!Verificador.esSobrePos(A, B)) {
            return null;
        }

        /*
        // Definir menorX
    if (x1[0] > x2[0]) {
        menorX = x1[0];
    } else {
        menorX = x2[0];
    }

    // Definir mayorX
    if (x1[1] < x2[1]) {
        mayorX = x1[1];
    } else {
        mayorX = x2[1];
    }

    // Definir menorY
    if (y1[0] > y2[0]) {
        menorY = y1[0];
    } else {
        menorY = y2[0];
    }

    // Definir mayorY
    if (y1[1] < y2[1]) {
        mayorY = y1[1];
    } else {
        mayorY = y2[1];
    }
         */

        double menorX = Math.max(x1[0], x2[0]);
        double mayorX = Math.min(x1[1], x2[1]);
        double menorY = Math.max(y1[0], y2[0]);
        double mayorY = Math.min(y1[1], y2[1]);

        Coordenada nuevaCoor1 = new Coordenada(menorX, menorY);
        Coordenada nuevaCoor2 = new Coordenada(mayorX, mayorY);

        return new Rectangulo(nuevaCoor1, nuevaCoor2);

    }
}