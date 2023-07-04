public class MyFirstGame {
    
    public static void main(String[] args) {
        int guessedNum = 8; 
        int playerNum = 33; 
        int min = 1;
        int max = 100;
        
        while (guessedNum != playerNum) {
            if (playerNum > guessedNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                max = playerNum;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                min = playerNum;
            }
            playerNum = (min + max) / 2;
        }

        System.out.println("Вы победили!");
    }
}