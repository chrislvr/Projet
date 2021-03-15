import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class Music {
boolean lecture = false;
public void lecture() {
if(lecture) {
	lecture = false;
}
else { lecture = true;}
}
final JFXPanel fxPanel = new JFXPanel();
Media intro = new Media(new File ("C:\\Users\\cmayi\\eclipse-workspace\\Animation\\Ressources\\Music\\Awakening Will.mp3").toURI().toString());
MediaPlayer player = new MediaPlayer(intro);//faire une fonction qui lie le media et le player
public void play1() {
if (!lecture) {
	    player.play();
	    System.out.println("Lancement de la musique...");
	    lecture();
	 }
else {System.out.println("La musique est déjà activée.");
}
}
public void stop1() {
if(lecture) {
	player.stop();
	System.out.println("Musique arrêtée.");
	lecture();
	}
else {System.out.println("La musique est déjà arrêtée.");}
	}
public boolean getLecture() {
	return lecture;
}
public void setLecture() {
	if(lecture) lecture = false;
	else lecture = true;
}

}

