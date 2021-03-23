import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Enchainement {

    public static int init = 1;

    public static void ChoixPerso() {
        Fenetre fen = new Fenetre("Choix du personnage", 0, 0, 0);
        Texte text = new Texte("<html><center>Choix du personnage", 260, 75, 500, 100, 50, "Cambria");
        fen.add(text);

        Bouton bouton1 = new Bouton("<html><center>Selection du personnage", 400, 450, 200, 60);
        fen.panel.add(bouton1);
        fen.setContentPane(fen.panel);
        bouton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                SelectionPlayer sp = new SelectionPlayer(null, "Selection personnage", true, fen);
                ToStringSelectionPlayer infoToString = sp.showSelectionPlayer();
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(null, infoToString.toString(), "Selection personnage",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Bouton bouton2 = new Bouton("<html><center>Retour Page d'accueil", 100, 450, 200, 60);
        fen.panel.add(bouton2);
        fen.setContentPane(fen.panel);
        bouton2.addActionListener(e -> {
            fen.dispose();
        });

        Bouton bouton3 = new Bouton("<html><center>Regles du jeu", 700, 450, 200, 60);
        fen.panel.add(bouton3);
        fen.setContentPane(fen.panel);
        bouton3.addActionListener(e -> {
            fen.dispose();
        });

    }

    public static void Stage1() {
        try {
            Stage s = new Stage(new File("../Ressources/Niveau1.txt"), new File("../Ressources/Niveau1_objets.txt"));
            s.toFrame().show();
            init = 2;
        } catch (IOException ioException) {

        }
    }

    public static void Stage2() {
        try {
            Stage s = new Stage(new File("../Ressources/Niveau2.txt"), new File("../Ressources/Niveau2_objets.txt"));
            s.toFrame().show();
            init = 3;
        } catch (IOException ioException) {

        }
    }

    public static void Stage3() {
        try {
            Stage s = new Stage(new File("../Ressources/Niveau3.txt"), new File("../Ressources/Niveau3_objets.txt"));
            s.toFrame().show();
            init = 4;
        } catch (IOException ioException) {

        }
    }

    public static void Stage4() {
        try {
            Stage s = new Stage(new File("../Ressources/Niveau4.txt"), new File("../Ressources/Niveau4_objets.txt"));
            s.toFrame().show();
        } catch (IOException ioException) {

        }
    }
}
