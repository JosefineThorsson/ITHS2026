public class Main {
    public static void main(String[] args) {
        System.out.println("Hej Klassen!");
        int age = 25; //deklarerar variabeln age som ett heltal och initierar den med värdet 25
        System.out.println(age); //skriver ut värdet av variabeln age
        age = 26; //ändrar värdet på 26
        System.out.println(age); //skriver ut nya värdet av variabeln age
        double height = 1.75; //deklarerar variabeln height som ett decimaltal och initierar den på samma rad med värdet 1.75
        System.out.println(height); //skriver ut värdet av height
        /*Kommentar
         Kommentar*/
        String name = "John"; //deklarerar variabeln name som text och initierar den med värdet John
        System.out.println(name); //skriver ut nya värdet av variabeln name
        
        boolean isStudent = false; //deklarerar variabeln isStudent som boolean och initierar den med värdet false
        System.out.println(isStudent); //skriver ut värdet av variabeln isStudent
        
        char grade = 'A'; //deklarerar variabeln grade som char och initierar den med värdet A
        System.out.print(grade); //skriver ut värdet av variabeln grade
        
        int number = 10; //deklarerar variabeln number som heltal och initierar den med värdet 10
        number++; //1 läggs till i värdet number, samma som number = number + 1
        System.out.println(number); //skriver ut värdet av variabeln number

        int a = 5; //deklarerar variabeln a som heltal och initierar den med värdet 5
        int b = 10; //deklarerar variabeln b som heltal och initierar den med värdet 10
        System.out.println(a + b); //skriver ut summan av a + b
        System.out.println(a - b); //skriver ut differensen av a - b

        int score = 10; //deklarerar variabeln score som heltal och initierar den med värdet 10
        score += 5; //5 läggs till i värdet score, samma som score = score + 5
        System.out.println(score); //skriver ut nya värdet av variabeln score

        score -= 3; //3 dras bort från värdet för variabeln score, samma som score = score - 3
        System.out.println(score); //skriver ut nya värdet av variabeln score
        
        score *= 2; //Variabeln score gångras med 2, samma som score = score * 2
        System.out.println(score); //skriver ut nya värdet av variabeln score
        
        int hej = 20; //deklarerar variabeln hej som heltal och initierar den med värdet 20
        System.out.println(hej > 18); //skriver ut true/false om värdet av variabeln hej är större än 18 eller ej
    }
}