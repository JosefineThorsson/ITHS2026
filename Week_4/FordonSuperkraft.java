public class FordonSuperkraft {
    //Övning 3 – Fordon med superkrafter 
    // Olika typer av fordon kan ha samma förmåga. 

    public static void main(String[] args)  {
        //Skapa båda objekten i main och anropa drive().
        Car1 c1 = new Car1();
        Bicycle1 b1 = new Bicycle1();
        Scooter1 s1 = new Scooter1();

        c1.drive();
        b1.drive();
        s1.drive();

        //Skapa en metod startTrip(Drivable vehicle) som anropar vehicle.drive().
        // Testa med både Car och Bicycle. 
        // EFtersom alla tre klasser implementerar Drivable så kan alla använda samma metod
        System.out.println("Anropar startTrip metoden:");

        startTrip(c1);
        startTrip(b1);
        startTrip(s1);
    }

    // Skapar metoden (behöver skapas inom klassen men utanför main)
    static void startTrip(Drivable vehicle) {
        vehicle.drive();
    }
}

// Skapa ett interface Drivable med metoden drive(). 
interface Drivable    {

    void drive();
}

// Skapa klasserna Car och Bicycle som implementerar Drivable. 
// Skriv olika utskrifter i respektive drive()-metod. 
class Car1 implements Drivable   {

    @Override 
    public void drive()    {
        System.out.println("Jag kör en bil.");
    }
}

class Bicycle1 implements Drivable   {

    @Override 
    public void drive()    {
        System.out.println("Jag kör en cykel.");
    }
}

//Extra utmaning: Skapa ytterligare en klass Scooter som också implementerar Drivable. 
class Scooter1 implements Drivable   {

    @Override 
    public void drive()    {
        System.out.println("Jag kör en scooter.");
    }
}