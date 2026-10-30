public class Instance { // En container klass för mina objekt, där deras instanser sparas

    //Djurobjekt
    Djur hund = new Djur("Wooff");
    Djur katt = new Djur("Mjauu");    

    // Spelkaraktar objekt
    Spelkaraktar kille1 = new Spelkaraktar("Carl", 7);
    Spelkaraktar tjej1 = new Spelkaraktar("Lisa", 9);    

    //Skapa nya instanser av Spelkaraktar där vi anger namn och använder default värde för liv
    Spelkaraktar kille2 = new Spelkaraktar("Emil");
    Spelkaraktar tjej2 = new Spelkaraktar("Sofia");

    // Robot objekt
    Robot ro1 = new Robot("Siri", 78.5);

    //Bokobjekt, med default värden
    Bok book1 = new Bok();    

    // Studentobjekt
    Student student1 = new Student("Josefine", 29, 9.5);    

    //Bilobjekt, med default värden
    //Skapa en instans av klassen Car med default värden
    Car bil1 = new Car();
        
    //Skapa en instans av klassen Car med andra värden
    Car bil2 = new Car("BMW","i4 M50", 2024, "Portimau Blue");

    //Lampobjekt
    Lamp no1 = new Lamp("Blue", true, 25);
    Lamp no2 = new Lamp("Yellow", false, 0);
}
