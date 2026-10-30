package Week_5;
import java.util.InputMismatchException;
import java.util.Scanner; //hämta Scanner som finns inbyggd i Java

public class SafeCalculator {
    // 2. Den säkra miniräknaren 
    // Gör ett litet program där användaren skriver in två heltal och programmet dividerar det första med 
    // det andra.

    public static void main(String[] args)  {

        SafeCalculator s1 = new SafeCalculator();

        s1.divideraNummer();

    }

    //• Använd Scanner för inmatningen. 
    // • Fånga ArithmeticException om användaren försöker dividera med 0. 
    // • Fånga InputMismatchException om användaren skriver något som inte är ett heltal. 
    // • Programmet ska skriva ett tydligt meddelande i stället för att krascha. 
    void divideraNummer() {
        Scanner sc = new Scanner(System.in); //skapa en ny Scanner som heter sc som hjälper oss att hämta in input från användaren

        System.out.println("Skriv in två tal. Det första talet divideras med det andra.");




        try {
            System.out.println("Skriv in det första heltalet:");
            int no1 = sc.nextInt();

            System.out.println("Skriv in det andra heltalet:");
            int no2 = sc.nextInt();
            int totNum = no1 / no2;            
            System.out.println(no1 + " delat med " + no2 + " blir " + totNum + ".");

        } catch (ArithmeticException e) {
            System.out.println("Kan inte dividera med noll.");
            //e.printStackTrace();
            //System.out.println(e.getMessage());

        } catch (InputMismatchException e)  {
            System.out.println("Du måste skriva in ett heltal.");
            //e.printStackTrace();
            //System.out.println(e.getMessage());

        } finally   {
            //3. Finally - städpatrullen 
            // Utgå från miniräknaren ovan.
            // Lägg till ett finally-block som alltid skriver:
            System.out.println("Programmet är klart.");
            
            // finally körs normalt både vid lyckad körning
            // och när ett exception inträffar.
        }

        sc.close();

    }
}