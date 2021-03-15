import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javafx.stage.Stage;
public class Backgrounds extends Application{
	
public void menu() throws Exception {
	Stage fenetre = new Stage();
	
	
InputStream bg = new FileInputStream("Ressources/Images/Marish Bros.gif");
Image bg_image = new Image(bg);//faire une fonction qui lie l'inputStream et l'image et qui renvoie l'image
ImageView bg_view = new ImageView();
bg_view.setImage(bg_image);
bg_view.setX(10);
bg_view.setY(10);
bg_view.setFitWidth(575);
bg_view.setPreserveRatio(true);
Group root = new Group(bg_view);
Scene scene = new Scene(root);
fenetre.setTitle("Displaying Image");
fenetre.setScene(scene);
fenetre.show();


}
public InputStream accueil() throws FileNotFoundException {
	InputStream bg = new FileInputStream("C:\\Users\\cmayi\\eclipse-workspace\\Animation\\Ressources\\Images\\Menu.gif");
	Image bg_image = new Image(bg);//faire une fonction qui lie l'inputStream et l'image et qui renvoie l'image
	
	return bg;
			
}


@Override
public void start(Stage arg0) throws Exception {
	// TODO Auto-generated method stub
	
}
}