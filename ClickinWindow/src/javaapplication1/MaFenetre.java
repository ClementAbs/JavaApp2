package javaapplication1; //Package du projet

import java.awt.event.*; //Import des librairies
import javax.swing.*;


class MaFenetre extends JFrame implements MouseListener {
    
    public MaFenetre(){ //Constructeur MaFenetre
        
        setTitle("Gestion de clics");
        setBounds (10,20,300,200);
        addMouseListener(this);
    }
    


    public void mouseClicked(MouseEvent ev)    //Méthode gérant un clic de souris
    {
     System.out.println("Clic dans la fenetre");
    } 
           
    
    public void mousePressed (MouseEvent ev) {} //Méthode qui écoute l'évènement clic
    public void mouseReleased(MouseEvent ev) {}
    public void mouseEntered(MouseEvent ev) {}

    @Override
    public void mouseExited(MouseEvent ev) {}   
  }

  

