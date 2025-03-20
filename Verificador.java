public class Verificador {
    public static boolean esSobrePos(Rectangulo r1,Rectangulo r2){
        double[] x1 = r1.definiendoX();
        double[] y1 = r1.definiendoY();
        double[] x2 = r2.definiendoX();
        double[] y2 = r2.definiendoY();

        // Verifica si los rectángulos se sobreponen
        boolean sobreposicionX = (x1[0] <= x2[1]) && (x1[1] >= x2[0]);
        boolean sobreposicionY = (y1[0] <= y2[1]) && (y1[1] >= y2[0]);

        return sobreposicionX && sobreposicionY;
    }

    /*public static boolean esJunto(Rectangulo r1,Rectangulo r2){
    }

    public static boolean esDisjunto(Rectangulo r1,Rectangulo r2) {
    }*/
}