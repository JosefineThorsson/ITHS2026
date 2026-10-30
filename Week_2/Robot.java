public class Robot {
    //Skapa fields
    public String namn;
    public double batteri; //skulle egentligen va private men vi har inte lärt oss hur vi använder private fields än.

    //Skapa konstruktor
    Robot(String x, double y)   {
        this.namn = x;
        this.batteri = y;
    }

    //Skapa metod
    void visaStatus()   {
        //System.out.println(namn);
        //System.out.println(batteri);
        System.out.println("Roboten heter " + namn + " och har " + batteri + " % batteri kvar.");
    }
}
