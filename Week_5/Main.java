package Week_5;

public class Main {
    
    public static void main(String[] args)  {

        Player p1 = new Player();

        p1.printStatus(); // Före köpet
        
        p1.buyPotion(30);

        p1.heal(20);

        p1.printStatus(); // Efter köpet

    }
}