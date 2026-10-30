package Week_3;
public class Robot2 {
    //Övning 1 - hälsningsroboten
    // Skapa en klass Robot. Roboten ska kunna hälsa när du anropar en metod. 

    public static void main(String[] args)  {
        Robot2 ro = new Robot2();

        // Anropa metoden från main(). 
        ro.halsa();

    }

    // Skapa metoden halsa(). 
    // Metoden ska skriva ut exempelvis: "Hej människa! Jag är en robot." 
    // Metoden ska inte returnera något. 
    void halsa()    {
        System.out.println("Hej människa! Jag är en robot.");
    }
}
