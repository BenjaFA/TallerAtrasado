package Caso2.Clases;
import java.util.ArrayList;
import java.util.List;
public class EquipoBasketball {
    private String nombre;
    private Jugador capitan;
    private List<Jugador> jugadores;

    public EquipoBasketball(String nombre, Jugador capitan, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.capitan = capitan;
        this.jugadores = jugadores;
    }
}
