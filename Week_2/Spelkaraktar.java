public class Spelkaraktar {
    String namn;
    int liv;

    //Skapa konstruktor
    Spelkaraktar(String x, int y)   {
        this.namn = x;
        this.liv = y;
    }

    //Skapar en till konstruktor med ett default värde på liv, där man enbart behöver ange namn
    Spelkaraktar(String x)  {
        this(x, 9);
    }

    //Skapa metod
    void presentation() {
        //System.out.println(namn);
        //System.out.println(liv);
        System.out.println("Spelkaraktären " + namn + " har " + liv + " liv kvar.");

    }

}
