package miPrincipal;


public class Principal {
    

    public static void main(String[] args) {
        Animal animales[] = new Animal[4];
        animales[0] = new Animal();
        animales[1] = new Perro();
        animales[2] = new Gato();
        animales[3] = new Pajaro();

        int enteros[] = new int[2];
        enteros[0] = 5;
        //enteros[1] = "Maria"; esto no es posible
        //enteros[1] = 5.2;
        enteros[1] = (int)5.2;

        Animal animal1;
        Perro perro1 = new Perro();
        animal1 = perro1; //conversion automatica
        //perro1 = animal1; //no se permite
        perro1 = (Perro) animal1; //conversion explicita

        for(int i=0; i<animales.length;){
            animales[i++].hacerSonido();
        }









        
    }
}