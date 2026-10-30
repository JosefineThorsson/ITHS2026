public class Exercise0510 {
    public static void main(String[] args)  {
        //1. Code blocks & Scope
        //Ett kodblock som omges av { }
        //Variabler som skapas inne i ett block finns bara i det blockets scope.

        /* Skapa en variabel inne i ett kodblock och testa vad som händer om du 
        försöker använda den utanför blocket.  */
        {
            int maxCount = 10;
            System.out.println("maxCount inne i blocket = " + maxCount);
        }
        //maxCount = 15;
        // Blir ett felmeddelande om jag skriver variabeln utanför scopet
        //"maxCount cannot be resolved to a variable"


        //2. IF
        //Ett if-block körs bara om villkoret är true

        /*Gör ett program som skriver ut ett meddelande om ett tal är större än 10.  */
        int i = 15;
        if (i > 10) {
            System.out.println(i + " är större än 10");
            i--;
        }

        //3. IF / ELSE
        //if körs om villkoret är true.
        //else körs om villkoret är false.
         int temperature = 8;

        if (temperature >= 15) {
            System.out.println("Det är ganska varmt ute.");
        } else {
            System.out.println("Det är ganska kallt ute.");
        }


        /*Gör ett program som kontrollerar om en person är 18 år eller äldre.  */
        //int  age = 19; //myndig
        int age = 17; //omyndig
        
        if (age >= 18)  {
            System.out.println("Du är " + age + " år, och är myndig.");
        } else  {
            System.out.println("Du är " + age + " år, och är inte myndig.");
        }

        //4. IF / ELSE IF / ELSE
        // Java testar villkoren uppifrån och ner.
        // När ett villkor blir true körs det blocket och resten hoppas över.

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Poäng: " + testScore);
        System.out.println("Betyg: " + grade);

        /*Gör ett program som skriver ut olika meddelanden beroende 
        på om ett tal är litet, mellan eller stort.  */
        //int tal = 0; //ogitligt tal
        //int tal = 5; //litet tal
        //int tal = 50; //mellan tal
        int tal = 457; //stort tal

        if (tal >= 100) {
            System.out.println("Talet " + tal + " är stort.");

        } else if (10 <= tal && tal < 100) {
            System.out.println("Talet " + tal + " är mellan.");

        } else if (0 < tal && tal < 10)    {
            System.out.println("Talet " + tal + " är litet.");

        } else {
            System.out.println("Talet " + tal + " är ogiltigt.");
        }

        //5. SWITCH
        // Switch passar bra när ett värde ska jämföras med flera bestämda fall.
        // break avslutar det aktuella case-blocket.

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Ogiltig dag.");
        }
        
        /*Låt ett tal mellan 1 och 3 motsvara tre olika alternativ 
        och skriv ut rätt alternativ. */
        int number = 2;
        String alternativ;

        switch (number) {
            case 1 :
                alternativ = "Hej";
                System.out.println(alternativ);
                break;
            case 2 :
                alternativ = "Vi ses";
                System.out.println(alternativ);
                break;
            case 3 :
                alternativ = "Hejdå";
                System.out.println(alternativ);
                break;
        }

        //6. WHILE
        //En while-loop fortsätter sålänge villkoret är true.
        //Villkoret kontrolleras INNAN varje varv.

        /*Skriv ut talen 1 till 5 med en while-loop.  */
        int j = 1;

        while (j <= 5) {
            System.out.println("1a: Talet är " + j);
            j++; // Viktigt: värdet måste förändras så att loopen kan avslutas.
        }

        //7. WHILE + BREAK
        //while (true) är en loop vars villkor alltid är true.
        //break kan användas för att avsluta loopen.


        /*Gör en loop som avbryts när räknaren når ett visst tal.  */
        int count = 1;

        while (true)    {
            System.out.println("2a: Talet är " + count);

            if (count == 5)  {
                break;
            }
            count++;
        }

        //8. DO-WHILE
        // En do-while-loop kör kodblocket först och testar villkoret efteråt.
        // Därför körs blocket alltid minst en gång.

        /*Skriv ut ett meddelande minst en gång med en do-while-loop.  */
        int num = 1;

        do  {
            System.out.println("3e: Talet är " + num);
            num++;
        } while (num <= 5);

        //9. FOR
        // En for-loop består av tre delar:
        // 1. initialization    ->  int j2 = 1
        // 2. condition ->  j2 < 5
        // 3. incrementor   ->  j2++

        for (int j2 = 1; j2 < 5; j2++) {
            System.out.println("j2 = " + j2);
        }

        // Variabeln j finns bara inne i for-loopens scope.
        // Detta hade därför gett kompileringsfel eftersom den ligger utanför scopet:
        // System.out.println(j2);

        /*Skriv ut talen 1 till 10 med en for-loop.  */
        for (int k = 1; k <= 10; k++)   {
            System.out.println("4e: Talet är " + k);
        }


        // 10. CONTINUE
        // continue avbryter den AKTUELLA iterationen.
        // och går direkt vidare till nästa iteration.

        /*Gör en loop som hoppar över ett visst tal.  */
        for (int k2 = 1; k2 < 25; k2++) { // den hoppar över alla udda tal upp till 24
            if (k2 % 2 != 0)    {
                continue;
            }
            System.out.println("Talet " + k2 + " är jämnt delbart med 2.");
        }


        //11. BREAK & CONTINUE TILLSAMMANS
        // break = avsluta hela loopen.
        // continue = hoppa över resten av det aktuella varvet.

        for (int value = 1; value <= 10; value++)   {

            // om talet är 5 så skriver vi ut att vi hoppar över 5
            if (value == 5) { 
                System.out.println("Hoppar över " + value + ".");
                continue;
            }

            // om talet är 9 så skriver vi ut att vi avslutar loopen, den går aldrig till talet 10.
            if (value == 9) { 
                System.out.println("Avslutar loopen vid " + value + ".");
                break;
            }

            // är talet jämnt delbart med 2?
            if (value % 2 == 0) { 
                System.out.println(value + " är jämnt.");

            // om talet inte är jämnt delbart med 2
            } else  { 
                System.out.println(value + " är udda.");
            }
        }

    }
}
