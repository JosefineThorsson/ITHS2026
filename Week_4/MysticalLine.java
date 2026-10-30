package Week_4;
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class MysticalLine {
    
    public static void main(String[] args) { 
        Queue<String> ko = new LinkedList<>(); 

        // Nedan kontrollerar först vem som står först innan den första personen betjänas.
        // När den första personen bejäntats så tas personen bort från kön och vi kontrollerar storleken på kön.
        // Samt skriver ut de som återstår i kön.
        // Queue tillåter dubletter.
        // Flera personer kan därför ha samma namn i kön.
        ko.offer("Alex"); 
 
        ko.offer("Kim"); 
        //ko.offer("Alex"); 
        ko.offer("Kim"); 
        // Utöka programmet så att en fjärde person kan ställa sig i kön.
        ko.offer("Maya");

        // Skriv sedan ut vem som står först, betjäna två personer och skriv ut vilka som är kvar.
        // Kontrollera att rätt person alltid betjänas först. 
        System.out.println("Caféet öppnar");
        System.out.println("Den som står först i kön är: " + ko.peek()); // Kontrollerar vem som står först i kön
        System.out.println("Nu har " + ko.poll() + " betjänats och därmed tagits bort från kön."); // Betjänar den som står först i kön, och tar bort personen från kön

        System.out.println("Den som nu står först i kön är: " + ko.peek()); // Kontrollerar vem som står först i kön
        System.out.println("Nu har " + ko.poll() + " betjänats och därmed tagits bort från kön."); // Betjänar den som står först i kön, och tar bort personen från kön

        System.out.println("Nu återstår " + ko.size() + " personer i kön."); // Kontrollerar hur stor återstående kö är
        System.out.println("Dessa personer står nu kvar i kön: " + ko); // Kontrollerar vilka som står kvar i kön


        // Caféet vill också ha en lista med unika medlemsnamn. En medlem ska bara registreras en gång 
        // även om personalen försöker lägga till namnet flera gånger. Skapa en separat samling som löser 
        // detta och demonstrera att den fungerar. 
        // Använder Set eftersom det inte tillåter dubletter, samt mäter unika värden.
        // Queue används för att hantera turordning.
        // List tillåter dubletter och bevarar elementens ordning.

        Set<String> medlemmar = new HashSet<>();

        medlemmar.add("Alex");
        medlemmar.add("Kim");
        medlemmar.add("Kim");
        medlemmar.add("Maya");

        System.out.println("Dessa personer är medlemmar: " + medlemmar); // Listar alla som är medlemmar, samma namn räknas en gång
        System.out.println("Antal medlemmar: " + medlemmar.size()); // Räknar antalet medlemmar

        // Skapa en List<Integer> med minst fyra poäng från caféets spel. Skriv ut poängen, sortera dem 
        // med Collections.sort() och skriv ut dem igen. Varför används Integer och inte int mellan <>? 
        // int kan inte användas på en generisk samling då det är en primitive type.
        // Integer däremot är en wrapper-klass som kan användas istället
        // när man som i detta fall behöver en referenstype objekt.
        List<Integer> poang = new ArrayList<>();

        poang.add(45);
        poang.add(30);
        poang.add(10);
        poang.add(25);

        System.out.println("Osorterad lista med poängen: " + poang); // Skriv ut osorterad lista med poängen

        Collections.sort(poang); // Sortera listan med poängen
        System.out.println("Sorterad lista med poängen: " + poang); // Skriv ut den sorterade listan med poängen
    }    
}