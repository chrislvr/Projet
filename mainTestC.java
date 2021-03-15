import java.io.IOException;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.stage.Stage;
public class mainTestC {
public Perso perso;
public Bloc bloc1;
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception {
/*String rep = "";
Music m = new Music();
Backgrounds b = new Backgrounds();
m.play1();
Scanner scan = new Scanner(System.in);
*/
//GUI gui = new GUI();
	  int x = 500;
      int y = 500;
      int w = 50;
      int h = 50;
      new MouvementKeyListener(x, y, w, h).show();
	//Détection contact
		if(this.perso.collisionAvant(bloc1) == true){
			this.perso.MouvementKeyListener(false); 
			this.dx = 0;
		}
/*try{
	Platform.runLater(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				b.menu();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	});
}catch(Exception e){
	System.out.println("Le menu ne s'affiche pas. Relancez le programme.");
	System.out.println(e);
}

while(!(rep.equals("q"))){
	System.out.print("Que voulez-vous faire ?\n");
	System.out.print("Jouer de la musique (j) | Arrêter la musique (a) | Quitter (q)");
	rep = scan.nextLine();
	switch(rep) {
	case "j":
		m.play1(); break;
	case "a":
		m.stop1(); break;
	case "q":
		m.stop1();
		System.out.println("Au revoir et à bientôt !");break;
	default :
		System.out.println("Commande erronée.");
	}
	
}
*/
}
}
