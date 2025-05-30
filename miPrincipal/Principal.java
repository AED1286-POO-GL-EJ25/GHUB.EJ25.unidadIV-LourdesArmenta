package miPrincipal;
import fecha.*;

import abstractas.FiguraGeometrica;

import org.junit.platform.console.shadow.picocli.CommandLine.Help.ColorScheme;

import abstractas.Circulo;
import abstractas.Rectangulo;
import abstractas.Triangulo;

import interfaces.Dog;
import interfaces.Cat;

import interfaces.Vehiculo;
import interfaces.Coche;
import interfaces.Camion;
import interfaces.Motocicleta;

import genericos.Caja;

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

        //probas clases abstractas

        //FiguraGeometrica fg = new FiguraGeometrica() ; //No es posible porque es abstracta
        Circulo c = new Circulo(2.5);
        Rectangulo r = new Rectangulo(10,3);
        Triangulo t =  new Triangulo(3.33,6);

        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(t.toString());

        //probar el polimorfismo
        c = new Circulo(23);
        r = new  Rectangulo(12,4);
        t = new Triangulo(2,5);

        System.out.println();
        System.out.println(c);
        System.err.println(r);
        System.out.println(t);

        FiguraGeometrica arreglo2[] ={ c, // 1661.9064
                                       r, //48
                                       t //5

                                     }; //1757.85

        double prom = FiguraGeometrica.areaPromedio(arreglo2);
        System.out.println("Promedio = "+prom);

        //probar interfases

        interfaces.Animal miAnimal = new Dog();

        miAnimal.makeSound();
        miAnimal.move();

        miAnimal = new Cat();

        miAnimal.makeSound();
        miAnimal.move();

        Vehiculo coche = new Coche("MatriculaAWE");
        Vehiculo camion = new Camion("MatriculaCamion");
        Vehiculo motocicleta = new Motocicleta("MatriculaMotoDFF");

        coche.encenderMotor();
        coche.apagarMotor();
        coche.conducir();

        camion.encenderMotor();
        camion.apagarMotor();
        camion.conducir();

        motocicleta.apagarMotor();
        motocicleta.encenderMotor();
        motocicleta.conducir();

        Caja<String> miCajaString = new Caja<>();
        miCajaString.setContenido("Luis Lopez");

        Caja<Integer> miCajaEntera = new Caja<>();
        miCajaEntera.setContenido(100);

        Caja<Double> miCajaDoble = new Caja<>();
        miCajaDoble.setContenido(3.1416);

        System.out.println(miCajaString);
        System.out.println(miCajaEntera);
        System.out.println(miCajaDoble);

        Caja<Animal> miCajaAnimal = new Caja<>();
        miCajaAnimal.setContenido(new Animal());
        System.out.println(miCajaAnimal);



        



      





    }
}