
import javax.swing.*;

public class Juego {
      public static void main(String[] args) {
            JFrame ventana = new JFrame("Juego Del Gusano"); 
            Tablero tablero = new Tablero();

            // ventana.add(tablero);
            ventana.setSize(Configuracion.ANCHO, Configuracion.ALTO);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.setVisible(true);

            
      }
}