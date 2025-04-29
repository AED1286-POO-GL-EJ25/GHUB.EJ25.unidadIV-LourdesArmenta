package interfaces;

public class Coche extends VehiculoAbstracto{
    public Coche(String matricula){
        super(matricula);
    }
    
    @Override
    public void conducir(){
        System.out.println("El coche se esta conduciento");
    }

 
}
