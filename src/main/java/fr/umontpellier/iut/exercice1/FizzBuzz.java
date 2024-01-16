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
        throw new RuntimeException("La fonction n'est pas encore implémentée !");
    }
}
