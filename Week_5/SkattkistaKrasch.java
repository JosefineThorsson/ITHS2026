public class SkattkistaKrasch {
    public static void main(String[] args)  {
        // 1. Skattkistan som kraschar 
        // Skapa en array med tre skatter: 
        int[] treasure = {100, 200, 300}; 

        // 1. Försök skriva ut elementet på index 5 och kör programmet. 
        // 2. Läs felmeddelandet i terminalen. Vilken exception-typ får du? 
        // 3. Lägg den riskabla raden i ett try-block. 
        // 4. Fånga felet med catch (ArrayIndexOutOfBoundsException e). 
        // 5. Skriv ut ett eget meddelande och även e.getMessage().
        try {
            System.out.println(treasure[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kan inte nå ett index utanför arrayen.");
            System.out.println(e.getMessage());
        }
    }
}