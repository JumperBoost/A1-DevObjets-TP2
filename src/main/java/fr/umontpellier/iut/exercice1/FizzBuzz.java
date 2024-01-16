package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if(i % 15 == 0)
            return "FizzBuzz";
        if(i % 3 == 0)
            return "Fizz";
        if(i % 5 == 0)
            return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        String[] liste = new String[i];
        for(int j = 0; j < i; j++) {
            liste[j] = getValue(j+1);
        }
        return liste;
    }
}
