package abstractas;

public class Triangulo extends FiguraGeometrica{
    //atributos
    private double base;
    private double altura;
    //constructor
    public Triangulo(double b, double h){
        super("Triangulo");
        this.base = b;
        this.altura = h;
    }

    public double area(){
        return this.base*this.altura/2;
    }
    
    
}
