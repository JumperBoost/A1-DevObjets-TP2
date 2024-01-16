package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> facteurs = new ArrayList<>();
        int diviseur = 2;
        while (number > 1) {
            if(number % diviseur == 0) {
                facteurs.add(diviseur);
                number /= diviseur;
            } else {
                diviseur++;
            }
        }
        return facteurs;
    }
}
