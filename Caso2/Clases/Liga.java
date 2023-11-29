package Caso2.Clases;
import java.util.ArrayList;
import java.util.List;
class LigaBasketball {
    List<EquipoBasketball> equipos;

    public LigaBasketball(List<EquipoBasketball> equipos) {
        this.equipos = equipos;
    }
}

public class Liga{
    public static void main(String[] args) {

        List<EquipoBasketball> equipos = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            Jugador capitan = new Jugador("Capitan " + i);
            List<Jugador> jugadores = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                jugadores.add(new Jugador("Jugador " + (5 * (i - 1) + j)));
            }
            equipos.add(new EquipoBasketball("Equipo " + i, capitan, jugadores));
        }


        LigaBasketball liga = new LigaBasketball(equipos);

        // Realizar operaciones con la liga según tus necesidades.
    }
}