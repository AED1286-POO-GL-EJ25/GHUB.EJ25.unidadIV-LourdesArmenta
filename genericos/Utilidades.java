package genericos;
public class Utilidades{
    public static <T> void imprimirArray(T []array){
        for (T elemento: array){
            System.out.print(elemento+ " ");

        }
        System.out.println();
        


    }

}