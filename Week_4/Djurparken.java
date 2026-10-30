package Week_4;
public class Djurparken {
    //Övning 1 – Djurparken 
    // I djurparken finns flera sorters djur.
    public static void main(String[] args)  {
        // Skapa ett Dog-objekt och ett Cat-objekt i main
        // och anropa makeSound() på båda. 
        Dog1 dog = new Dog1("Buster");
        Cat1 cat = new Cat1("Maya");
        Horse1 horse = new Horse1("Blixten");

        dog.makeSound();
        cat.makeSound();
        horse.makeSound();
    }
}

// Skapa en klass Animal med en instansvariabel name
// och en konstruktor som tar emot ett namn. 
// Skapa en metod makeSound() i Animal.
// Låt Dog och Cat skriva över den så att de låter olika.

class Animal   {
    String name;

    Animal(String x)    {
        this.name = x;
    }

    void makeSound()    {
        System.out.println("Djuret gör ifrån sig ett ljud.");
    }
}

// Skapa klasserna Dog och Cat som ärver från Animal med extends. 
// Ge båda klasserna en konstruktor som använder super(name). 
class Dog1 extends Animal    {
    Dog1(String name)   {
        super(name);
    }

    @Override
    void makeSound()    {
        System.out.println("Hunden " + name + " säger wooff!");
    }
}

class Cat1 extends Animal    {
    Cat1(String name)    {
        super(name);
    }

    @Override
    void makeSound()    {
        System.out.println("Katten " + name + " säger mjauu!");
    }
}

// Extra utmaning: Skapa ytterligare en djurklass som ärver från Animal. 
class Horse1 extends Animal {
    Horse1(String name) {
        super(name);
    }

    @Override
    void makeSound()    {
        System.out.println("Hästen " + name + " säger gnägg!");
    }    
}