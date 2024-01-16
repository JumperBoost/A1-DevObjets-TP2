package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        String[] liste = computeList(i);
        return liste[i-1];
    }

    public String[] computeList(int i) {
        String[] liste = new String[i];
        for(int y = 0; y < i; y++) {
            liste[y] = "";
            if((y+1) % 3 == 0)
                liste[y] += "Fizz";
            if((y+1) % 5 == 0)
                liste[y] += "Buzz";
            if((y+1) % 3 != 0 && (y+1) % 5 != 0)
                liste[y] += y+1;
        }
        return liste;
    }
}
