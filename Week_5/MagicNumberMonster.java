package Week_5;

public class MagicNumberMonster {
    // 2. Magic Number Monster 
    // Talet 100 har en betydelse, men det syns inte i koden.
    // Gör betydelsen tydlig med en namngiven konstant.     

    public static void main(String[] args)  {
        int playerScore = 120; 

        // Skapar en konstant som inte kan förändras
        // final innebär att variabeln inte kan
        // stilldelas ett nytt värde efter initiering.
        final int LEVEL_UP_SCORE = 100;

        if (playerScore >= LEVEL_UP_SCORE) { 
            System.out.println("Level up!"); 
        } 
    }
}