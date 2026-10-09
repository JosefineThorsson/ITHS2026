public class Bok {
    //Skapa field values
    String title;
    String author;
    int year;

    //Skapa konstruktor
    Bok(String x, String y, int z) {
        this.title = x;
        this.author = y;
        this.year = z;
    }

    //Skapa en parameterlös konstruktor med default värden
    Bok()   {
        this("Pippi Långstrump", "Astrid Lindgren", 1945);
    }

    //Skapa en metod
    void whichBok()    {
        //System.out.println(title);
        //System.out.println(author);
        //System.out.println(year);
        System.out.println("Boken om " + title + " skrevs av " + author + " och gavs ut år " + year + ".");

    }
}
