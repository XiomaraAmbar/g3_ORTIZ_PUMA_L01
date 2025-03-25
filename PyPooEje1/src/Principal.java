import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
        //Se pide la capacidad del contenedor
        System.out.print("Ingrese la cantidad máxima de rectángulos a almacenar: ");
        int capacidad = nuevo.nextInt();
        ContainerRect contenedor = new ContainerRect(capacidad); //Se crea el contenedor

        //Se usa un bucle para pedir rectángulos hasta que el contenedor esté lleno
        while (contenedor.getNumRec() < capacidad) {
            System.out.println("\n**** Creación del rectángulo ****");
            System.out.print("Ingrese una esquina del rectángulo: ");
            double x1 = nuevo.nextDouble();
            double y1 = nuevo.nextDouble();
            System.out.print("Ingrese la esquina opuesta del rectángulo: ");
            double x2 = nuevo.nextDouble();
            double y2 = nuevo.nextDouble();

            //Se crean las coordenadas y el rectángulo
            Coordenada esquina1 = new Coordenada(x1, y1);
            Coordenada esquina2 = new Coordenada(x2, y2);
            Rectangulo rectanguloNuevo = new Rectangulo(esquina1, esquina2);

            //Se agrega el rectángulo al contenedor
            contenedor.addRectangulo(rectanguloNuevo);
        }

        // Se muestran los rectángulos almacenados
        System.out.println("\n*** Contenido del Contenedor ***");
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
        System.out.println("\nRectángulo A = " + r1);
        System.out.println("Rectángulo B = " + r2);

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
