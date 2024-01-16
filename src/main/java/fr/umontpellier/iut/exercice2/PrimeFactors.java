package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> facteurs = new ArrayList<>();
        if(number > 1)
            facteurs.add(number);
        return facteurs;
    }
}
