import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javafx.scene.image.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	JLabel label = new JLabel("Options"); 
	JFrame frame; 
	JPanel panel; 
	JButton play_music;
	JButton stop_music;
	JButton exit;
	Music m = new Music();
	Backgrounds b = new Backgrounds();
	
	
	ImageIcon image = new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cmayi\\eclipse-workspace\\Animation\\Ressources\\Images\\Menu.gif"));
	public GUI() {
		JLabel bg = new JLabel(image);
		play_music = new JButton("Activer la musique");
		stop_music = new JButton("Arrêter la musique");
		exit = new JButton("Quitter");
		play_music.addActionListener(this);
		play_music.setActionCommand("activer");
		stop_music.addActionListener(this);
		stop_music.setActionCommand("arrêter");
		exit.addActionListener(this);
		exit.setActionCommand("quitter");
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(play_music);
		panel.add(stop_music);
		panel.add(exit);
		panel.add(label);
		//panel.add(bg,0);
		
		
		
		
		
		frame = new JFrame();
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Marish Bros");
		frame.pack();
		frame.setVisible(true);

		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cmayi\\eclipse-workspace\\Animation\\Ressources\\Images\\Menu.gif"));
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		play_music.setEnabled(true); stop_music.setEnabled(false);
		
		if("activer".equals(e.getActionCommand())) {
			m.play1();
		}
		if("arrêter".equals(e.getActionCommand())) {
			m.stop1();
		}
		if("quitter".equals(e.getActionCommand())) {
			System.out.println("Au revoir et à bientôt !");
			System.exit(0);
		}
		
		if (m.getLecture()) play_music.setEnabled(false);
		else play_music.setEnabled(true);
		if(play_music.isEnabled()) stop_music.setEnabled(false);
		else stop_music.setEnabled(true);
		
	}
	
	
}
