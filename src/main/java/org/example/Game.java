package org.example;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Initialise the game
        Game game = new Game();
        DataLoader dataLoader = new DataLoader();
        dataLoader.loadRoomsData();
        game.startGame();
    }

    public void startGame() {
        Player player = new Player();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter player name: ");
        player.setName(keyboard.nextLine());
    }
}