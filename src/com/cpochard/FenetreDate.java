package com.cpochard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreDate extends JFrame {
	
	//Attributs de la classe �l�ments graphiques
			private JPanel panneau;
			JLabel labelBis;
			JButton bouton;
				
			
			@SuppressWarnings("unused")
			public FenetreDate () {
				//Titre de la fenetre
				this.setTitle("Afficher la date");
				//Taille de la fenetre
				this.setSize(500, 500);
				//Placer la fenetre au centre de l'�cran
				this.setLocationRelativeTo(null);
				//Rendre la fenetre visible
				this.setVisible(true);
				//Faire que la croix rouge ferme le programme
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Cr�ation du panneau
				panneau = new JPanel();
				//Panneau dans Layout pour placer librement les �l�ments
				panneau.setLayout(null);
				//Fixer le panneau � la fenetre
				this.setContentPane(panneau);
				
				//Cr�ation du label
				labelBis = new JLabel ();
				//On lui donne une position et une taille (gauche, haut, largeur, hauteur)
				labelBis.setBounds(5, 20, 300, 20);
				//Ajouter le label au panneau
				panneau.add(labelBis);
				
				//Cr�ation d'un bouton
				bouton = new JButton ();
				//Lui donner ses coordonn�es
				bouton.setBounds(5, 20, 150, 50);
				//L'ajouter au panneau
				panneau.add(bouton);
			
			}

}
