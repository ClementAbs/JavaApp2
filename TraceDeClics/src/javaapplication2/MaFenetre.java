/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2; // Package du projet

import javax.swing.*;       //Librairie du projet nécessaire pour l'éxécution du programme
import java.awt.event.*;
import java.awt.*;

class MaFenetre extends JFrame{ //Classe MaFenetre qui étend JFrame
    MaFenetre ()
    {setTitle("Traces de clics");  //On définit le titre
     setSize(300,150);             //On définit la taille de la fenetre 
     pan = new Panneau();          // pan est instancié
     getContentPane().add(pan);    // On implémente pan
    }
    private Panneau pan;           // On définit pan en private
    
}
    
    class Panneau extends JPanel{     // La classe Panneau étent JPanel
        
        final int MAX=100;             //On définit MAX=100
        public Panneau()               // Définition du constructeur Panneau 
        { abs = new int[MAX]; ord= new int[MAX]; // Défintion de l'axe des abscisses et des ordonnées
          nbclics = 0;                          //On initialise le nombre de clic à zéro
          addMouseListener(new MouseAdapter()       //On "écoute" l'évènement souris
          { public void mouseClicked (MouseEvent e)     //Définition de la procédure évènementielle mouseClicked
            { if( nbclics < MAX)                    // Si le nombre de clics est inférieur au MAX
            { abs[nbclics]= e.getX();               //Alors on récupère les coordonnées de la souris en X
              ord[nbclics]= e.getY();               // Et on récupère les coordonnées de la souris en Y
              nbclics++;                            // Itération du Nombre de clics 
              repaint();                            // On dessine le petit carré
            }
            }
                 
        });
    }
    

    public void paintComponent (Graphics g){        //Méthode paintComponent
        super.paintComponent(g);                    //g va hérité de la classe parente paintComponent
        for(int i = 0; i < nbclics; i++)            // Boucle for avec i allant de 0 à 100
            g.drawRect(abs[i], ord[i],5,5) ;        // Le rectange est dessiné sur 5px en abs et 5px en ord
        }

     private int abs[], ord[];          //Définition de l'abscisse et de l'ordonnées en private
     private int nbclics ;              //Définition de nbclics en private
        
}