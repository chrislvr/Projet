import java.io.File;
import java.io.IOException;

public class MainAffichageNiveau {
    public static void main(String[] args) throws IOException {
        Stage s = new Stage(new File("./Ressources/Niveau1.txt"));
        s.toFrame().show();
    }
}
