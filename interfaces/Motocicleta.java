package interfaces;

public class Motocicleta extends VehiculoAbstracto{

    public Motocicleta(String matricula){
        super(matricula);

    }

    public void conducir(){
        System.out.println("La motocicleta se esta conduciendo");

    }


    
}
