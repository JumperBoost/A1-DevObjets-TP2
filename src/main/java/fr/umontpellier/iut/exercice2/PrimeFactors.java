package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> facteurs = new ArrayList<>();
        while (number > 1) {
            if(number % 2 == 0) {
                facteurs.add(2);
                number /= 2;
            } else {
                facteurs.add(number);
                number = 1;
            }
        }
        return facteurs;
    }
}
