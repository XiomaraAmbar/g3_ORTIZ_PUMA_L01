public class Verificador {

    public static boolean esSobrePos(Rectangulo r1,Rectangulo r2){

        double[] x1 = r1.rangoX();
        double[] y1 = r1.rangoY();
        double[] x2 = r2.rangoX();
        double[] y2 = r2.rangoY();

        // Verifica si los rectángulos se sobreponen
        boolean sobreposicionX = (x1[0] < x2[1]) && (x1[1] > x2[0]);
        boolean sobreposicionY = (y1[0] < y2[1]) && (y1[1] > y2[0]);

        return sobreposicionX && sobreposicionY;
    }

    public static boolean esJunto(Rectangulo r1,Rectangulo r2){

        double[] x1 = r1.rangoX();
        double[] y1 = r1.rangoY();
        double[] x2 = r2.rangoX();
        double[] y2 = r2.rangoY();

        //Se verifica si estan juntos en el eje x o y
        boolean juntosX = (x1[1] == x2[0] || x2[1] == x1[0]) && (y1[1] >= y2[0] && y2[1] >= y1[0]);
        boolean juntosY = (y1[1] == y2[0] || y2[1] == y1[0]) && (x1[1] >= x2[0] && x2[1] >= x1[0]);

        //Verifica si coinciden en una coordenada
        boolean juntosCoordenada =
                (x1[1] == x2[0] && y1[0] == y2[1]) ||  //La esquina inferior derecha de r1 es igual a la esquina superior izquierda de r2
                        (x1[0] == x2[1] && y1[0] == y2[1]) || //La esquina inferior izquierda de r1 es igual a la esquina superior derecha de r2
                        (x1[1] == x2[0] && y1[1] == y2[0]) || //La esquina superior derecha de r1 es igual a la esquina inferior izquierda de r2
                        (x1[0] == x2[1] && y1[1] == y2[0]);   //La esquina superior izquierda de r1 es igual a la esquina inferior derecha de r2

        return juntosX || juntosY || juntosCoordenada;
    }

    public static boolean esDisjunto(Rectangulo r1,Rectangulo r2) {
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);

        /*
        double[] x1 = r1.rangoX();
        double[] y1 = r1.rangoY();
        double[] x2 = r2.rangoX();
        double[] y2 = r2.rangoY();

        return (x1[1] < x2[0] || x2[1] < x1[0] || y1[1] < y2[0] || y2[1] < y1[0]); //Evalua si los rectangulos no estan juntos ni se sobreponen

         */
    }

}

//PRUEBAS DE LOS EJEMPLOS METODO SOBREPONER

        /*
        EJE x:
        CASO 1: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);
        CASO 2: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] > X2[1]);
        CASO 3: (X1[0] > X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);
        CASO 4: (X1[0] == X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] > X2[1]);
        CASO 5: (X1[0] > X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);
        CASO 6: (X1[0] > X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);

        EJE Y:
        CASO 1: (Y1[0] < Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] < Y2[1]);
        CASO 2: (Y1[0] > Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] < Y2[1]);
        CASO 3: (Y1[0] > Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
        CASO 4: (Y1[0] < Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
        CASO 5: (Y1[0] > Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] < Y2[1]);
        CASO 6: (Y1[0] == Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] == Y2[1]);
        */

        //PRUEBAS DE LOS EJEMPLOS METODO ESJUNTO
        /*
        EJE x:
        CASO 1: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] == X2[0] && X1[1] < X2[1]);
        CASO 2: (X1[0] > X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);
        CASO 3: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] == X2[0] && X1[1] < X2[1]);

        EJE Y:
        CASO 1: (Y1[0] < Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] < Y2[1]);
        CASO 2: (Y1[0] > Y2[0] && Y1[0] == Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
        CASO 3: (Y1[0] > Y2[0] && Y1[0] == Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
         */

//PRUEBAS DE LOS EJEMPLOS METODO ESDISJUNTO
/*
        EJE x:
        CASO 1: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] < X2[0] && X1[1] < X2[1]);
        CASO 2: (X1[0] < X2[0] && X1[0] < X2[1] && X1[1] < X2[0] && X1[1] < X2[1]);
        CASO 3: (X1[0] > X2[0] && X1[0] < X2[1] && X1[1] > X2[0] && X1[1] < X2[1]);

        EJE Y:
        CASO 1: (Y1[0] > Y2[0] && Y1[0] < Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
        CASO 2: (Y1[0] < Y2[0] && Y1[0] < Y2[1] && Y1[1] < Y2[0] && Y1[1] < Y2[1]);
        CASO 3: (Y1[0] > Y2[0] && Y1[0] > Y2[1] && Y1[1] > Y2[0] && Y1[1] > Y2[1]);
         */


