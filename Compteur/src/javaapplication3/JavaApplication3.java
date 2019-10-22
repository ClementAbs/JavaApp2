/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;  // Définition du package

import java.awt.*;          //Import des différentes librairies nécessaire à l'éxécution du programme
import java.awt.event.*;
import javax.swing.*;




class FenLabel extends JFrame implements ActionListener {

    public FenLabel()
    {
        setTitle("Essais Etiquette"); // Définition du titre
        setSize(300,120);             // On fixe la taille de la fenêtre
        Container contenu = getContentPane(); // Instanciation de contenu
        contenu.setLayout( new FlowLayout());   
        bouton = new JButton("Mon Compteur"); // Création d'un bouton Mon Compteur
        bouton.addActionListener(this);       // Implémente le bouton
        contenu.add(bouton);                   // Ajout du bouton dans le contenu
        nbClics =0;                             // On initialise le nombre de clics à 0
        compte = new JLabel("Le nombre de clics sur le compteur est de : "+nbClics); // Texte dans la zone Contenu
        contenu.add(compte); // Implémentation de compte dans la fonction add      
    } 
 
    public void actionPerformed (ActionEvent e)
    {
        
        nbClics++;  //Itération du nombre de clics
        compte.setText("Le nombre de clics sur le compteur est de : "+nbClics);
        
    }
    
    private JButton bouton; //On définit la variable bouton en private
    private JLabel compte; // On définit la variable compte en private
    private int nbClics;   // On définit la variable nbClics en private
}
