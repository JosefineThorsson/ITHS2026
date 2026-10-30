package Week_3;
public class Spellager {
    //1. Ditt eget spellager 
    // Du har samlat fem föremål i ett datorspel och vill spara dem i en array. 

    public static void main(String[] args)  {
        // Skapa en String[] med fem valfria föremål, exempelvis svärd, sköld och potion.
        String[] lager = {"Svärd", "Sköld", "Potion", "Hjälm", "Spjut"};

        // Skriv ut det första och sista föremålet med hjälp av index. 
        System.out.println("Första föremålet är: " + lager[0]);
        System.out.println("Sista föremålet är: " + lager[lager.length - 1]);

        // Byt ut det tredje föremålet mot något bättre. 
        lager[2] = "Trollspö";
        System.out.println("Det tredje föremålet har bytts ut mot: " + lager[2]);

        // Skriv ut hur många föremål du har med .length. 
        System.out.println("Jag har " + lager.length + " stycken föremål.");

        // Bonus: Använd en enhanced for-loop för att skriva ut hela ditt spellager. 
        for (String element : lager)    {
            System.out.println(element);
        }
    }
}