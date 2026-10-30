

public class Main2 {
    public static void main(String[] args)  {
        // Skapa en instans av Container klassen Instance som jag skapat för att hålla olika instanser av objekt
        Instance container = new Instance(); //använder den automatiskt tillhandahållna konstruktorn i klassen Instance

        //Skriv ut ljudet som instansen hund/katt av klassen Djur gör
        System.out.println("Hunden säger ");
        container.hund.gotljud();
        System.out.println("Katten säger ");
        container.katt.gotljud();

        //Skriv ut namn och antal liv som karaktären har kvar
        container.kille1.presentation();
        container.tjej1.presentation();

        //Skriv ut namn och liv med default värdet för liv
        container.kille2.presentation();
        container.tjej2.presentation();

        //Skriv ut namn och batteriprocent som roboten har
        container.ro1.visaStatus();

        //Skriv ut default värdena av instansen book1 med title, author och year
        container.book1.whichBok();

        //Skriv ut namn, age och grade för student1
        container.student1.getStudent();

        //Skriv ut de båda bilarna med dess värden
        container.bil1.whichCar();
        container.bil2.whichCar();   
        
        //Skriv ut info om de olika lamporna
        container.no1.exemplar();
        container.no2.exemplar();

        //Ändra färgen på en av lamporna
        container.no2.color = "Orange";

        //Skriv ut båda igen för att se så den ändrats
        container.no1.exemplar();
        container.no2.exemplar();

        //Skapa en tredje lampa direkt i main med den ursprungliga klassen
        Lamp no3 = new Lamp("Pink", true, 50);

        //Skapar en fjärde referensvariabel direkt i main och låter den peka på samma lampobjekt som lampa 2
        //Eftersom lampa 2 och lampa 4 refererar till samma objekt så kommer field value 
        // ändras i båda om det ändras i ett av dem.
        Lamp no4 = container.no2;

        //Skriv ut de två sista lamporna
        no3.exemplar();
        no4.exemplar();

        //Visa exempel på att lampa 2 och lampa 4 refererar till samma objekt
        // när en ändras så ändras den andra, fram tills att no4 får ett eget objekt
        // (ex. no4 = new Lamp("Orange", true, 50))
        no4.color = "Purple";

        //Testa även att ändra no1
        container.no1.color = "Gray";

        //Skriv ut alla för att se hur värdena påverkats
        container.no1.exemplar();
        container.no2.exemplar(); // Samma objekt som no4
        no3.exemplar();
        no4.exemplar(); // Samma objekt som no2

        //Skriv ut referensvärdena, här kan vi se att objektens referensrepresentationer skrivs ut 
        // och att lampa 2 och lampa 4 pekar på samma Lampobjekt.
        //Fyra referensvariabler, men bara tre lampobjekt.
        System.out.println(container.no1); //Lampobjekt 1
        System.out.println(container.no2); //Lampobjekt 2
        System.out.println(no3); //Lampobjekt 3
        System.out.println(no4); //Lampobjekt 2

        //
    }
}
