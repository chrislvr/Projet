import java.awt.*;
import java.awt.event.*;

import java.util.Timer; //Timer type Java simple
import java.util.TimerTask; // Permet d'associer une tâche à accomplir au Timer


public class MouvementKeyListener extends Frame implements KeyListener, ActionListener {

    int x =500 , y=500, w=50, h=50;
    int pas = 10; // Le pas du personnage

    Graphics personnage;

    
    final int height = 700;
    final int width = 1000;
    Timer timer = new Timer();
    
    public MouvementKeyListener() {

       
        
        setSize(width, height);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
                
            }
        });
    }

    public void paint(Graphics personnage) {
    	super.paintComponents(personnage);
        personnage.drawRect(x, y, w, h);
        personnage.setColor(Color.ORANGE);
        personnage.fillRect(x, y, w, h);
        
        
    }
    

    public void keyPressed(KeyEvent ke) {
        
int keyCode = ke.getKeyCode();
        
        
        
        switch (keyCode) {
            case KeyEvent.VK_UP:
            	timer.schedule(new TimerTask() { //mise en place du Timer et de ses instructions
            		int i = 6; //compteur
					@Override
					public void run() { //execution de la tâche à accomplir
						//int pas = t;
						
						
							i--;
							//System.out.println("i = " + i); //simple repère
						if((y<h)||(y>height-h)) { //si le rectangle dépasse les frontières
							cancel(); // on arrête le Timer
						}
						
						y = y-2*pas; //le moins (-) pour monter dans la fenêtre, càd, le saut en lui même
						repaint();
						
						if (i==0) cancel(); //à la fin du compteur on arrête le timer
					}						//sans timer, les instructions tournent de manière infinie
            		
            	}, 0, 5); //le 0 indique au bout de combien de temps on veut que le timer s'actionne
            			  //ici on veut qu'il s'actionne instantanément
            			  //le 5 indique la fréquence en millisecondes
            			  //càd que toutes les 5 ms, on execute les instructions du run
            	
            	
                break;
            case KeyEvent.VK_DOWN:
                y = y + pas;
                repaint();
                
                break;
            case KeyEvent.VK_LEFT:
                x = x - pas;
                repaint();
                break;
            case KeyEvent.VK_RIGHT:
                x = x + pas;
                repaint();
                break;
            
        }
   
	}
    	
    	
    
    public void keyTyped(KeyEvent ke) {
    	
    }

    public void keyReleased(KeyEvent ke) {
    	
int keyCode = ke.getKeyCode();
        
        
        
        switch (keyCode) {
        case KeyEvent.VK_UP:
        	timer.schedule(new TimerTask() {//ici c'est presque similaire au KeyPressed
        		int i = 6;					//le KeyReleased s'enclenche lorsqu'on relache la touche
				@Override
				public void run() {
					//int pas = t;
					
					
						i--;
						//System.out.println("i = " + i);
					if((y<h)||(y>height-h)) {
						cancel();
					}
					
					y = y+2*pas; //le plus (+) pour l'attérissage
					repaint();
					
					if (i==0) cancel();
				}
        		
        	}, 30, 5); //ici, on doit attendre 30 ms pour que ça s'execute car le run du KeyPressed
        				// s'execute 6 fois toutes les 5ms => 6*5 = 30
        }
    		
    		
    		
    		
    		
    	}
 
    		
    

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		 
	}
    
}
    	


    

	
	
	

