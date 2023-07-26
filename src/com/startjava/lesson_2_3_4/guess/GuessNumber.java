package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    public String playerName1;
    public String playerName2;

    public GuessNumber(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток");
        int guessedNum = 1 + (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int indexStoragePlayer1 = 0;
        int indexStoragePlayer2 = 0;
        int numberFirstPlayer = 0;
        int numberSecondPlayer = 0;


        while (true) {
            if (numberFirstPlayer == guessedNum || numberSecondPlayer == guessedNum || indexStoragePlayer1 > 8) {
                output(indexStoragePlayer1, indexStoragePlayer2);
                break;
            }
            System.out.println(playerName1 + " введите число");
            numberFirstPlayer = scanner.nextInt();
            gameLogic(player1, indexStoragePlayer1, numberFirstPlayer, guessedNum);
            indexStoragePlayer1++;

            if (numberFirstPlayer != guessedNum) {
                System.out.println(playerName2 + " введите число");
                numberSecondPlayer = scanner.nextInt();
                gameLogic(player2, indexStoragePlayer2, numberSecondPlayer, guessedNum);
                indexStoragePlayer2++;
            }
        }
    }

    public void output(int index1, int index2) {
        int[] copyStoragePlayer1 = Arrays.copyOf(player1.getStorage(), index1);
        int[] copyStoragePlayer2 = Arrays.copyOf(player2.getStorage(), index2);

        System.out.println("Названные числа игрока " + playerName1 + ": "
                + Arrays.toString(copyStoragePlayer1).replaceAll("[\\[\\],]", "")
                + "\nназванные числа игрока " + playerName2 + ": "
                + Arrays.toString(copyStoragePlayer2).replaceAll("[\\[\\],]", ""));
        Arrays.fill(player1.getStorage(), 0);
        Arrays.fill(player2.getStorage(), 0);
    }

    public void gameLogic(Player player, int indexStorage, int playerNumber, int guessedNum) {
        player.setStorage(indexStorage, playerNumber);

        if (playerNumber == guessedNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + guessedNum
                    + " с " + (++indexStorage) + " попытки");
        } else if (playerNumber > guessedNum) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }

        if (indexStorage > 8) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }
}

