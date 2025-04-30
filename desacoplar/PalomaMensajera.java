package desacoplar;
public class PalomaMensajera extends Paloma implements Comunicador{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("La paloma mensajera ha enviado el mensaje: "+mensaje);
        
    }

    
}