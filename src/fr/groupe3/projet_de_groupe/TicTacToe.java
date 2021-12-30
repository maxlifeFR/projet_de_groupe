package fr.groupe3.projet_de_groupe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Scanner;

public class TicTacToe {

	public static String[][] morpionCree() {
		
		//deffinir nos cases
		//dectecter une victoir
		//definir des tours
		//definir une interaction (joueur 1 et joueur 2)
		//attribuer un carater X O
		
		//creation du tableau en caractere
		String[][] morpion = {
	
			
				{"-","-","-"},
				{"-","-","-"},
				{"-","-","-"}
				
		};
		
		return morpion;
	}


	public static void morpionAfficher(String[][] morpion) {	
		
			
		//affiche A,B,C au dessus du tableau
		System.out.println("\n  A B C");
		
		//intergre la valeur i et array qui va rechercher la valeur dans le tableau 
		for (int i = 0; i < morpion.length; i++) {
		
		//ajoute des espace entre les cases
			System.out.print((i + 1) + " ");
		
		//integre
			for (int j = 0; j < morpion[i].length; j++) {
				
				System.out.print(morpion[i][j] + " ");
				
			}
			System.out.println();
		}

	
	}
			
		//fonction
	public static String[][] cases(String[][] morpion,String choix) {
		//definir A.B.C en 0.1.2
		//1A = 00
		//1B = 01
		//1C = 02
		//2A = 10
		//2B = 11
		//2C = 12
		//3A = 20
		//3B = 21
		//3C = 22
		//definir une boucle pour les joueurs
		// maj a>A
		// cr�e une autre boucle pour aff
		
	/*public static void monChoix(String decision,int numeros) {
		String decision = "0";
		int numeros
				
	}*/


		Scanner scanCases = new Scanner(System.in);	
		//System.out.println("Choisissez votre case avec 1.2.3 et A.B.C pour ex:1B : ");
		String cases = "";
		
		boolean bonneReponse = true ;
		while(bonneReponse){	
			
			cases = scanCases.nextLine().toUpperCase();
			

			// // \w{0}\d{2}

			// 	cases.getText().matches()
			// 	if (){

			// 	}
			// 	1b
			// 	2a

			// 	1-3 (il ne peut tapper plus)
			// 	a, b, c
			// 	fff
			//
			//un seul = change, 2 == egualise 
			//if (choix == "x") = "x"
				
			

			//1 --> 1
			//3
			
			// verification ce que 1er est un chiffre, 2ieme est une lettre;
			//         \\d - chiffre (int)     = [1-3]    =>>    \\d[1-3]
			//         \\w - lettre (string)   = [a-b]    =>>    \\w[a-c]
		
			//reject
			// c'est un regle "trouve un chiffre[1 ou 2 ou 3] et une lettre[a ou b ou c] "
			Pattern pattern = Pattern.compile("^[1-3][A-C]$");
			//Pattern pattern = Pattern.compile("((\\d[1-3])?(\\w[a-c]))");
			//Pattern pattern = Pattern.compile("((\\d[1-3])?(\\w[a-c]))");

			Matcher m = pattern.matcher(cases);
			// TRUE/FALSE
			boolean matchFind = m.find(); 
			// Affiche true\false
			//System.out.println(matchFind);

			//System.out.println(cases.length());

			if(matchFind && cases.length() == 2){

				// sort de boucle et fair swith et verfic
				//System.out.println(cases);
		
				String caseVieille = "";
				//switch = changé
				switch (cases) {				

				//ajoute une variable joueur 1 et joueur 2
				case "1A":				
					caseVieille = morpion[0][0];
					
					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){							
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[0][0] = choix;
					}
					break;								




				case "1B":		
					caseVieille = morpion[0][1];

					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[0][1] = choix;
					}	
					break;				




				case "1C":
					caseVieille = morpion[0][2];				

					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[0][2] = choix;
					}
					break;




				case "2A":
					caseVieille = morpion[1][0];
					
					if (caseVieille == "X" && choix == "O" 
						|| caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[1][0] = choix;
					}	
					break;				




				case "2B":
					caseVieille = morpion[1][1];		
									
					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[1][1] = choix;					
					}
					break;




