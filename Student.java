public class Student {
    //Skapar field values
    String name;
    int age;
    double grade;

    //Skapa konstruktor
    Student(String x, int y, double z)  {
        this.name = x;
        this.age = y;
        this.grade = z;
    }

    //Skapa metod
    void getStudent()   {
        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(grade);
        System.out.println(
            "Studenten " + name + " är " + age
            + " år gammal och har betyget "
            + grade + "."
        );
    }
}
