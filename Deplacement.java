// Le code est inspiré de :
// https://waytolearnx.com/2020/05/keylistener-java.html
// https://youtu.be/9sKY5_3HtUc
// https://waytolearnx.com/2020/05/comment-tracer-des-lignes-rectangles-et-cercles-dans-jframe.html
// Code réalisé par ROUX Amandine

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Deplacement extends Frame implements KeyListener {

    // Position du personnage
    int x = Personnage.getPosX();
    int y = Personnage.getPosY();
    int w = Personnage.getPosWidth();
    int h = Personnage.getPosHeigth();

    Personnage p = new Personnage(x, y, w, h);

    // Vitesse du personnage
    int vel = 10;

    public Deplacement() {
        setSize(1000, 700);
        setBackground(Color.GRAY);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics personnage) {
        personnage.drawRect(x, y, w, h);
        personnage.setColor(Color.ORANGE);
        personnage.fillRect(x, y, w, h);
    }

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y = y - vel;
                break;
            case KeyEvent.VK_DOWN:
                y = y + vel;
                break;
            case KeyEvent.VK_LEFT:
                x = x - vel;
                break;
            case KeyEvent.VK_RIGHT:
                x = x + vel;
                break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
    }

}