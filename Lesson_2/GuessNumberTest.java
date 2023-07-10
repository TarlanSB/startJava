import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Введите имя (первый игрок)");
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя (второй игрок)");
        scanner = new Scanner(System.in);
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);

        while (true) {
            game.start();

            String carryOn = ""; 

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                carryOn = scanner.next().toLowerCase();

                if (carryOn.equals("no")) {
                    return;
                }

            } while (!carryOn.equals("yes"));
        }
    }
}