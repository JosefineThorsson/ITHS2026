package Week_5;

public class CodeDetective {
    // 1. Koddetektiven - vad betyder egentligen x? 
    // Koden fungerar, men namnen berättar nästan ingenting.
    // Byt namn på variablerna så att koden 
    // blir begriplig utan extra kommentarer. 
    
    public static void main(String[] args)  {
        String kundNamn = "Mira"; 
        int antalDrycker = 3; 
        double prisPerDryck = 30.0; 
        double totalPris = antalDrycker * prisPerDryck; 

        System.out.println(kundNamn + " köper drycker för " + totalPris + " kr."); 
    }
}