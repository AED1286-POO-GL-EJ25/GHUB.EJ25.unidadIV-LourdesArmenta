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
    public static double areaPromedio( FiguraGeometrica arr[]){
        double suma=0;
        for(int i=0;i<arr.length;i++){
            suma = suma + arr[i].area();
        }
        return suma/arr.length;

    }


    //metodo concreto
    public String toString(){
        return nombre +" "+"Area = "+area();
    }


    
}
