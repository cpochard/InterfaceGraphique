package com.cpochard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreDate extends JFrame {
	
	//Attributs de la classe éléments graphiques
			private JPanel panneau;
			JLabel labelBis;
			JButton bouton;
				
			
			@SuppressWarnings("unused")
			public FenetreDate () {
				//Titre de la fenetre
				this.setTitle("Afficher la date");
				//Taille de la fenetre
				this.setSize(500, 500);
				//Placer la fenetre au centre de l'écran
				this.setLocationRelativeTo(null);
				//Rendre la fenetre visible
				this.setVisible(true);
				//Faire que la croix rouge ferme le programme
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Création du panneau
				panneau = new JPanel();
				//Panneau dans Layout pour placer librement les éléments
				panneau.setLayout(null);
				//Fixer le panneau à la fenetre
				this.setContentPane(panneau);
				
				//Création du label
				labelBis = new JLabel ();
				//On lui donne une position et une taille (gauche, haut, largeur, hauteur)
				labelBis.setBounds(5, 20, 300, 20);
				//Ajouter le label au panneau
				panneau.add(labelBis);
				
				//Création d'un bouton
				bouton = new JButton ();
				//Lui donner ses coordonnées
				bouton.setBounds(5, 20, 150, 50);
				//L'ajouter au panneau
				panneau.add(bouton);
			
			}

}
