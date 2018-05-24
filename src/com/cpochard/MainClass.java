package com.cpochard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

	public static void main(String[] args) {

		MaFenetre fenetre = new MaFenetre();
		FenetreDate fenetreDate = new FenetreDate();
		int jour = 04;
		int mois = 05;
		int annee = 2018;

		fenetre.label.setText("nom de mon label");
		fenetreDate.labelBis.setText("Nous sommes le " + jour + "/" + mois + "/" + annee);
		
		//Afficher date du jour
		fenetreDate.labelBis.setText(afficherDate());

		// ajouter a la fenetre un JLabel tous les 20 pixels
		fenetre.creerLabel();

		// Bouton pour mettre la date à jour
		fenetreDate.bouton.setText("Mettre la date à jour");
		fenetreDate.bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fenetreDate.bouton.setVisible(false);
				fenetreDate.labelBis.setText(afficherDate());
			}
		}
		);
	}

	// Afficher date et heure du jour
	public static String afficherDate() {
		String s = "";
		java.util.Date date = new java.util.Date(); // On récupère la date au format brut
		String format = "dd/MM/yy H:mm:ss"; // Permet de définir sous quel format nous voulons que la date s'affiche
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); // Avec ce format on définit un
																						// formateur de date
		System.out.println(formater.format(date)); // On affiche la date en passant la donnée brute en paramètre
		s += formater.format(date);
		return s;
	}

}
