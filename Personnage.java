public class Personnage {

    // Position du personnage
    static int posX_Perso = 50;
    static int posY_Perso = 50;
    static int width_Perso = 30;
    static int height_Perso = 30;

    public Personnage(int x, int y, int w, int h) {
        posX_Perso = x;
        posY_Perso = y;
        width_Perso = w;
        height_Perso = h;
    }

    public static int getPosX() {
        return posX_Perso;
    }

    public static int getPosY() {
        return posY_Perso;
    }

    public static int getPosWidth() {
        return width_Perso;
    }

    public static int getPosHeigth() {
        return height_Perso;
    }

    public static void main(String[] args) {
        new Deplacement().show();
    }

}
