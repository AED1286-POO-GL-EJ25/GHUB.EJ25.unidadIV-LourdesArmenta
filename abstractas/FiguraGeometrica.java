package abstractas;

 public abstract class FiguraGeometrica {
    //atributos
    protected double x;
    protected double y;

    //metodo abstracto
    public abstract double area();

    //metodo concreto
    public String toString(){
        return "Area = "+area();
    }


    
}
