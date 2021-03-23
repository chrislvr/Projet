public class ToStringSelectionPlayer {
    private String couleur, pseudo;
    Fenetre fen;

    public static String nom, col;

    public ToStringSelectionPlayer() {
    }

    public ToStringSelectionPlayer(String couleur, String pseudo, Fenetre fen) {
        this.couleur = couleur;
        this.pseudo = pseudo;
        this.fen = fen;
    }

    public String toString() {
        String str;

        if (this.pseudo == "") {
            str = "Pseudo : Player \n";
            str += "Couleur : " + couleur;

            this.pseudo = "Player";
            nom = this.pseudo;
            col = this.couleur;

            this.fen.dispose();
            Enchainement.Stage1();

        } else if (this.pseudo != "") {
            str = "Pseudo : " + pseudo + "\n";
            str += "Couleur : " + couleur;

            nom = this.pseudo;
            col = this.couleur;

            this.fen.dispose();
            Enchainement.Stage1();
        } else {
            str = "Erreur";
        }

        return str;

    }

}
