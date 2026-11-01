package Week_5;

public class Player {
    
    // 4. Mini-projekt - Potion Shop 
    // Bygg en liten potion-butik.
    // Här får du kombinera namngivning, små metoder
    // och ett objekt med tydligt ansvar.

    String name = "Måns";
    int health = 80;
    int coins = 100;

    // Ansvarar för kontrollen
    boolean canBuyPotion(int price)  {

        return coins >= price;
    }

    // Ansvarar för själva köpet
    void buyPotion(int price) {

        if (canBuyPotion(price)) {
            coins -= price;

            System.out.println("Köpet lyckades!");

        } else  {
            System.out.println("Du har inte tillräckligt med coins.");
        }
    }

    void heal(int amount)    {
        final int MAX_HEALTH = 100;

        // Ser till så att health aldrig går över MAX_HEALTH
        health = Math.min(MAX_HEALTH, health + amount);

        System.out.println("Din health är nu på " + health + " HP.");
    }

    void printStatus()  {
        System.out.println(
            "Spelarens namn: " + name
            + "\nHealth: " + health
            + "\nAntal coins kvar: " + coins
        );
    }
}