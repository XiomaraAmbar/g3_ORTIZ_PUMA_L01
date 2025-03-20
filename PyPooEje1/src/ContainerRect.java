public class ContainerRect {
    private Rectangulo[] rectangulos; //Arreglo que almacena objetos Rectangulos
    private double[] distancias; //Almacena la distancia euclidiana de las coordenadas del rectangulo
    private double[] areas; //se almacena el area del rectangulo
    private int n; //Numero maximo de rectangulos

    private static int numRec = 0; //Contador de rectangulos

    public ContainerRect(int n) {
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
        this.n = n;
    }

    public void addRectangulo(Rectangulo rect){
        if (numRec < n) { // Verifica si hay espacio disponible
            rectangulos[numRec] = rect;
        }
        else{System.out.println("Sin capacidad para mas rectangulos");}
    }


}