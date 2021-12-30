package fr.groupe3.projet_de_groupe;

public class Menu {
	
	public static void display(boolean replay) {
		Console.println("Que voulez vous faire ?");
		Console.println("1: Juste prix");
		Console.println("2: Tic tac toe");
		Console.println("3: Fermer l'application");
		
		int choice;
		
		choice = Console.nextInt();
			
			
		if (choice == 1) {
			Price.init();
			display(true);
			
		} else if (choice == 2) {
			display(true);
			
		} else if (choice == 3) {
			return;
		}
		
		Console.println("\nR�ponse non valide :c");
		display(replay);
	}
}