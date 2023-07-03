public class MyFirstGame {
    
    public static void main(String[] args) {
        int guessedNum = 8; 
        int userNum = 33; 
        int min = 1;
        int max = 100;
        
        while (guessedNum != userNum) {
            if (userNum > guessedNum) {
                System.out.println("Число " + userNum + " больше того, что загадал компьютер");
                max = userNum;
                userNum = (min + max) / 2;
            } else {                
                System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
                if (userNum <= max) {
                    min = userNum;
                    userNum =  (max + min) / 2;
                } 
            }
        }

        System.out.println("Вы победили!");
    }
}