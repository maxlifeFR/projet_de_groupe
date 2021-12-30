package fr.groupe3.projet_de_groupe;

import java.util.Random;

public class Price {
	static int goal;
	
	public static void init() {
		Random r = new Random();
		goal = r.nextInt(100);
		
		turn();
	}
	
	public static void turn()  {
		
		Console.println("Choissisez un nombre entre 0 et 100 :");
		
		int playerValue;
		
		playerValue = Console.nextInt();
		
		if (playerValue > goal) {
			Console.println("trop grand !");
			turn();
		} else if (playerValue < goal) {
			Console.println("trop petit !");
			turn();
		} else {
			Console.println("Bien joué !");
		}
	}

}