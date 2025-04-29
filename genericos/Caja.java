package genericos;
public class Caja <T>{
    //atributos
    T contenido;
    //propiedades
    public T getContenido(){
        return contenido;
    }
    public void setContenido(T contenido){
        this.contenido = contenido;
    }

    @Override
    public String toString(){
        return "Contenido de la caja:"+contenido;
    }

}