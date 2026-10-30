package Week_4;
public class MysticalTree {
    //Övning 2 – Mystiska trädet 
    // Alla träd är träd, men olika träd kan beskrivas på olika sätt. 

    public static void main(String[] args)  {
        // Skapa objekt av Oak och Pine i main och skriv ut deras beskrivningar. 
        Oak o1 = new Oak(265.7);
        Pine p1 = new Pine(345.2);

        o1.describe();
        p1.describe();

        //Extra utmaning: Prova att skriva new Tree() – varför får du ett kompileringsfel? 
        //Tree t1 = new Tree(167.5);
        // Funkar inte att skapa objekt av typen Tree eftersom det är en abstract klass.
        
        // Om vi däremot skrivit Tree t1 = new Oak(167.5) så hade det fungerat
        // eftersom Oak ärver från Tree kan en variabel av typen Tree referera till ett Oak-objekt.

    }
}

// Skapa en abstrakt klass Tree med en instansvariabel height. 
abstract class Tree {
    double height;

    // Skapa en konstruktor
    Tree(double x)  {
        this.height = x;
    }
    // Lägg till en abstrakt metod describe(). 
    abstract void describe();
}

//Skapa klasserna Oak och Pine som ärver från Tree och implementerar
// describe() på olika sätt.
class Oak extends Tree  {


    Oak(double height)  {
        super(height);
    }

    @Override 
    void describe() {
        System.out.println("Jag är en ek och jag är " + height + " cm lång.");
    }
}

class Pine extends Tree  {

    Pine(double height) {
        super(height);
    }

    @Override 
    void describe() {
        System.out.println("Jag är en tall och jag är " + height + " cm lång.");
    }
}