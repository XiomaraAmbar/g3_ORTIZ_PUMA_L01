public class Coordenada {
    private double x;
    private double y;

    //Constructor vacío
    // Crea un nuevo objeto que se inicializa con 0 por defecto
    public Coordenada( ){
        /*
        this.x = 0;
        this.y = 0;
        */
        this(0,0);
    }

    //Constructor
    //Crea un punto con valores específicos
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Constructor
    //Copia coordenadas
    public Coordenada(Coordenada c){
        this(c.x,c.y);
    }

    //métodos setter
    void setX(double x) {
        this.x = x;
    }

    void setY(double y){
        this.y = y;
    }

    //métodos getter
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

}
