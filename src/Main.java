import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Stage s = new Stage(new File("./Ressources/Stages/stage1.txt"));
        s.toFrame().show();
    }
}
