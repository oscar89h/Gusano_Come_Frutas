//import java.awt.Rectangle;
import java.awt.*;




public abstract class Entidad {
      protected int x, y, ancho, alto;


      public Entidad(int x, int y, int ancho, int alto) {
            this.x = x;
            this.y = y; 
            this.ancho = ancho;
            this.alto  = alto;
      }


      public abstract void dibujar (Graphics g);

      public Rectangle getBounds() {
            return new Rectangle(x,y,ancho,alto);
      }
      
}