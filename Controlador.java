import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controlador extends KeyAdapter {
    private Gusano gusano;

    public Controlador(Gusano gusano) {
        this.gusano = gusano;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) gusano.cambiarDireccion(Configuracion.ARRIBA);
        if (key == KeyEvent.VK_DOWN) gusano.cambiarDireccion(Configuracion.ABAJO);
        if (key == KeyEvent.VK_LEFT) gusano.cambiarDireccion(Configuracion.IZQUIERDA);
        if (key == KeyEvent.VK_RIGHT) gusano.cambiarDireccion(Configuracion.DERECHA);
    }
}
