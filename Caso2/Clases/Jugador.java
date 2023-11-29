package Caso2.Clases;
import java.util.ArrayList;
import java.util.List;
public class Jugador {

    private Jugador nuevoJugador;
    String nombreJugadorBasket;

    public Jugador(  String nombreJugadorBasket){
        this.nombreJugadorBasket = nombreJugadorBasket;
    }

    public String getNombreJugadorBasket() {
        return nombreJugadorBasket;
    }

    public void setNombreJugadorBasket(String nombreJugadorBasket) {
        this.nombreJugadorBasket = nombreJugadorBasket;
    }
}
