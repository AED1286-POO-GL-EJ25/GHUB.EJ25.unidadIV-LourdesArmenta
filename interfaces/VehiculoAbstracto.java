package interfaces;

public abstract class VehiculoAbstracto implements Vehiculo{
    //Atributos
    private String matricula;

    //constructores
    public VehiculoAbstracto(String matricula){
        this.matricula = matricula;
    }

    //propiedad
    public String getMatricula(){
        return this.matricula;
    }

    //metodos en concreto

    @Override
    public void encenderMotor(){
        System.out.println("Motor encendido con matricula: "+matricula);
    }

    @Override
    public void apagarMotor(){
        System.out.println("Motor apagado con matricula: "+matricula);
    }

    //metodo abstracto
    public abstract void conducir();

  
}
