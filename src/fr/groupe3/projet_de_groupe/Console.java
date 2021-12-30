package fr.groupe3.projet_de_groupe;

import java.util.Scanner;

public class Console {
	public static Scanner scan = new Scanner(System.in);
	
	
	public static void println(String text) {
		System.out.println(text);
	}
	
	public static String nextLine() {
		return scan.nextLine();
	}
	
	public static int nextInt() {
		return scan.nextInt();
	}
	
	
	public static void close() {
		scan.close();
	}
}
