package Week_5;

public class ExceptionsDetective {
    // Bonus - Exceptiondetektiven 
    // Bestäm för varje kodrad om problemet upptäcks vid kompilering,
    // under körning eller om raden är korrekt.
    // Testkör efter att du gissat.     

    public static void main(String[] args)   {
        
        int age = 20; // Raden är korrekt
        System.out.println("Jag är " + age + " år gammal.");

        try {

            int number = 10 / 0; // Fel under körning, går inte att dela med noll.
            System.out.println("Totalen blir: " + number);

        } catch (ArithmeticException e) {
            System.out.println("Kan inte dela med noll.");

        }

        int[] values = new int[3]; // Korrekt rad

        try {
            System.out.println(values[3]); // Fel under körning, indexet finns inte
            
        } catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("Indexet ligger utanför arrayens gränser.");
        }

        double price = 19.95; // Korrekt rad   
        System.out.println("Priset är " + price + " kronor.");  
    }
}