import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.plaf.ColorUIResource;

public class Fenetre extends JFrame {

    JPanel panel = new JPanel();
    String nomFenetre;
    int rouge, vert, bleu, x, y;

    public Fenetre(String vFenetre, int r, int v, int b) {

        nomFenetre = vFenetre;
        rouge = r;
        vert = v;
        bleu = b;

        panel.setLayout(null);
        Color couleur = new ColorUIResource(rouge, vert, bleu);
        panel.setBackground(couleur);
        this.setTitle(vFenetre);
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        setContentPane(panel);

    }

    public void disposeFenetre(Fenetre fen) {
        fen.dispose();
    }
}
