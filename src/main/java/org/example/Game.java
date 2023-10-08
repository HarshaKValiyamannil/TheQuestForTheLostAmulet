package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Game {
    public static void main(String[] args) {
        // Initialise the game
        Game game = new Game();
        DataLoader dataLoader = new DataLoader();
        List<Room> rooms = dataLoader.loadGameData();
        game.startGame();
    }

    public void startGame() {
        Player player = new Player();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter player name: ");
        player.setName(keyboard.nextLine());


    }
}