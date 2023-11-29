package Caso2.Clases;

public class Jugador {

    private Jugador nuevoJugador;
    String nombreBasket, rutJugador;

    public Jugador(  String nombreBasket, String rutJugador){
        this.nombreBasket = nombreBasket;
        this.rutJugador = rutJugador;
    }

    public String getNombreBasket() {
        return nombreBasket;
    }

    public void setNombreBasket(String nombreBasket) {
        this.nombreBasket = nombreBasket;
    }
}
