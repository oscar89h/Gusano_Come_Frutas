import java.awt.*;
import java.util.ArrayList;

public class Gusano extends Entidad {
      private ArrayList<Point> cuerpo;

      private int direccion = Configuracion.DERECHA;

      public Gusano() {
            super(0,0,Configuracion.TAMAÑO, Configuracion.TAMAÑO);

            cuerpo = new ArrayList<>();
            cuerpo.add(new Point(x, y));           
      }

      public void mover() {
            Point cabeza = cuerpo.get(0);

            int nuevoX = cabeza.x + Configuracion.DIRECCIONES[direccion][0] * ancho;
            int nuevoY = cabeza.x + Configuracion.DIRECCIONES[direccion][0] * ancho;
                             
      }


}