package abstractas;

public class Circulo extends FiguraGeometrica {
    //atributos
    private double radio;
    //constructor
    public Circulo(double r){
        super("Circulo");
        this.radio = r;
    }

    //metodo personalizado
    @Override
    public double area(){
        //return Math.PI* Math.pow(radio, 2);
        return 3.1416*radio*radio;

    }


    
}
