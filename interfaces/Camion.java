package interfaces;

public class Camion extends VehiculoAbstracto{

    public Camion(String matricula){
        super(matricula);
    }

    @Override
    public void conducir(){
        System.out.println("El camion se esta conduciento");
    }
    
}
