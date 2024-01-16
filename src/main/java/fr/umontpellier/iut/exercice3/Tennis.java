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
        else if(points < 40)
            points = 40;
        else points = 50;
        if(joueur == this.j1)
            this.nbPointsJ1 = points;
        else this.nbPointsJ2 = points;
    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    // Cette fonction interprète le score actuel sous forme d'un texte respectant la nomenclature d'un jeu de tennis
    public String getScore() {
        if(this.nbPointsJ1 >= 40 && this.nbPointsJ1 == this.nbPointsJ2)
            return "Égalité";
        else if(this.nbPointsJ1 >= 50 && this.nbPointsJ2 >= 40 && this.nbPointsJ2 < 50)
            return "Avantage " + this.j1;
        else if(this.nbPointsJ2 >= 50 && this.nbPointsJ1 >= 40)
            return "Avantage " + this.j2;
        else if(this.nbPointsJ1 == 50)
            return this.j1 + " gagne";
        else if(this.nbPointsJ2 == 50)
            return this.j2 + " gagne";
        return this.nbPointsJ1 + " : " + this.nbPointsJ2;
    }

}
