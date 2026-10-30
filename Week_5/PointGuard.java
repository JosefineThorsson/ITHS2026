package Week_5;
public class PointGuard {
    //4. Poängvakten 


    public static void main(String[] args)  {


        try {
            System.out.println("Testar med en giltig poäng:");
            checkScore(100); // Poängen godkänns


            System.out.println("Testar med en ogiltig poäng:");
            checkScore(101); // Ogitlig poäng


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    }

    // Skapa en metod som tar emot en poäng mellan 0 och 100: 
    // static void checkScore(int score)
    static void checkScore(int score)   {

        if (score < 0 || score > 100)   {
            throw new IllegalArgumentException(
                "Antal poäng måste vara mellan 0 och 100.");
        }
        
        System.out.println("Poängen godkänns"); 
    }
}