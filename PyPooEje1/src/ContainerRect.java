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
        if (numRec >= n) { //Si los rectangulos es menor a la capacidad
            System.out.println("Sin capacidad para mas rectangulos");
        }
        else{
            rectangulos[numRec] = rect;
            distancias[numRec] = Coordenada.distancia(rect.getEsquina1(),rect.getEsquina2());
            areas[numRec] = rect.calculoArea();
            numRec++;
            System.out.println("Rectángulo agregado");
        }
    }


}