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

    //metodo de instancia que calcula la distancia euclideana
    public double distancia(Coordenada c){
        return Math.sqrt((this.x - c.x) * (this.x - c.x) + (this.y - c.y) * (this.y - c.y));
    }
    /* También podria usarse
    Math.sqrt(Math.pow(this.x - c.x,2) + Math.pow(this.y - c.y,2));
    seria mejor usarlo si el exponente fuera variable,
    pero como es el caso de la distancia euclideana el exponente siempre sera 2
     */

    //metodo de clase que calcula la distancia euclideana
    public static double distancia(Coordenada c1, Coordenada c2){
        return Math.sqrt((c1.x - c2.x) * (c1.x - c2.x) + (c1.y - c2.y) * (c1.y - c2.y));
        //Math.sqrt(Math.pow(c1.x - c2.x,2) + Math.pow(c1.y - c2.y, 2));
    }

    //metodo que devuelve los valores de una coordenada
    public String toString(){
        return "[" + this.x + ", " + this.y + "]";
        //return "Coordenada (x: " + this.x + ", Y: " + this.y + ")";
    }
}