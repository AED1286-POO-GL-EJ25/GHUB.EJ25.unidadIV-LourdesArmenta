package interfaces;

public class Dog implements Animal{
    
    @Override
    public void makeSound(){
        System.out.println("gua gua");
    }
    @Override
    public void move(){
        System.out.println("El perro se mueve");
    }
}
