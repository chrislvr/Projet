import java.awt.Graphics;

import java.awt.Color;

public abstract class Bloc extends Entite {

    public Bloc(Coordonnee c) {
        super(new Hitbox(2, 2), c, 0);

    }

    public Graphics renderBloc(Graphics g, int scaleX, int scaleY) {
        g.drawRect(scaleX * coords.getX(), scaleY * coords.getY(), scaleX * getHitbox().getWidth(),
                scaleY * getHitbox().getHeight());

        g.fillRect(scaleX * coords.getX(), scaleY * coords.getY(), scaleX * getHitbox().getWidth(),
                scaleY * getHitbox().getHeight());
        return g;
    }
}
