public class Lamp {
    //Skapa tre stycken field values med olika types
    String color;
    boolean isOn;
    int brightness;

    //Skapa en konstruktor
    Lamp(String x, boolean y, int z)    {
        this.color = x;
        this.isOn = y;
        this.brightness = z;
    }

    //Skapa en till konstruktor med rimliga default värden
    Lamp()  {
        this("White", false, 0);
    }

    //Skapa metod
    void exemplar() {
        //System.out.println(color);
        //System.out.println(isOn);
        //System.out.println(brightness);
        System.out.println("Lampan har färgen " + color + ", lampan är på: " + isOn + ", och har därför en ljushet på " + brightness + " %.");

    }
}
