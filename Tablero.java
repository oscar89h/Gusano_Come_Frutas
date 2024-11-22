
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tablero extends JPanel implements ActionListener {
      private Gusano gusano;
      private Fruta fruta;
      private Puntaje puntaje;
      private Timer timer;

      public Tablero() {
            setBackground(Color.BLACK);
            setFocusable(true);

            gusano = new Gusano();
            fruta = new Fruta();
            puntaje = new Puntaje();

            addKeyListener(new Controlador(gusano));

            timer = new Timer(Configuracion.VELOCIDAD, this);
      }

      public void iniciarJuego() {
            timer.start();
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            gusano.mover();
            if(gusano.comer(fruta)) {
                  fruta.regenerar();
                  puntaje.incrementar();
            }

            if(gusano.colisiona()) {
                  timer.stop();

                  JOptionPane.showMessageDialog(this, "Game Over, Puntaje9 " + puntaje.getPuntos());
            }

            repaint();
      }


           

}