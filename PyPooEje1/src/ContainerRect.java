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

    public String toString() {
        StringBuilder sb = new StringBuilder();

        //Cabecera de la impresión (Rectángulo, Coordenadas, Distancia, Área)
        sb.append("Rectángulo\t\tCoordenadas\t\t\t\t\t\t\tDistancia\t\tÁrea\n");

        //Recorrido de los rectángulos almacenados y la impresión de cada uno
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1))  //Número del rectángulo
                    .append("\t\t\t\t")
                    .append(rectangulos[i]) //Coordenadas
                    .append("\t\t\t")
                    .append(String.format("%.3f", distancias[i])) //Distancia formateada
                    .append("\t\t\t")
                    .append(String.format("%.2f", areas[i])) //Área formateada
                    .append("\n");
        }
        return sb.toString();
    }
}