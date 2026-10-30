public class Car {
    //Skapa field values
    String make;
    String model;
    int year;
    String color;

    //Skapa en konstruktor
    Car(String i, String j, int k, String l) {
        this.make = i;
        this.model = j;
        this.year = k;
        this.color = l;
    }

    //Skapa en konstruktorkedja, denna ger default värden om inga andra skrivs in
    Car()   {
        this("Volvo", "V70", 2004, "Silver");
    }

    //Skapa en metod
    void whichCar() {
        //System.out.println(make);
        //System.out.println(model);
        //System.out.println(year);
        //System.out.println(color);
        System.out.println(
            "Bilen är en "
            + make + " "
            + model + " från år "
            + year + ", och kommer i färgen "
            + color + "."
        );        
    }
}
