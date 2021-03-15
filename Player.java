import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entite {
    private int score;
    private String name;

    public Player(Hitbox h, Coordonnee c, String name, int ms) {
        super(h, c, ms);
        this.name = name;
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public void incrementScoreByX(int x) {
        this.score += x;
    }

    public void decrementScoreByX(int x) {
        if (this.score <= x) {
            this.score = 0;
        } else {
            this.score -= x;
        }
    }

    public String getName() {
        return this.name;
    }

    public Graphics renderPlayer(Graphics g, int scaleX, int scaleY) {
        g.drawRect(scaleX * coords.getX(), scaleY * coords.getY(), scaleX * getHitbox().getWidth(),
                scaleY * getHitbox().getHeight());

        g.setColor(Color.BLACK);

        g.fillRect(scaleX * coords.getX(), scaleY * coords.getY(), scaleX * getHitbox().getWidth(),
                scaleY * getHitbox().getHeight());
        return g;
    }

}
