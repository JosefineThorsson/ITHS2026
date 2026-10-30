package Week_3;
public class Skattjakten {
    //3. Skattjakten 
    // Du ska skapa en liten skattkarta med hjälp av en tvådimensionell array.

    public static void main(String[] args)  {
        // Skapa en int[][] med 3 rader och 3 kolumner. 
        int[][] skattkarta;
        skattkarta = new int[3][3];

        // Placera ut en skatt genom att sätta värdet 1 på valfri position. 
        skattkarta[0][1] = 1;
        System.out.println(skattkarta[0][1]);

        // Låt alla andra positioner ha värdet 0. (de har värdet 0 automatiskt)
        System.out.println(skattkarta[0][2]);

        // Använd två for-loopar för att skriva ut hela kartan som ett rutnät. 
        // element är en hel rad med heltal
        // tiny är ett heltal i raden
        for (int[] element : skattkarta)    {

            for (int tiny : element)   {
                System.out.print(tiny); // Print skriver ut utan att byta rad.
            }

            System.out.println(); // Println utan argument skapar bara en radbrytning.
        }

        // Bonus: Flytta skatten genom att ändra två värden i arrayen. 
        skattkarta[0][1] = 0;
        skattkarta[2][2] = 1;

        System.out.println("Nya kartan:");

        for (int[] element : skattkarta)    {

            for (int tiny : element)   {
                System.out.print(tiny); // Print skriver ut utan att byta rad.
            }

            System.out.println(); // Println utan argument skapar bara en radbrytning.
        }
    }
}