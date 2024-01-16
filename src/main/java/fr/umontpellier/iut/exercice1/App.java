package fr.umontpellier.iut.exercice1;

public class App {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.getValue(5));
        System.out.println(fizzBuzz.getValue(3));
        System.out.println(fizzBuzz.getValue(8));
        System.out.println("-".repeat(20));

        String[] liste = fizzBuzz.computeList(18);
        System.out.println("Pour n = 18:");
        for(String val : liste)
            System.out.println("  => " + val);
    }

}
