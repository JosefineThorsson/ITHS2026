package Week_3;
public class Player {
    // Övning 5 – Hemlig highscore 
    // Skapa en klass Player där spelarens poäng är privat och bara nås genom metoder. 

    // Skapa private int score. 
    private int score = 100;

    public static void main(String[] args)  {
        Player p1 = new Player();

        // Testa från main() att ändra och läsa spelarens score. 
        System.out.println("Poäng: " + p1.getScore());

        p1.setScore(90);

        System.out.println("Ny poäng: " + p1.getScore());
    }

    // Skapa getScore() som returnerar spelarens score. 
    int getScore()  {
        return score;
    }

    // Skapa setScore(int score) som ändrar spelarens score. 
    // Använd this.score i settern. 
    // setters brukar inte returnera något så där kan vi använda void.
    void setScore(int score) {
        this.score = score;
    }
}