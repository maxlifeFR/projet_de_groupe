package fr.groupe3.projet_de_groupe;

public class Users {
    public static int nbPlayers = 2;
    public String pseudo;
    public int score;
    public int time;
    
    public Users(String pseudo, int score, int time) {
        this.pseudo = pseudo;
        this.score = score;
        this.time = time;
        System.out.println("un utilisateur est cr�e");
    }
    
    
    public void play() {
        System.out.println("L'utilisateur " + this.pseudo + " � jouer un tour");
    }

}
