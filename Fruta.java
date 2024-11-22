import java.awt.*;
import java.util.Random;

public class Fruta extends Entidad {
      public Fruta() {
            super(0,0,Configuracion.TAMANO, Configuracion.TAMANO);
            regenerar();
      }

      public void regenerar() {
            Random rand = new Random();
            x = rand.nextInt(Configuracion.ANCHO / ancho) * ancho;
            y = rand.nextInt(Configuracion.ALTO / alto) * alto;
      }


      @Override
            public void dibujar(Graphics g) {
                  g.setColor(Color.RED);
                  g.fillOval(x, y, ancho, alto);
            }
}