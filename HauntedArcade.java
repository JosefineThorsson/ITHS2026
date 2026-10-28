// Gruppövning: Clean Code

public class HauntedArcade {
    public static void main(String[] args) {

        playerValues.removeEnergy(30);

        playerValues.addScore(true);

        scoreCheck(playerValues.playerScore);

        playerValues.printValues();
    }

    /** Checks if the score is big enough to trigger a special event */
    static void scoreCheck(int scoreToCheck) {
        int scoreOverflow = 100;
        if (scoreToCheck >= scoreOverflow) {
            System.out.println("BONUS ROOM UNLOCKED!");
            // But then nothing happens??? ^ this should not be announced before something
            // will actually trigger, confusing and bad user experience.
        }
    }

    /**
     * Contains some variables and methods primarily about player score and energy
     */
    class playerValues {
        static String playerName = "Nova";
        static int playerEnergy = 70;
        static int playerScore = 40;

        /**
         * Removes energyRemovalAmount of energy from playerValues.playerEnergy,
         * player energy is always atleast 0 and never negative
         */
        static void removeEnergy(int energyRemovalAmount) {
            playerEnergy -= energyRemovalAmount;

            if (playerEnergy < 0) {
                playerEnergy = 0;
            }
        }

        /**
         * Adds a an ammount of energy to playerValues.playerEnergy,
         * if greaterScoreAddition is true the ammount will be bigger
         * else it will be smaller
         */
        static void addScore(boolean greaterScoreAddition) {
            int biggerScoreAddition = 50;
            int smallerScoreAddition = 10;

            if (greaterScoreAddition) {
                playerScore += biggerScoreAddition;
            } else {
                playerScore += smallerScoreAddition;
            }
        }

        /** Prints out most of the player values in playerValues */
        static void printValues() {
            System.out.println(
                    playerValues.playerName
                            + " | energy = " + playerValues.playerEnergy
                            + " | score = " + playerValues.playerScore);
        }
    }
}