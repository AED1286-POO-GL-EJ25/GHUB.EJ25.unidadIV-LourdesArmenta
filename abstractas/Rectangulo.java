package abstractas;

public class Rectangulo extends FiguraGeometrica {
    //atributos
    private double base;
    private double altura;
    //constructor
    public Rectangulo(double b, double h){
        super("Rectangulo");
        this.base = b;
        this.altura = h;

    }

    @Override
    public double area(){
        return base*altura;
    }
    
}
