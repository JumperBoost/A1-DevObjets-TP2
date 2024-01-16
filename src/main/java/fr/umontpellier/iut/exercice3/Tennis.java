package fr.umontpellier.iut.exercice3;

public class Tennis {
    private final String j1;
    private final String j2;
    private int nbPointsJ1;
    private int nbPointsJ2;

    public Tennis(String joueur1, String joueur2) {
        this.j1 = joueur1;
        this.nbPointsJ1 = 0;
        this.j2 = joueur2;
        this.nbPointsJ2 = 0;
    }

    // incrémente les points du joueur correspondant
    public void gagnerPoint(String joueur) {
        int points = joueur == this.j1 ? this.nbPointsJ1 : this.nbPointsJ2;
        if(points < 15)
            points = 15;
        else if(points < 30)
            points = 30;
        else points = 40;
        if(joueur == this.j1)
            this.nbPointsJ1 = points;
        else this.nbPointsJ2 = points;
    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    // Cette fonction interprète le score actuel sous forme d'un texte respectant la nomenclature d'un jeu de tennis
    public String getScore() {
        return this.nbPointsJ1 + " : " + this.nbPointsJ2;
    }

}
