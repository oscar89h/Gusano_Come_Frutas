
import java.awt.*;

public class Puntaje {
      private int puntos;

      public Puntaje() {
            puntos = 0;
      }

      public void incrementar() {
            puntos++;
      }

      public int getPuntos() {
            return puntos;
      }

      public void dibujar(Graphics g) {
                  g.setColor(Color.WHITE);
                  g.drawString("Puntaje: " + puntos, 10,10);
      }
}