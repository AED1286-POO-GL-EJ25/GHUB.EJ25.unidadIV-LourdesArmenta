package abstractas;
public class  TestAnimal{
    public static void main(String[] args) {

        //Animal animal = new Animal(); //esto no es posible
        Animal perro = new Perro();
        Animal gato = new Gato();

        Perro perro1 = new Perro();
        Gato gato1 = new Gato();

        perro.hacerSonido();
        perro.moverse();

        gato.hacerSonido();
        gato.moverse();
        



        
    }

}