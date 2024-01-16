package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        String res = "";
        if(i % 3 == 0)
            res += "Fizz";
        if(i % 5 == 0)
            res += "Buzz";
        if(res.isEmpty())
            res += i;
        return res;
    }

    public String[] computeList(int i) {
        String[] liste = new String[i];
        for(int j = 0; j < i; j++) {
            liste[j] = getValue(j+1);
        }
        return liste;
    }
}
