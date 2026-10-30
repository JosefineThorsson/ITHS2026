package Week_3;
public class Superhero {
    //Övning 3 - Superhjältekraft
    // En superhjälte har olika egenskaper som tillsammans avgör hur stark hjälten är. 

    public static void main(String[] args) {
        // Anropa metoden från main() och skriv ut resultatet. 

        Superhero sh = new Superhero();
        sh.powerLevel(5, 10, 0);

        System.out.println("Styrka: " + sh.powerLevel(5, 0, 0));
        System.out.println("Snabbhet: " + sh.powerLevel(0, 10, 0));
        System.out.println("Intelligens: " + sh.powerLevel(0, 0, 110));
    }

    // Skapa metoden powerLevel(int strength, int speed).
    // Metoden ska returnera strength + speed. 
    // Bonus: Lägg till en tredje parameter, exempelvis intelligence, och låt den också påverka resultatet. 
    int powerLevel(int strength, int speed, int intelligence) {
        return strength + speed + intelligence;
    }
}