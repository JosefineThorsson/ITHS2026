package Week_3;
import java.util.Scanner; //hämta Scanner som finns inbyggd i Java

public class PizzaKalkylator {
    //Övning 2 - Pizzakalkylator

    public static void main(String[] args)  {
        PizzaKalkylator piz = new PizzaKalkylator();
        
        // Anropa metoden och skriv ut resultatet. 
        piz.beraknaPris();

    }

    // Skapa en metod som räknar ut vad en pizzabeställning kostar.
    // Skapa metoden beraknaPris(...). 
    // Metoden ska ta emot antal pizzor och pris per pizza som parametrar. 
    int beraknaPris()  {
        Scanner sc = new Scanner(System.in); //skapa en ny Scanner som heter sc som hjälper oss att hämta in input från användaren

        System.out.println("Hur många pizzor vill du ha?");
        int count = sc.nextInt();
        int price = 95;
        int totPrice = count * price;

        sc.close();
        
        // Metoden ska returnera det totala priset. 
        System.out.println("Pizzorna kostar: " + totPrice + " kronor.");

        return totPrice;

    }
    
}
