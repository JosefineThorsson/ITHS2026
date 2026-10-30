package Week_3;
import java.util.Arrays; // Behövs för Arrays.sort() och Arrays.toString().

public class DiceGame {
    //5. Tärningsspelet 
    // Du ska skapa ett enkelt tärningsspel där resultaten från fem kast redan är bestämda. 

    public static void main(String[] args)  {

        // Skapa en int[] med fem tärningskast, värden mellan 1 och 6. 
        int[] dice = {2, 6, 3, 5, 1};

        // Använd en loop för att skriva ut alla kast.
        for (int element : dice)    {
            System.out.println(element);
        }

        // Räkna ut den sammanlagda poängen. 
        int totScore = 0; // Skapar en variabel som lagrar summan

        for (int element : dice)    {
            totScore += element;
        }
        System.out.println("Summan av poängen är: " + totScore);

        // Använd Arrays.sort() för att sortera kasten. 
        Arrays.sort(dice);

        // Skriv ut det lägsta och högsta kastet. 
        System.out.println("Det lägsta kastet var: " + dice[0]);
        System.out.println("Det högsta kastet var: " + dice[dice.length - 1]);

        // Använd Arrays.binarySearch() för att söka efter värdet 6 i den sorterade arrayen. 
        int index = Arrays.binarySearch(dice, 6);
        
        System.out.println("Värdet " + dice[index] + " finns på index " + index);

        //Bonus: Använd Arrays.copyOf() för att skapa en ny array som har plats för ytterligare två kast. 
        System.out.println("Ny spelomgång med 7 kast");

        int[] dice2 = Arrays.copyOf(dice, 7);
        dice2[5] = 5;
        dice2[6] = 1;

        Arrays.sort(dice2);
        
        for (int element : dice2)    {
            System.out.println(element);
        }
    }
}