public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    //private Coordenada esquina3;
    //private Coordenada esquina4;

    // Constructor
    //Define una esquina sin usar setters
    //Crea una copia de la coordenada
    public Rectangulo(Coordenada c1) {
        this.esquina1 = new Coordenada(c1);
    }

    // Constructor
    //Define dos esquinas usando setters y se completan las esquinas faltantes
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
        //completarEsquinas();
    }

    //metodos definen 'x' y 'y' en rangos de menor a mayor
    //Se uso min y max en vez de if
    public double[] rangoX() {
        double[] ejeX = new double[2];
        ejeX[0] = Math.min(esquina1.getX(), esquina2.getX()); // se guarda en posicion 0 el x menor
        ejeX[1] = Math.max(esquina1.getX(), esquina2.getX()); // y en posicion 1 el x mayor
        return ejeX;
    }

    public double[] rangoY() {
        double[] ejeY = new double[2];
        ejeY[0] = Math.min(esquina1.getY(), esquina2.getY()); // se guarda en posicion 0 el y menor
        ejeY[1] = Math.max(esquina1.getY(), esquina2.getY()); // y en posicion 1 el y mayor
        return ejeY;
    }

    /*
    /*
    metodo que completa las esquinas del rectangulo
    esquina3 y esquina4 a partir de esquina1 y esquina2
     /
    private void completarEsquinas(){
        //(x1,y1) y (x2,y2) -> (x2,y1) y (x1,y2)
        double x1 = esquina1.getX(); //x1
        double y1 = esquina1.getY(); //y1
        double x2 = esquina2.getX(); //x2
        double y2 = esquina2.getY(); //y2

        //Se completan las esquinas 3 y 4 segun las esquinas 1 y 2
        //(x1,y2)
        this.esquina3 = new Coordenada(x1,y2);
        //(x2,y1)
        this.esquina4 = new Coordenada(x2,y1);
    }
    */

    //métodos setter
    public void setEsquina1(Coordenada c1) {
        this.esquina1 = c1;
    }

    public void setEsquina2(Coordenada c2) {
        this.esquina2 = c2;
    }

    //métodos getter
    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    /*
    //Getters de las esquinas completadas esquina3 y esquina4

    public Coordenada getEsquina3(){
        return esquina3;
    }

    public Coordenada Esquina4(){
        return esquina4;
    }
    */

    public double calculoArea() {
        //area del rectangulo es ancho por alto
        double[] x = rangoX();
        double[] y = rangoY();

        double ancho = x[1] - x[0]; //mayor x menos el menor x
        double alto = y[1] - y[0];  //mayor y menos el menor y

        return ancho * alto;
    }

    public String toString() {
        return "( " + this.esquina1 + ", " + this.esquina2 + ")";
        //return "Rectangulo (Esquina1: " + this.esquina1 + ", Esquina2: " + this.esquina2 + ")";
    }
}
