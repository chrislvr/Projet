import java.awt.Frame;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.Timer;

public class Deplacement extends Frame implements KeyListener, ActionListener {

    // New Player
    Player p = new Player(new Hitbox(30, 30), new Coordonnee(425, 558), "name", 10);

    // Vitesse du personnage
    int vel = 8;
    int amplitude = 20;

    final int height = 700;
    final int width = 1000;
    final Timer saut = new Timer(100, this);
    int cpt = 0;

    //
    Stage stage;

    public Deplacement(Stage s) {
        stage = s;
        setSize(1185, 670);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch (keyCode) {
        case KeyEvent.VK_UP:
            p.getCoordonnee().setY(p.getCoordonnee().getY() - vel);
            System.out.println(p.getCoordonnee().getX() + ", " + p.getCoordonnee().getY());
            // Le saut marche mais il est bloqué pour l'instant pour pouvoir
            // résoudre un pb d'affichage -> actualisation des obstacles

            // Plutot que de générer les obstacles a chaques mouvements il
            // faudra qu'ils soient générer une seule fois au début (fluidité du jeu)

            // saut.setActionCommand("Saut");
            // saut.stop();
            // saut.start();
            // cpt = 0;
            break;
        case KeyEvent.VK_DOWN:
            p.getCoordonnee().setY(p.getCoordonnee().getY() + vel);
            System.out.println(p.getCoordonnee().getX() + ", " + p.getCoordonnee().getY());
            break;
        case KeyEvent.VK_LEFT:
            p.getCoordonnee().setX(p.getCoordonnee().getX() - vel);
            System.out.println(p.getCoordonnee().getX() + ", " + p.getCoordonnee().getY());
            break;
        case KeyEvent.VK_RIGHT:
            p.getCoordonnee().setX(p.getCoordonnee().getX() + vel);
            System.out.println(p.getCoordonnee().getX() + ", " + p.getCoordonnee().getY());
            break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Saut")) {
            if (cpt <= amplitude) {

                if (cpt < amplitude / 2) {
                    // UTILISER LES COLLISIONS
                    // if ((y < h) || (y > height - h)) {
                    // t = -t;
                    // }

                    p.getCoordonnee().setY(p.getCoordonnee().getY() - vel);

                    vel--;

                    // System.out.println("y = " + y + " - t = " + t);
                } else if (cpt >= amplitude / 2) {
                    // UTILISER LES COLLISIONS
                    // if ((y < h) || (y > height - h)) {
                    // t = -t;
                    // }
                    vel++;
                    p.getCoordonnee().setY(p.getCoordonnee().getY() + vel);
                }
                cpt++;
                repaint();
                System.out.println(vel);
            }
        }
    }

}

// Le code est inspiré de :
// https://waytolearnx.com/2020/05/keylistener-java.html
// https://youtu.be/9sKY5_3HtUc
// https://waytolearnx.com/2020/05/comment-tracer-des-lignes-rectangles-et-cercles-dans-jframe.html