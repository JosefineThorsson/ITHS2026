package Week_3;
public class AdventureCompass {
    //4. Äventyrarens kompass 
    // Du skapar ett äventyrsspel där spelaren kan gå i olika väderstreck. 

    public static void main(String[] args)  {

        // Skapa en variabel som innehåller Direction.NORTH. 
        Direction currentDirection = Direction.NORTH;

        printDirection(currentDirection);

        // Använd Direction.values() tillsammans med en enhanced for-loop för att skriva ut alla riktningar.
        for (Direction d : Direction.values())  {
            System.out.println(d);
        }
        
        //Bonus: Ändra spelarens riktning och se hur utskriften förändras. 
        System.out.println("Ny riktning:");

        currentDirection = Direction.WEST;

        printDirection(currentDirection);
    }

    // Skapa en enum som heter Direction. 
    // Lägg till NORTH, EAST, SOUTH och WEST. 
    public enum Direction   {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    // Använd switch-case för att skriva ut olika meddelanden beroende på riktning. 
    //
    // Skapa metod för att skriva ut riktningen spelaren tar
    // static – gör att vi kan anropa metoden direkt från vår statiska main() utan att skapa ett objekt.
    // void – metoden skriver ut text men returnerar inget värde.
    // Direction direction – är en parameter som tar emot en riktning av typen Direction.

    static void printDirection(Direction d) {
        switch (d) {
            case NORTH:
                System.out.println("Currently heading North!");
                break;

            case EAST:
                System.out.println("Currently heading East!");
                break;
                
            case SOUTH:
                System.out.println("Currently heading South!");
                break;

            case WEST:
                System.out.println("Currently heading West!");
                break;
        }

    }
}