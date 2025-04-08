package miPrincipal;
import fecha.*;

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

        //probamos con objetos tipo Fecha
        Fecha fec = new FechaDetallada("25/2/2025"); //aplicamos polimorfmismo

        Object obj = new FechaDetallada(3,12,2025);

        Fecha fec1 = new Fecha("7/4/2025");

        //imprimimos las tres fechas
        System.out.println("fec = "+fec);
        System.out.println("obj = "+obj);
        System.out.println("fec1 = "+fec1);

        Object arr[] = { new Fecha("2/10/1970"),
                         new FechaDetallada("23/12/1948"),
                         new String("Esto es una cadena"),
                         new Integer(34),
                         new FechaDetallada(8,4,2025)
                        };
        //como el metodo es estatico lo invocamos a traves de la clase 
        MuestraConjunto.mostrar(arr);












        
    }
}