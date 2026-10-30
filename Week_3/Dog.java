package Week_3;
public class Dog {
    //Övning 4 - den hungriga hunden
    // Skapa en klass Dog där hundens hunger kan förändras med hjälp av metoder. 

    // Skapa instansvariabeln int hunger. 
    int hunger = 50;

    public static void main(String[] args)  {
    // Skapa ett Dog-objekt i main() och anropa metoderna med punktoperatorn. 
        
        Dog d1 = new Dog();

        d1.showHunger();
        d1.eat();
        d1.showHunger();
    }

    // Skapa metoden eat() som minskar hundens hunger. 
    void eat()   {
        
        this.hunger = hunger - 10;
        //System.out.println("Ny hungernivå efter måltid: " + hunger);
    }

    // Skapa metoden showHunger() som skriver ut hur hungrig hunden är. 
    void showHunger()  {
        //this.hunger = hunger;
        System.out.println("Hungernivå: " + hunger);
    }
}
