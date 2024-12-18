import java.awt.*;
import java.util.ArrayList;

public class Gusano extends Entidad {
      private ArrayList<Point> cuerpo;

      private int direccion = Configuracion.DERECHA;

      public Gusano() {
            super(0, 0, Configuracion.TAMANO, Configuracion.TAMANO);

            cuerpo = new ArrayList<>();
            cuerpo.add(new Point(x, y));
      }

      public void mover() {
            Point cabeza = cuerpo.get(0);

            int nuevoX = cabeza.x + Configuracion.DIRECCIONES[direccion][0] * ancho;
            int nuevoY = cabeza.y + Configuracion.DIRECCIONES[direccion][1] * alto;

            cuerpo.add(0, new Point(nuevoX, nuevoY));
            cuerpo.remove(cuerpo.size() - 1);

      }

      public void cambiarDireccion (int nuevaDireccion) {
            if(nuevaDireccion != (direccion + 2) % 4 ) {
               direccion = nuevaDireccion;
            }
      }

      public boolean comer(Fruta fruta) {
            if (getBounds().intersects(fruta.getBounds())) {
                  cuerpo.add(new Point(-1, -4));
                  return true;
            }

            return false;
      }

      public boolean colisiona() {
            Point cabeza = cuerpo.get(0);

            for (int i = 0; i < cuerpo.size(); i++) {
                  if (cabeza.equals(cuerpo.get(i)))
                        return true;
            }

            return cabeza.x < 0 || cabeza.y < 0 ||
                        cabeza.x >= Configuracion.ANCHO ||
                        cabeza.y >= Configuracion.ALTO;
      }

      @Override
      public void dibujar(Graphics g) {
            g.setColor(Color.GREEN);

            for (Point Segmento : cuerpo) {
                  g.fillRect(Segmento.x, Segmento.y, ancho, alto);
            }
      }
}
