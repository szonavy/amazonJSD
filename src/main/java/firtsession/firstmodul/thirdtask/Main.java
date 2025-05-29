package firtsession.firstmodul.thirdtask;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years
        System.out.println("Introduction Years:");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println("Modified superhero name at position 3: " + superheroes[2]);

        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        System.out.println("Total superheroes names in string array: " + superheroes.length);
        System.out.println("Total superheroes introduction year in int array: " + introductionYears.length);
        // TODO 5a: Print the length of the array containing superhero names
        // TODO 5b: Print the length of the array containing superhero year of introduction


    }
}