				case "2C":
					caseVieille = morpion[1][2];		

					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[1][2] = choix;
					}
					break;
					
					

					
				case "3A":
					caseVieille = morpion[2][0];	

					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[2][0] = choix;
											
					}
					break;	



				case "3B":
					caseVieille = morpion[2][1];
					
					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[2][1] = choix;
					}
					break;				



					
				case "3C":			
					
					if (caseVieille == "X" && choix == "O" 
						||caseVieille == "O" && choix == "X"
						||caseVieille == "X" && choix == "X"
						||caseVieille == "O" && choix == "O"){
						System.out.println("Vous jouez par " + choix + ", mais cette case est occupee par " + caseVieille + ". Changez une case :");
						cases(morpion, choix);
					} else{
						morpion[2][2] = choix;	
					}
					break;

				}
				
				break;

			} else {
				// obligatoirement mettre 1a
				System.out.println("Vous avez tape une faut. Retapez s'il vous plait: ");	
				cases(morpion, choix);
				break;		
			} 
			
		}	
			
		return morpion;
	}		
		
	
	/**
	Check the line and the column who correspon to the index
	 */
	public static boolean check(int i, String[][] morpion ) {
			return morpion[i][0] != "-" 
				&& morpion[i][0] == morpion[i][1] && morpion[i][1] == morpion[i][2]
				|| morpion[0][i] != "-" 
				&& morpion[0][i] == morpion[1][i] && morpion[1][i] == morpion[2][i];
	}
	// [[0-0]=[0-1]] == [[0-1]=[0=2]]
	
	// si x=y et x=z
	// si x=y et y=z 
	// x = y = z
	// 	X	-	-
	// 	Y	-	-
	//	z	-	-

	public static boolean verification(String[][] morpion) {
		
		//"!" conciste a ecrire un condition
		//"if" a une condition obligatoir pour marche ex: true 
		//"!" inverse ou annule
		// "!" true --> false
		// if(1+3 != 4) {condition} ----> TRUE
		// if(!true){} ----> TRUE
		// true et !false c'est la même chose 


		boolean win = false;

		// lignes et collones
		for (int i = 0; i < morpion.length; i++){
			if (check(i, morpion)) {
				win = true;
				break;
			}
		}	



		// && - et , & - et
		// || - ou , | - ou
		// diagonales
		if (!win && morpion[0][0] != "-" 
				&& morpion[0][0] == morpion[1][1] && morpion[1][1] == morpion[2][2]
				||  morpion[0][2] != "-" 
				&& morpion[0][2] == morpion[1][1] && morpion[1][1] == morpion[2][0]) {
					win = true;
		}

		return win;	
	}

	public static int egalite(String[][] morpion){
		// égalité
		int egalite = 0;
		for (int i = 0; i < morpion.length; i++) {
			for (int j = 0; j < morpion[i].length; j++) {
				if (morpion[i][j] != "-"){
					egalite++;					
				}
				// casevide      +!win = egalite
				// tour 9 = egalite
			}
		}
		if (egalite == 0){							
			System.out.println("__________________________");
			System.out.println("Match nul");
		}		

		// if(egalite = 9); 9 cases sont occupes
		return egalite;	

	}



						
	// onJoue(parametre ->> JOUEUR)
	public static void onJoue(String[][] morpion, String J) {
		TicTacToe.cases(morpion, J);
		TicTacToe.verification(morpion);	
		TicTacToe.morpionAfficher(morpion);
	}








	public static void jeu(){				
		//Sign
		String jSign1 = "X";
		String jSign2 = "O";

		//Noms
		//j1
		Scanner scanJueur = new Scanner(System.in);		
		System.out.print("Entrer nom du joueur 1 : ");	
		String j1 = scanJueur.nextLine();	
		//2
		System.out.print("Entrer nom du joueur 2 : ");	
		String j2 = scanJueur.nextLine();	
		System.out.println("");	
		
		Joueur joueur1 = new Joueur(jSign1, j1);
		Joueur joueur2 = new Joueur(jSign2, j2);
 
		System.out.print("\n\nBataille de ");
		
		System.out.println((joueur1.getNom() + " x " + joueur2.getNom()).toUpperCase());		
		  
		
		//variable
		//String[][] morpion = TicTacToe.morpionCree();
		int[] score = TicTacToe.scoreCree();
				

		TicTacToe.boucleJeu(joueur1, joueur2, score);

	

	}

	public static void menu(){	
		Scanner scanMenu = new Scanner(System.in);		
		System.out.println("\n------- M E N U ------- ");	
		System.out.println("Tapez 1 pour jouer.");	
		System.out.println("Tapez 2 pour quitter.\n");	
		System.out.print("Votre : " );	
		String pointMenu = scanMenu.nextLine();	 

		while(!pointMenu.equals("2")){	
			if(pointMenu.equals("1")){
				System.out.println("Jouer");
				TicTacToe.jeu();
				TicTacToe.menu();
			} 
			break;
		}
	}









	public static void boucleJeu(Joueur joueur1, Joueur joueur2,  int[] score) {	
		
		
		String annotationJoueur1 = "joueur1";
		String annotationJoueur2 = "joueur2";
		int i = 1; 		

		
		// 1. BOUCLE
		boolean continuer = true; 



		while(continuer){
			
			// i == gagnant
			int point1 = 0;
			int point2 = 0;
			
			// 2. Jouer encore une fois ou pas si oui - continuer, si non arrater(sortir de boucle )
			 
			Scanner scan = new Scanner(System.in);
			String choix = "";

			while(!choix.equals("oui") || !choix.equals("non")){
				System.out.println("___________________________________________ ");		
				System.out.println("On commence ? (Oui ou Non) : ");			
				
				choix = scan.nextLine();

				choix.toLowerCase();

				if (choix.equals("non"))  {
					System.out.println("Fin de partie merci d'avoir jouer");
					continuer = false;
					break;
				} else if(!choix.equals("oui")){
					System.out.println("le mot n'est pas correct, taper 'oui' ou 'non':");

				} else if (choix.equals("oui")) {	 
					System.out.println("La partie recommence.");
					i = 0;
					break; 
				} 
			}


			if (choix.equals("non"))  {
				break;
			}
			
			System.out.println("___________________________________________\n");	

			String[][] morpion = TicTacToe.morpionCree();
			
			
			int e;

			//TicTacToe.morpionCree();
			TicTacToe.morpionAfficher(morpion);
			do {
				// verification passe ---> "Vous avez gangné"
				
				// tour de boucle
				System.out.print("\n(Tour " + i +"). "); 

				// Joueur 1
				if (i % 2 == 0) {
					System.out.print("Tour de " + joueur1.getNom().toUpperCase() + " (ex: 3c) : "); 
					
					// joueur1.getJoueur() c'est X
					onJoue(morpion, joueur1.getSign());				

				// Joueur 2
				} else {
					System.out.print("Tour de " + joueur2.getNom().toUpperCase() + " (ex: 3c) : ");

					// joueur2.getJoueur() c'est 0
					onJoue(morpion, joueur2.getSign());
				}
				
				i++;
				e = egalite(morpion);
				//System.out.println(e);
				if(e == 9){
					break;
				}
				
			} while (TicTacToe.verification(morpion) == false);
			

			// score
			if(e == 9){
				System.out.println("\n Match nul\n");
			} else {
					
				System.out.print("\nFelicitation ") ;

				// Joueur unpair
				if (i % 2 != 0) { 
					System.out.print(joueur1.getSign());
					point1 = 1;			
					scoreModifier(score, point1, point2);

				// Joueur pair
				} else {	
					System.out.print(joueur2.getSign());
					point2 = 1;			
					scoreModifier(score, point1, point2);
				}
				System.out.print(" a gagne ! \n") ;
				
				scoreAfficher(score, annotationJoueur1, annotationJoueur2, joueur1.getNom(), joueur2.getNom());
				assignPoints(score, joueur1, joueur2);
			}
		}
	}

	public static int[] scoreCree() {		
		int[] score = {0,0};

		return score;
	}

	public static int[] scoreModifier(int[] score, int point1, int point2) {
		
		// jouer 1
		score[0] = score[0] + point1;		
		// jouer 2
		score[1] = score[1] + point2;		 
		
		return score;
	}
	public static int[] assignPoints(int[] score, Joueur joueur1, Joueur joueur2) {		

		joueur1.setScore(score[0]);
		joueur2.setScore(score[1]); 

		return score;
	}


	public static void scoreAfficher(int[] score, String joueur1,String joueur2, String jNom1, String jNom2) {
		
		// 	//	joueur1 | joueur2
		// 	//	  Max   |  Teti 
		// 	//     2	   1
		
		System.out.println("\n___________________________________________");	
		System.out.print("\nTableau :\n\n") ;
		System.out.println(jNom1 + "\t| " + jNom2);
		System.out.println(joueur1 + "\t| " + joueur2);
		System.out.println("  [" + score[0] + "]\t|   [" + score[1] + "]");	
		
	}

	// 	//	1 ---
	// 	//	2 ---
	// 	//	3 ---
		

	// 	// joueur = pair\ unpair
		


	//		pair\ unpair		win					win = true
	// si joueur1 "X"\"O" est gangner donce il recois 1 point.

	// 	// joueur1 = "X","O" = "true/false" +  1
	//     //  joueur = win + 1 point

	
	

}

/*
 * 
 * 
 * 
*/
// afficher un message ou une erreur de jeu 
// fff - si il y a la betise \\ ou repete une case \\ cet case est occupee
// tout le morpion est fini, mais il ne s4qrrete
// score
