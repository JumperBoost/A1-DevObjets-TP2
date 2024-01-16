package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if(i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        throw new RuntimeException("La fonction n'est pas encore implémentée !");
    }
}
