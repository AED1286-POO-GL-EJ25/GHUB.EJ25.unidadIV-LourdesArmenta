package abstractas;

 public abstract class FiguraGeometrica {
    //atributos
    protected double x;
    protected double y;

    private String nombre;

    //constructores
    public FiguraGeometrica(String nom){
        nombre = nom;
    }


    //metodo abstracto
    public abstract double area();

    //metodo concreto
    public String toString(){
        return nombre +" "+"Area = "+area();
    }


    
}
