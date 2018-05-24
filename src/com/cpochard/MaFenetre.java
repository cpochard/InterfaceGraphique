package com.cpochard;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame {
	
	 //Attributs de la classe éléments graphiques
		 JPanel panneau;
		 JLabel label;
		 
		 ArrayList<JLabel> listLabel = new ArrayList<JLabel>();
			JLabel label2 = new JLabel();
			JLabel label3 = new JLabel();
		
		public MaFenetre () {
			//Titre de la fenetre
			this.setTitle("Titre de ma fenetre");
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
			
			//Création du label1
			label = new JLabel ();
			//On lui donne une position et une taille (gauche, haut, largeur, hauteur)
			label.setBounds(5, 20, 300, 20);
			//Ajouter le label au panneau
			panneau.add(label);
			
			listLabel.add(label);
			listLabel.add(label2);
			listLabel.add(label3);
		}
		
			public void creerLabel (){
				int hauteur = 20;
				int i = 1;
			for (JLabel l : listLabel) {
				l.setText("label" + i + " à la hauteur " + hauteur );
				l.setBounds(5, hauteur, 300, 20);
				hauteur += 20;
				i++;
				panneau.add(l);
				panneau.repaint();
			}
			
		}
			
}
