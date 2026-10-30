package Week_3;
public class BossFight {
    //Övning 7 – Boss fight – Metodprogrammet 
    // Skapa ett litet program där spelaren slåss mot ett monster.
    // Fokuset är att dela upp programmet i tydliga metoder.

    private int damage = 0;

    public static void main(String[] args)  {
        // Skapa minst ett objekt. 
        BossFight b1 = new BossFight();

        // Gör minst ett metodanrop med punktoperatorn.
        b1.attack(10); // Sätter damage till 10 med hjälp av settern

        // Eftersom både main() och attackLevel() är statiska kan jag anropa attackLevel() direkt från main() utan något objekt.
        attackLevel(b1.attack()); // Skriver ut attacknivån som vi får från gettern
    }

    // Bonus: Gör någon metod static och fundera på varför den kan anropas utan att först skapa ett objekt.
    // Den kan anropas utan ett objekt eftersom det är en statisk metod som tillhör klassen.
    // En statisk metod kan inte direkt använda en instansvariabel som this.damage, eftersom den statiska metoden inte hör till ett specifikt objekt.
    // Det är alltså inte parametrar som är problemet, utan åtkomsten till objektets egna variabler.

    // Ha minst en void-metod som skriver ut en attack. 
    // Skriv ut attacknivåm
    static void attackLevel(int damage)   {
        System.out.println("Spelaren attackerar monstret!");
        System.out.println("Attacknivå: " +  damage + " %.");
    }

    // Ha minst en metod som returnerar ett värde. 
    //Getter - hämta attacknivån
    int attack()   {
        return damage;
    }

    // Ha minst en metod med en parameter, exempelvis attack(int damage). 
    //Setter - ändra attacknivån
    void attack(int damage) {
        this.damage = damage;
    }
}