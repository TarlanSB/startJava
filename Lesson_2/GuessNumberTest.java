import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        System.out.println("Введите имя (первый игрок)");
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя (второй игрок)");
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);

        String option = ""; 

        while (!option.equals("no")) {
            game.start();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.next().toLowerCase();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}