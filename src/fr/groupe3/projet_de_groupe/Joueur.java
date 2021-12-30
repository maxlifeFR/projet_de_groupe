package fr.groupe3.projet_de_groupe;

// class maj
public class Joueur {	
	//methode minuscule 


	private String nom;
	public int score;
	public String sign;

	public Joueur(String sign, String nom) {
		this.sign = sign;
		this.nom = nom;
		this.score = score; 	
		
		System.out.println(nom.toUpperCase() + " joue comme " + sign + " qui a " + score);
	}	 

	
	// Getter
	public String getSign() {
		return sign;
	} 


	// Nom
	public String getNom() {
		return nom;
	}
	public String setNom() {
		return nom;
	}


	// joueur2.getScore() =========== > 4
	// joueur2.setScore(3) =========== > 4
	// Score
	public int getScore() {
		return score;
	}
	public int setScore(int score) {
		this.score = score;
		return score;
	}
	
	// public static String[][] tableauJoueur(String nom, int score, String joueurXO){
	// 	private String[][] tableau = {
	// 		{nom, score, joueurXO}
	// 	};
	// }

		
	// public static String[][] tableauJoueur(String[][] tableau, String nom, int score, String joueurXO){
	// 	tableau
	// }




	// 1er joueur saisi son nom.
	// 2iem joueur saisi son nom.
	// ler est X
	// 2iem est O
	// On lance un jeu 
	// Score doit etre sauvage





}
