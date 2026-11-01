package Week_5;

public class MetodKirurgen {
    // 3. Metodkirurgen 
    // Metoden nedan räknar både ut priset och
    // bestämmer vad som ska skrivas ut.
    // Dela upp den i mindre metoder med tydliga namn. 

    public static void main(String[] args)  {

        // Räknar ut kostnaden med hjälp av countCost
        // Skriver ut resultatet av köpet med hjälp av
        // printResultOfPurchase.
        printResultOfPurchase(countCost(2));
    }
    
    static int countCost(int numberOfPotions) {
        final int PRICE_PER_POTION = 30;

        int totalCost = numberOfPotions * PRICE_PER_POTION;

        return totalCost;
    }

    static void printResultOfPurchase(int totalCost) {
        int coins = 100;

        if (coins >= totalCost) { 
            System.out.println("Köpet lyckades. Kostnad: " + totalCost + " coins."); 
        } else { 
            System.out.println("Du har inte tillräckligt med coins."); 
        } 
    }
}