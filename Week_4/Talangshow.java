public class Talangshow {
    //Övning 4 – Djurens talangshow 
    // Nu kombinerar du arv, interface och polymorfism. 

    public static void main(String[] args)  {
        // Skapa objekten i main och spara dem i variabler av typen Animal.
        // Anropa makeSound() på båda. 
        Dog2 d2 = new Dog2("Wilma");
        Cat2 c2 = new Cat2("Nisse");

        // Skapa referenser av typen Animal1
        Animal1 animalDog = d2;
        Animal1 animalCat = c2;

        // Anropa metoder genom Animal1
        animalDog.makeSound();
        animalCat.makeSound();

        // Anropa metoder genom Playable
        showTalent(d2);
        showTalent(c2);
    }

    // Skapa en metod showTalent(Playable participant) som anropar play().
    static void showTalent(Playable participant) {
        participant.play();
    }
}

// Skapa en abstrakt klass Animal med en abstrakt metod makeSound(). 
abstract class Animal1   {
    String name;

    Animal1(String x)    {
        this.name = x;
    }

    abstract void makeSound();
}

// Skapa interfacet Playable med metoden play().
interface Playable  {

    void play();
}

// Skapa Dog och Cat som ärver från Animal. Låt minst Dog implementera Playable. 
// Extra utmaning: Låt även Cat implementera Playable och testa samma metod med båda. 
class Dog2 extends Animal1 implements Playable  {

    Dog2(String name)   {
        super(name);
    }

    @Override
    void makeSound()    {
        System.out.println("Hunden " + name + " säger wooff!");
    }

    @Override 
    public void play()    {
        System.out.println("Hunden leker med en boll.");
    }
}

class Cat2 extends Animal1 implements Playable  {

    Cat2(String name)   {
        super(name);
    }

    @Override
    void makeSound()    {
        System.out.println("Katten " + name + " säger mjauu!");
    }    

    @Override 
    public void play()    {
        System.out.println("Katten leker med ett garnystan.");
    }
}