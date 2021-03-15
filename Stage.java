import java.io.*;
import java.util.ArrayList;
import java.awt.Toolkit;
import java.awt.Dimension;

import java.util.List;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

public class Stage {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    final double width = screenSize.getWidth();
    final double height = screenSize.getHeight();
    final int SCALEX = (int) width / 22;
    final int SCALEY = (int) height / 11;

    protected List<Bloc> stageRep;

    public Stage(File stage) throws IOException {
        File f = stage;
        stageRep = new ArrayList<Bloc>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            int ligne = 0;// Compteur de lignes
            Bloc bloc;
            while (br.ready()) {
                String l = br.readLine();

                for (int i = 0; i < l.length(); i++) {
                    Coordonnee tempCord = new Coordonnee(i, ligne);
                    switch (l.charAt(i)) {
                        case ('0'):
                            bloc = new Air(tempCord);
                            break;
                        case ('1'):
                            bloc = new Grass(tempCord);
                            break;
                        case ('2'):
                            bloc = new Dirt(tempCord);
                            break;
                        case ('3'):
                            bloc = new Water(tempCord);
                            break;
                        default:
                            bloc = new Air(tempCord);
                            break;
                    }
                    stageRep.add(bloc);
                }
                ligne += 1;
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public Frame toFrame() {
        GraphicStage f = new GraphicStage((int) width, (int) height) {
            public void paint(Graphics g) {

                for (Bloc e : stageRep) {
                    g = e.renderBloc(g, SCALEX, SCALEY);

                }
            }
        };
        return f;
    }

}
