package Week_3;
public class Power {
    //Övning 6 – Samma metod, olika magi 
    // Skapa flera versioner av en metod med samma namn men olika parametrar. 

    public static void main(String[] args)   {
        Power p1 = new Power();

        //Anropa båda versionerna från main(). 
        p1.showPower("Superstyrka");
        p1.showPower(75);
    }

    // Skapa en metod som heter showPower(...) och tar emot en int. 
    void showPower(int power)   {
        System.out.println("Min superkraft är på: " + power + " %.");
    }

    //Skapa en annan showPower(...) som tar emot en String. 
    void showPower(String power)    {
        System.out.println("Min superkraft är: " + power);
    }
}