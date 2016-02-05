package Joueur;



public class Donnees_Matchs {
    private String Joueur1;
    private String Joueur2;
    private String Joueur3;
    private String Joueur4;
    private int Equipe;
    private int DateMatch;
    private int HeureMatch;
    private String Arbitre;
    private int Terrain;

    public Donnees_Matchs(String Joueur1, String Joueur2, String Joueur3, String Joueur4, int Equipe, int DateMatch, int HeureMatch, String Arbitre, int Terrain) {
        this.Joueur1 = Joueur1;
        this.Joueur2 = Joueur2;
        this.Joueur3 = Joueur3;
        this.Joueur4 = Joueur4;
        this.Equipe = Equipe;
        this.DateMatch = DateMatch;
        this.HeureMatch = HeureMatch;
        this.Arbitre = Arbitre;
        this.Terrain = Terrain;
    }

    public String getJoueur1() {
        return Joueur1;
    }

    public String getJoueur2() {
        return Joueur2;
    }

    public String getJoueur3() {
        return Joueur3;
    }

    public String getJoueur4() {
        return Joueur4;
    }

    public int getEquipe() {
        return Equipe;
    }

    public int getDateMatch() {
        return DateMatch;
    }

    public int getHeureMatch() {
        return HeureMatch;
    }

    public String getArbitre() {
        return Arbitre;
    }

    public int getTerrain() {
        return Terrain;
    }

    public void setJoueur1(String Joueur1) {
        this.Joueur1 = Joueur1;
    }

    public void setJoueur2(String Joueur2) {
        this.Joueur2 = Joueur2;
    }

    public void setJoueur3(String Joueur3) {
        this.Joueur3 = Joueur3;
    }

    public void setJoueur4(String Joueur4) {
        this.Joueur4 = Joueur4;
    }

    public void setEquipe(int Equipe) {
        this.Equipe = Equipe;
    }

    public void setDateMatch(int DateMatch) {
        this.DateMatch = DateMatch;
    }

    public void setHeureMatch(int HeureMatch) {
        this.HeureMatch = HeureMatch;
    }

    public void setArbitre(String Arbitre) {
        this.Arbitre = Arbitre;
    }

    public void setTerrain(int Terrain) {
        this.Terrain = Terrain;
    }
    
    
}
