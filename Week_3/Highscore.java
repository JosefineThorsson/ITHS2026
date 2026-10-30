import java.util.Arrays; // Behövs för Arrays.sort() och Arrays.toString().

public class Highscore {
    //2. Highscore-listan 
    // Du utvecklar ett spel och vill hålla reda på spelarnas poäng. 

    public static void main(String[] args)  {
        // Skapa en int[] som innehåller fem olika poäng. 
        int[] score = {6, 10, 2, 8, 4};

        // Använd en vanlig for-loop för att skriva ut alla poäng. 
        for (int i = 0; i < score.length; i++)  {
            System.out.println(score[i]);
        }

        // Skriv ut den totala summan av poängen. 
        int totScore = 0; // Skapar en variabel som lagrar summan

        for (int i = 0; i < score.length; i++)  {
            totScore += score[0]; // Adderar till summan varje gång loopen körs
        }
        System.out.println("Summan av poängen är: " + totScore);

        // Använd Arrays.sort() för att sortera poängen. 
        Arrays.sort(score);

        // Skriv ut den sorterade arrayen med Arrays.toString(). 
        System.out.println("Sorterad lista med poäng: " + Arrays.toString(score));

        //Bonus: Skriv ut den högsta poängen efter sorteringen. 
        System.out.println("Högsta poängen är: " + score[score.length - 1]);
    }
}