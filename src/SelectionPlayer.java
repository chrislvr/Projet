import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelectionPlayer extends JDialog {
    private ToStringSelectionPlayer infoToString = new ToStringSelectionPlayer();
    private boolean sendData;
    private JLabel pseudoLabel, couleurLabel;
    private JComboBox couleur;
    private JTextField pseudo;
    Fenetre fen;

    public SelectionPlayer(JFrame parent, String title, boolean modal, Fenetre f) {
        super(parent, title, modal);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        fen = f;
        this.initComponent();
    }

    public ToStringSelectionPlayer showSelectionPlayer() {
        this.sendData = false;
        this.setVisible(true);
        return this.infoToString;
    }

    private void initComponent() {

        // couleir
        JPanel panCouleur = new JPanel();
        panCouleur.setBackground(Color.white);
        panCouleur.setPreferredSize(new Dimension(120, 60));
        panCouleur.setBorder(BorderFactory.createTitledBorder("Couleur "));
        couleur = new JComboBox();
        couleur.addItem("Rouge");
        couleur.addItem("Jaune");
        couleur.addItem("Bleu");
        couleur.addItem("Vert");
        couleur.addItem("Noir");
        couleur.addItem("Orange");
        panCouleur.add(couleur);

        // Le pseudo
        JPanel panPseudo = new JPanel();
        panPseudo.setBackground(Color.white);
        panPseudo.setPreferredSize(new Dimension(120, 60));
        pseudo = new JTextField();
        pseudo.setPreferredSize(new Dimension(100, 25));
        panPseudo.setBorder(BorderFactory.createTitledBorder("Pseudo "));
        panPseudo.add(pseudo);

        JPanel content = new JPanel();
        content.setBackground(Color.white);
        content.add(panPseudo);
        content.add(panCouleur);

        JPanel control = new JPanel();
        JButton okBouton = new JButton("OK");

        okBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                infoToString = new ToStringSelectionPlayer((String) couleur.getSelectedItem(), pseudo.getText(), fen);
                setVisible(false);
            }
        });

        JButton cancelBouton = new JButton("Annuler");
        cancelBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
            }
        });

        control.add(okBouton);
        control.add(cancelBouton);

        this.getContentPane().add(content, BorderLayout.CENTER);
        this.getContentPane().add(control, BorderLayout.SOUTH);
    }
}