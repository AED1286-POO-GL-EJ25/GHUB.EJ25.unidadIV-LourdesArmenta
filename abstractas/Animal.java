package abstractas;
public abstract class Animal{
    public abstract void hacerSonido(); //método abstracto

    public void moverse(){ //método concreto
        System.out.println("El animal se mueve");
    }

}